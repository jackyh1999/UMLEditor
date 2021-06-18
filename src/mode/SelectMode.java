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
		
		// 若選取到物件，則記錄該物件
		// 紀錄當前滑鼠座標
		currX = pressedX = e.getX();
		currY = pressedY = e.getY();
		obj = chooseObject(pressedX, pressedY);
	}
	
	@Override
	public void handleCanvasDragged(MouseEvent e) {
		
		drag = true;
		
		// 根據Press時的狀態，決定要選取還是移動
		// 選取: 讓Canvas繪製選取框
		if(obj == null) {
			Rectangle r = calculateSelectRange(e.getX(),e.getY());
			Canvas.getInstance().setSelectRange(r);
		}
		
		// 移動: 移動Press到的物件
		else {
			obj.move(e.getX()-currX, e.getY()-currY);
			currX = e.getX();
			currY = e.getY();
		}
	}
	
	@Override
	public void handleCanvasReleased(MouseEvent e) {
		
		// 根據Press和Drag的狀態，決定Release的行為
		// 沒有Press到物件
		if(obj == null) {
			// 有Drag行為，表示進行範圍選取
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
			// 沒有Drag行為，表示取消選取
			else {
				unSelectAll();
			}
		}
		// 有Press到物件
		else {
			// 有Drag行為，表示移動結束
			if(drag) {
				drag = false;
			}
			// 沒有Drag行為，表示選取單一物件
			else {
				unSelectAll();
				select(obj);
			}
		}
	}
	
	// 選取單一物件，並將該物件加入selected list當中
	private void select(MyObject obj) {
		obj.setSelect(true);
		ObjectController.getInstance().getSelectedList().add(obj);
	}
	
	// 取消選取所有物件，並將selected list清空
	private void unSelectAll() {
		for(MyObject obj : ObjectController.getInstance().getSelectedList()) {
			obj.setSelect(false);
		}
		ObjectController.getInstance().getSelectedList().clear();
	}
	
	// 計算選取框的大小
	private Rectangle calculateSelectRange(int currX, int currY) {
		int x = Math.min(pressedX, currX);
		int y = Math.min(pressedY, currY);
		int width = Math.abs(pressedX - currX);
		int height = Math.abs(pressedY - currY);
		Rectangle r = new Rectangle(x, y, width, height);
		return r;
	}
	
}
