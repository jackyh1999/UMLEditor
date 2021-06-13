package model.line;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComponent;

import model.Port;

public class Line {
	
	public static ArrayList<Line> line_list = new ArrayList<Line>();
	
	public int begin_x;
	public int begin_y;
	public Point begin;
	public Port begin_port;
	
	public int end_x;
	public int end_y;
	public Point end;
	public Port end_port;
	
	public double[] vec = new double[2];
	
	private int startX;
	private int startY;
	private int endX;
	private int endY;
	private LineType lineType;
	/*
	public void BeginRecord(MyObject mo, MouseEvent e) {
		begin_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x;
		begin_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y;
		//begin_x = e.getX();
		//begin_y = e.getY();
		System.out.println(begin_x + " " + begin_y);
		begin = new Point(begin_x, begin_y);
		Double min = Double.MAX_VALUE;
		int temp = 0;
		double dist;
		for(int i=0;i<4;i++) {
			dist = Distance(mo.GetPort(i).GetCenter(), begin);
			if(dist < min) {
				min = dist;
				temp = i;
			}
		}
		this.begin_port = mo.GetPort(temp);
	}
	 */
	
	/*
	public Boolean EndRecord(MouseEvent e) {
		end_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x;
		end_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y;
		//end_x = e.getX();
		//end_y = e.getY();
		end = new Point(end_x, end_y);	
		
		
		if(!(GUI.main_canvas.getComponentAt(end) instanceof MyObject)) return false;
		MyObject mo = (MyObject) GUI.main_canvas.getComponentAt(end);
		Double min = Double.MAX_VALUE;
		int temp = 0;
		for(int i=0;i<4;i++) {
			if(Distance(mo.GetPort(i).GetCenter(), end) < min) {
				min = Distance(mo.GetPort(i).GetCenter(), end);
				temp = i;
			}
		}
		this.end_port = mo.GetPort(temp);
		CreateLine();
		return true;
	}
	*/
	
	public Line(int startX, int startY, int endX, int endY, LineType lineType) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.lineType = lineType;
		System.out.println("new line");
	}

	public void CreateLine() {
		CalculateSlope();
		//this.begin_port.connected_list.add(this);
		//this.end_port.connected_list.add(this);
	}
	
	public Double Distance(Point p1, Point p2) {
		return Math.sqrt( Math.pow(p2.x-p1.x, 2) + Math.pow(p2.y-p1.y, 2) );
	}
	
	public void CalculateSlope() {
		double i = this.end_x - this.begin_x;
		double j = this.end_y - this.begin_y;
		double bigger = Math.max(Math.abs(i), Math.abs(j));
		i /= bigger;
		j /= bigger;
		vec[0] = i ;
		vec[1] = j ;
	}
	
	public void setEndPoint(int x, int y) {
		this.endX = x;
		this.endY = y;
		
	}

	public void draw(Graphics g) {
		g.drawLine(startX, startY, endX, endY);
	}
}