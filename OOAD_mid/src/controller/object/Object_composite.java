package controller.object;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import controller.mode.Mode_select;

public class Object_composite extends MyObject implements MouseListener{
	
	//public static List<Object_composite> composite_list = new ArrayList<Object_composite>(); 
	
	//public List<MyObject> grouped_object = new ArrayList<MyObject>();
	
	
	public Object_composite() {
		this.addMouseListener(this);
		//this.member_list = new ArrayList<MyObject>();
		MyObject.object_list.add(this);
		//System.out.println("new group.");
	}
	/*
	@Override
	public void Select() {	
		//System.out.println("Group selected.");
		for(MyObject mo : member_list) {
			//System.out.println(mo);
			for(int i=0;i<4;i++) {
				mo.port[i].setEnabled(true);
				//mo.port[i].setVisible(true);
				Object_port.port_list.add(mo.port[i]);
			}
		}			
		Mode_select.selected_list.add(this);
	}
	 */
	/*
	@Override
	public void Move() {
		for(MyObject mo : member_list) {
			//System.out.println(mo);
			for(int i=0;i<4;i++) {
				mo.port[i].setLocation(getMousePosition());
				//mo.port[i].setVisible(true);
				//Object_port.port_list.add(mo.port[i]);
			}
			mo.setLocation(getMousePosition());
		}			
		Mode_select.selected_list.add(this);
	}
	*/
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
