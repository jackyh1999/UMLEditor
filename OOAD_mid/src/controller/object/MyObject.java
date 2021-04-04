package controller.object;

import java.awt.Image;
import java.awt.MouseInfo;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.mode.Mode_select;
import scene.MyCanvas;


// Change to extend JPanel
public class MyObject extends JLabel{
	
	public final int width = 150;
	public final int height = 100;
	public int x;
	public int y;
	
	public static int abs_mouse_x;
	public static int abs_mouse_y;
	//private int rel_mouse_x;
	//private int rel_mouse_y;
	public static int dist_x;
	public static int dist_y;
	
	
	protected int layer;
	
	public Object_port[] port;
	public Object_composite group = null;
	public List<MyObject> member_list = new ArrayList<MyObject>();	
	public static ArrayList<MyObject> object_list = new ArrayList<MyObject>();

	public MyObject() {
		
	}
	
	public void Select() {	
		if(this.group == null) {
			PortVisible(this);			
			Mode_select.selected_list.add(this);
		}
		else {		
			this.group.Select();
		}
		
	}
	
	public void PortVisible(MyObject mo) {
		if(mo.member_list.isEmpty()) {
			System.out.println("base object");
			for(Object_port op : mo.port) {
				op.setEnabled(true);
				//mo.port[i].setVisible(true);
				Object_port.port_list.add(op);
			}
		}
		else {
			for(MyObject member : mo.member_list) {
				PortVisible(member);
			}	
		}	
	}
	
	public void StartMove() {
		//this.rel_mouse_x = getMousePosition().x;
		//this.rel_mouse_y = getMousePosition().y;
		abs_mouse_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x;
		abs_mouse_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y;
	}
	
	
	public void Move() {
		if(this.group == null) {		
			dist_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x - abs_mouse_x;
			dist_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y - abs_mouse_y;
			abs_mouse_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x;
			abs_mouse_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y;
			MoveBaseAndPort(this);
		}
		else {		
			this.group.Move();
		}
	}
	
	public void MoveBaseAndPort(MyObject mo) {
		if(mo.member_list.isEmpty()) {
			//System.out.println("base object");
			mo.x += dist_x;
			mo.y += dist_y;
			mo.setLocation(mo.x, mo.y);
			System.out.println(mo.x + " " + mo.y);
			for(Object_port op : mo.port) {
				//System.out.println(op.x + " " + op.y);
				op.x += dist_x;
				op.y += dist_y;
				op.setLocation(op.x, op.y);
			}
		}
		else {
			for(MyObject member : mo.member_list) {
				//System.out.println("member");
				MoveBaseAndPort(member);
			}	
		}	
	}
	
	public ImageIcon AdjustIconSize(ImageIcon icon) {
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance( 150, 100,  Image.SCALE_SMOOTH ) ;  
		icon.setImage(newimg);
		return icon;
	}
}
