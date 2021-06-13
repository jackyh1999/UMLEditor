package model.object;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Port;

public class MyObject{
	
	protected int x;
	protected int y;
	
	protected int width;
	protected int height;
	
	protected Port[] ports;
	protected boolean isSelect;
	
	private String text = new String();
	private int depth;
	
	
	private int portNum = 4;
	
	public CompositeObject group = null;
	public List<Object> member_list = new ArrayList<Object>();	
	public static ArrayList<Object> object_list = new ArrayList<Object>();

	public MyObject() {
		
	}
	
	/*
	public void CreatePort() {
		this.port =  new Port[port_num];
		for(int i=0;i<port_num;i++) {
			this.port[i] = new Port(this, i);
		}
	}
	*/
	
	public void SetText(String s) {
		this.text = s;
	}
	
	/*
	public Port GetPort(int index) {
		return this.port[index];
	}*/
	
	public void draw(Graphics g) {
		
	}
	
	public boolean isContain(int x, int y) {
		Rectangle r = new Rectangle(this.x, this.y, this.width, this.height);
		if(r.contains(x,y)) return true;
		else return false;
	}
	
	public boolean isInside(Rectangle r) {
		if(x > r.x && x < r.x + r.width && y > r.y && y < r.y + r.height) return true;
		else return false;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Port choosePort(int x, int y) {
		double distance, min = Double.MAX_VALUE;
		int index = -1;
		for(int i=0;i<portNum;i++) {
			distance = getDistance(x, y, ports[i].getX(), ports[i].getY());
			System.out.println(distance);
			if(distance < min) {
				min = distance;
				index = i;
			}
		}
		System.out.println(index);
		return ports[index];
	}
	
	private double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
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

	public void setSelect(boolean b) {
		// TODO Auto-generated method stub
		isSelect = b;
	}

	

}
