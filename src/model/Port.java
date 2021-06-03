package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import model.line.Line;

public class Port{
	
	public static ArrayList<Port> port_list = new ArrayList<Port>();
	
	private final int width = 10;
	private final int height = 10;
	
	public ArrayList<Line> connected_list = new ArrayList<Line>();
	
	public Port(Object obj, int type) {
		
		/*
		switch(type) {
		case 0:
			UpPort(obj); break;
		case 1:
			RightPort(obj); break;
		case 2:
			DownPort(obj); break;
		case 3:
			LeftPort(obj); break;
		}
		
		this.center_x = this.x + this.width/2;
		this.center_y = this.y + this.height/2;
		this.center = new Point(this.center_x, this.center_y);	
		this.setLocation(this.x, this.y);
		this.setSize(this.width, this.height);
		this.layer = obj.layer;
		//System.out.println(this.x + " " + this.y);
		GUI.main_canvas.add(this, this.layer, 0);
		*/
	}
	
	/*
	public void UpPort(MyObject obj) {
		
		this.x = obj.center_x - this.width/2;
		this.y = obj.y - this.height;
	}
	
	public void RightPort(MyObject obj) {
		this.x = obj.x + obj.width;
		this.y = obj.center_y - this.height/2;
	}
	
	public void DownPort(MyObject obj) {
		this.x = obj.center_x - this.width/2;
		System.out.println( obj.height );
		this.y = obj.y + obj.height;
	}
	
	public void LeftPort(MyObject obj) {
		this.x = obj.x - this.width;
		this.y = obj.center_y - this.height/2;
	}
	
	
	
	public Point GetCenter() {
		return new Point(this.x + this.width/2, this.y + this.height/2);
	}
	
	@Override
	public void DrawObject(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(this.x, this.y, this.width, this.height);			
	}
	*/
}
