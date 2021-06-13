package mode;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import model.object.MyObject;
import scene.Canvas;

public class SelectMode extends Mode{	
	
	boolean selectRange;
	private int selectRangeX;
	private int selectRangeY;
	
	@Override
	public void handleCanvasClicked(MouseEvent e) {
		unSelect();
		MyObject obj = chooseObject(e.getX(), e.getY());
		if(obj != null) {
			obj.setSelect(true);
		}
	}
	
	@Override
	public void handleCanvasPressed(MouseEvent e) {
		MyObject obj = chooseObject(e.getX(), e.getY());
		if(obj == null) {
			selectRange = true;
			selectRangeX = e.getX();
			selectRangeY = e.getY();
			Rectangle r = new Rectangle(selectRangeX, selectRangeY, 0, 0);
			Canvas.getInstance().setSelectRange(r);
		}
	}
	
	@Override
	public void handleCanvasDragged(MouseEvent e) {
		if(selectRange) {
			int x = Math.min(selectRangeX, e.getX());
			int y = Math.min(selectRangeY, e.getY());
			int width = Math.abs(selectRangeX - e.getX());
			int height = Math.abs(selectRangeY - e.getY());
			Rectangle r = new Rectangle(x, y, width, height);
			Canvas.getInstance().setSelectRange(r);
		}
	}
	
	@Override
	public void handleCanvasReleased(MouseEvent e) {
		if(selectRange) {	
			unSelect();
			int x = Math.min(selectRangeX, e.getX());
			int y = Math.min(selectRangeY, e.getY());
			int width = Math.abs(selectRangeX - e.getX());
			int height = Math.abs(selectRangeY - e.getY());
			Rectangle r = new Rectangle(x, y, width, height);
			for(MyObject obj : Canvas.getInstance().getObjectList()) {
				if(obj.isInside(r)) obj.setSelect(true);
			}
			//selectRangeX = 0;
			//selectRangeY = 0;
			r = new Rectangle(0, 0, 0, 0);
			Canvas.getInstance().setSelectRange(r);
			selectRange = false;
		}
	}
	
	private void unSelect() {
		for(MyObject obj : Canvas.getInstance().getObjectList()) {
			obj.setSelect(false);
		}
	}
	
	/*
	private static Mode selectMode;
	
	private SelectMode() {
		
	}
	
	public static Mode getInstance() {
		if(selectMode == null) selectMode = new SelectMode();
		return selectMode;
	}
	*/
	
	/*
	public static List<MyObject> selected_list = new ArrayList<MyObject>();
	int mouse_begin_x;
	int mouse_begin_y;
	
	@Override
	public void Initialize() {
		
	}
	
	@Override 
	public void CanvasClicked(MouseEvent e) {
		Unselect();
	}
	
	@Override
	public void ObjectClicked(MyObject mo, MouseEvent e) {
		Unselect();
		mo.Select();			
	}
	
	@Override
	public void ObjectPressed(MyObject mo, MouseEvent e) {
		mo.StartMove();
	}
	
	@Override
	public void ObjectDragged(MyObject mo) {
		mo.Move();
		GUI.main_canvas.repaint();
	}
	
	@Override
	public void ObjectReleased(MyObject mo, MouseEvent e) {
		GUI.main_canvas.repaint();
	}
	
	@Override
	public void CanvasReleased() {
		Unselect();
		for(MyObject mo : MyObject.object_list) {
			if( IsInSelectRange(mo) )				
			{
				mo.Select();
			}
		}
		
	}
		
	public void Unselect() {
		for(MyObject_Port p : MyObject_Port.port_list) {
			p.setEnabled(false);
		}
		MyObject_Port.port_list.clear();
		selected_list.clear();
	}
	
	@Override
	public void Group() {
		MyObject_CompositeObject oc = new MyObject_CompositeObject();
		for(MyObject mo : selected_list) {
			mo.group = oc;
			oc.member_list.add(mo);
			MyObject.object_list.remove(oc);
		}
		selected_list.clear();
	}
	
	@Override
	public void UnGroup() {
		MyObject grouped_object = selected_list.get(0);
		MyObject.object_list.remove(grouped_object);
		for(MyObject mo : grouped_object.member_list) {
			mo.group = null;
			MyObject.object_list.add(mo);
		}
		selected_list.remove(0);
	}
	
	
	public void ChangeName() {	
		GUI.change_name_window.setVisible(true);
		GUI.change_name_window.setEnabled(true);	
	}
	
	public Boolean IsInSelectRange(MyObject mo) {
		Rectangle r1 = MyCanvas.range_rect;
		Rectangle r2 = new Rectangle(mo.GetX(), mo.GetY(), mo.GetWidth(), mo.GetHeight());	
		if(	r1.contains(r2)	) return true;
		else return false;		
	}
	*/
}
