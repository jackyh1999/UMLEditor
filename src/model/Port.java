package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import model.line.Line;
import model.object.BaseObject;

public class Port{
	

	public static ArrayList<Port> port_list = new ArrayList<Port>();
	
	protected int x;
	protected int y;
	protected int width = 10;
	protected int height = 10;
	
	public ArrayList<Line> connected_list = new ArrayList<Line>();
	
	public Port() {
		
	}
	/*
	public Port(int x, int y, int width, int height) {
		
	}
	
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
		
	}
    */
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getConnectionX() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getConnectionY() {
		// TODO Auto-generated method stub
		return 0;
	}
}
