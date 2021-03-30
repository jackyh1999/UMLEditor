package controller.mode;

import java.util.ArrayList;

import controller.object.MyObject;
import controller.object.Port;

public class Mode_select extends Mode{
	
	//private ObjectListener ol = new ObjectListener();
	private ArrayList<Port> port_list = new ArrayList<Port>();
	
	@Override 
	public void CanvasClicked() {
		Unselect();
	}
	
	@Override
	public void ObjectClicked(MyObject mo) {
		
		Unselect();
		
		for(int i=0;i<4;i++) {
			mo.port[i].setEnabled(true);
			port_list.add(mo.port[i]);
		}
		
		//mo.setVisible(false);
		System.out.println("Object Selected");
	}
	
	@Override
	public void Initialize() {
		/*
		for(Object_class oc : MyCanvas.class_list) {			
			oc.addMouseListener(ol);
		}
		for(Object_usecase ou : MyCanvas.usecase_list) {			
			ou.addMouseListener(ol);
		}
		*/
	}
		
	public void Unselect() {
		for(Port p : port_list) {
			p.setEnabled(false);
		}
		port_list.clear();
	}
}
