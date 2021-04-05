package controller.mode;

import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import controller.object.MyObject;
import controller.object.Object_composite;
import controller.object.Object_member;
import controller.object.Object_port;
import scene.GUI;
import scene.MyCanvas;

public class Mode_select extends Mode{	
	
	public static List<MyObject> selected_list = new ArrayList<MyObject>();
	int mouse_begin_x;
	int mouse_begin_y;
	
	@Override
	public void Initialize() {
		
	}
	
	@Override 
	public void CanvasClicked() {
		Unselect();
	}
	
	@Override
	public void ObjectClicked(MyObject mo) {
		
		Unselect();
		//selected_list.add(mo);
		mo.Select();	
		
	}
	
	public void ObjectPressed(MyObject mo) {
		//mouse_begin_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x;
		//mouse_begin_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y;
		mo.StartMove();
	}
	
	@Override
	public void ObjectDragged(MyObject mo) {
		mo.Move();
		//System.out.println("Drag");
	}
	
	public void ObjectReleased() {
		
	}
	
	@Override
	public void CanvasReleased() {
		Unselect();
		for(MyObject mo : MyObject.object_list) {
			//System.out.println(mo.x+)
			if( IsInSelectRange(mo) )
					
			{
				System.out.println("Object selected.");
				mo.Select();
				//selected_list.add(mo);
				//Select(mo);
			}
		}
		
	}
		
	public void Unselect() {
		for(Object_port p : Object_port.port_list) {
			p.setEnabled(false);
		}
		Object_port.port_list.clear();
		selected_list.clear();
	}
	
	@Override
	public void Group() {
		Object_composite oc = new Object_composite();
		for(MyObject mo : selected_list) {
			mo.group = oc;
			oc.member_list.add(mo);
			MyObject.object_list.remove(oc);
		}
		
		//oc.grouped_object = selected_list;
		//for(MyObject mo : oc.grouped_object) System.out.println(mo);
		selected_list.clear();
	}
	
	@Override
	public void UnGroup() {
		//System.out.println("Ungrouped");
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
		/*
		Rectangle r1 = new Rectangle( Math.min(MyCanvas.mouse_begin_x, MyCanvas.mouse_end_x), 
									  Math.min(MyCanvas.mouse_begin_y, MyCanvas.mouse_end_y),
									  Math.abs(MyCanvas.mouse_end_x - MyCanvas.mouse_begin_x),
									  Math.abs(MyCanvas.mouse_end_y - MyCanvas.mouse_begin_y));
		*/
		Rectangle r1 = MyCanvas.fill_rect;
		Rectangle r2 = new Rectangle(mo.x, mo.y, mo.width, mo.height);
		
		if(	r1.contains(r2)	) return true;
		else return false;
		
	}
	
}
