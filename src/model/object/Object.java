package model.object;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Port;

public class Object{
	
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	protected int center_x;
	protected int center_y;
	protected Point center;
	
	public static int abs_mouse_x;
	public static int abs_mouse_y;
	public static int dist_x;
	public static int dist_y;
	
	protected String text = new String();
	protected int layer;
	
	protected Port[] port;
	public static int port_num = 4;
	
	public CompositeObject group = null;
	public List<Object> member_list = new ArrayList<Object>();	
	public static ArrayList<Object> object_list = new ArrayList<Object>();

	public Object() {
		
	}
	
	public void CreatePort() {
		this.port =  new Port[port_num];
		for(int i=0;i<port_num;i++) {
			this.port[i] = new Port(this, i);
		}
	}
	
	public int GetX() {
		return this.x;
	}
	
	public int GetY() {
		return this.y;
	}
	
	public int GetWidth() {
		return this.width;
	}
	
	public int GetHeight() {
		return this.height;
	}
	
	public int GetCenterX() {
		return this.x + this.width/2;
	}
	
	public int GetCenterY() {
		return this.y + this.height/2;
	}
	
	public void SetText(String s) {
		this.text = s;
	}
	
	public Port GetPort(int index) {
		return this.port[index];
	}
	
	public void DrawObject(Graphics g) {
		
	}
	
	/*
	public void Select() {	
		if(this.group == null) {
			PortVisible(this);
			MyMode_Select.selected_list.add(this);
			GUI.main_canvas.repaint();
			System.out.println("repaint");
		}
		else {		
			this.group.Select();
		}		
	}
	
	public void PortVisible(Object mo) {
		if(mo.member_list.isEmpty()) {
			System.out.println("base object");
			for(Port op : mo.port) {
				op.setEnabled(true);
				//mo.port[i].setVisible(true);
				Port.port_list.add(op);
			}
		}
		else {
			for(Object member : mo.member_list) {
				PortVisible(member);
			}	
		}	
	}
	
	public void StartMove() {
		abs_mouse_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x;
		abs_mouse_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y;
	}
	
	
	public void Move() {
		if(this.group == null) {		
			dist_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x - abs_mouse_x;
			dist_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y - abs_mouse_y;
			abs_mouse_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x;
			abs_mouse_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y;
			MoveBase(this);
		}
		else {		
			this.group.Move();
		}
	}
	
	public void MoveBase(Object mo) {
		if(mo.member_list.isEmpty()) {
			mo.x += dist_x;
			mo.y += dist_y;
			mo.setLocation(mo.x, mo.y);
			MovePort(mo);
		}
		else {
			for(Object member : mo.member_list) {
				MoveBase(member);
			}	
		}	
	}
	
	public void MovePort(Object mo) {
		for(Port op : mo.port) {
			op.x += dist_x;
			op.y += dist_y;
			op.center_x += dist_x;
			op.center_y += dist_y;
			op.setLocation(op.x, op.y);
		}
		
	}
	
	public ImageIcon AdjustIconSize(ImageIcon icon) {
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance( 150, 100,  Image.SCALE_SMOOTH ) ;  
		icon.setImage(newimg);
		return icon;
	}
	*/

}