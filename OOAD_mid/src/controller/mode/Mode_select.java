package controller.mode;

import java.util.ArrayList;
import java.util.List;

import controller.object.MyObject;
import controller.object.Object_composite;
import controller.object.Object_member;
import controller.object.Object_port;
import scene.MyCanvas;

public class Mode_select extends Mode{	
	
	public List<MyObject> selected_list = new ArrayList<MyObject>();
	
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
	
	@Override
	public void CanvasReleased() {
		
		for(MyObject mo : MyObject.object_list) {
			//System.out.println(mo.x+)
			if( mo.x > MyCanvas.mouse_begin_x &&
				mo.y > MyCanvas.mouse_begin_y &&
				mo.x + MyObject.width  < MyCanvas.mouse_end_x &&
				mo.y + MyObject.height < MyCanvas.mouse_end_y) 
			{
				//System.out.println("Object selected.");
				mo.Select();
				selected_list.add(mo);
				//Select(mo);
			}
		}
		
	}
		
	public void Unselect() {
		for(Object_port p : Object_port.port_list) {
			p.setEnabled(false);
		}
		Object_port.port_list.clear();
	}
	
	@Override
	public void Group() {
		Object_composite oc = new Object_composite();
		for(MyObject mo : selected_list) {
			mo.group = oc;
			oc.grouped_object.add(mo);
		}
		//oc.grouped_object = selected_list;
		//for(MyObject mo : oc.grouped_object) System.out.println(mo);
		selected_list.clear();
	}
	
	public void UnGroup() {
		
	}
	
	
}
