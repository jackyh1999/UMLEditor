package mode;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import controller.ObjectController;
import model.object.MyObject;
import scene.Canvas;

public class SelectMode extends Mode{	

	private MyObject obj;
	private boolean drag;
	private int pressedX;
	private int pressedY;
	private int currX;
	private int currY;
	
	@Override
	public void handleCanvasPressed(MouseEvent e) {
		
		// �Y����쪫��A�h�O���Ӫ���
		// ������e�ƹ��y��
		currX = pressedX = e.getX();
		currY = pressedY = e.getY();
		obj = chooseObject(pressedX, pressedY);
	}
	
	@Override
	public void handleCanvasDragged(MouseEvent e) {
		
		drag = true;
		
		// �ھ�Press�ɪ����A�A�M�w�n����٬O����
		// ���: ��Canvasø�s�����
		if(obj == null) {
			Rectangle r = calculateSelectRange(e.getX(),e.getY());
			Canvas.getInstance().setSelectRange(r);
		}
		
		// ����: ����Press�쪺����
		else {
			obj.move(e.getX()-currX, e.getY()-currY);
			currX = e.getX();
			currY = e.getY();
		}
	}
	
	@Override
	public void handleCanvasReleased(MouseEvent e) {
		
		// �ھ�Press�MDrag�����A�A�M�wRelease���欰
		// �S��Press�쪫��
		if(obj == null) {
			// ��Drag�欰�A��ܶi��d����
			if(drag) {
				drag = false;
				unSelectAll();
				
				Rectangle r = calculateSelectRange(e.getX(),e.getY());
				for(MyObject obj : Canvas.getInstance().getObjectList()) {
					if(obj.isInside(r)) select(obj);
				}
				
				r = new Rectangle(0, 0, 0, 0);
				Canvas.getInstance().setSelectRange(r);
			}
			// �S��Drag�欰�A��ܨ������
			else {
				unSelectAll();
			}
		}
		// ��Press�쪫��
		else {
			// ��Drag�欰�A��ܲ��ʵ���
			if(drag) {
				drag = false;
			}
			// �S��Drag�欰�A��ܿ����@����
			else {
				unSelectAll();
				select(obj);
			}
		}
	}
	
	// �����@����A�ñN�Ӫ���[�Jselected list��
	private void select(MyObject obj) {
		obj.setSelect(true);
		ObjectController.getInstance().getSelectedList().add(obj);
	}
	
	// ��������Ҧ�����A�ñNselected list�M��
	private void unSelectAll() {
		for(MyObject obj : ObjectController.getInstance().getSelectedList()) {
			obj.setSelect(false);
		}
		ObjectController.getInstance().getSelectedList().clear();
	}
	
	// �p�����ت��j�p
	private Rectangle calculateSelectRange(int currX, int currY) {
		int x = Math.min(pressedX, currX);
		int y = Math.min(pressedY, currY);
		int width = Math.abs(pressedX - currX);
		int height = Math.abs(pressedY - currY);
		Rectangle r = new Rectangle(x, y, width, height);
		return r;
	}
	
}
