package controller.object;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class Object_composite extends MyObject implements MouseListener{
	
	public static List<Object_composite> composite_list = new ArrayList<Object_composite>(); 
	
	public List<MyObject> grouped_object = new ArrayList<MyObject>();
	
	
	public Object_composite() {
		this.addMouseListener(this);
		System.out.println("new group.");
	}

	@Override
	public void Select() {	
		System.out.println("Group selected.");
		for(MyObject mo : grouped_object) {
			System.out.println(mo);
			for(int i=0;i<4;i++) {
				mo.port[i].setEnabled(true);
				//mo.port[i].setVisible(true);
				Object_port.port_list.add(mo.port[i]);
			}
		}				
	}

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
