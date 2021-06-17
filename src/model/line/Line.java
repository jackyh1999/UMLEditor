package model.line;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;


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
	private Port startPort;
	private int endX;
	private int endY;
	private Port endPort;
	private LineType lineType;

	
	public Line(int startX, int startY, int endX, int endY, LineType lineType) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.lineType = lineType;
	}

	public void setEndPoint(int x, int y) {
		this.endX = x;
		this.endY = y;
		
	}

	public void setStartPort(Port startPort) {
		this.startPort = startPort;
	}
	
	public void setEndPort(Port endPort) {
		this.endPort = endPort;
	}
	
	public void draw(Graphics g) {
		lineType.draw(g, startX, startY, endX, endY);
	}

	public void move(Port port) {
		if(port.equals(startPort)) {
			startX = port.getConnectionX();
			startY = port.getConnectionY();
		}
		else if(port.equals(endPort)) {
			endX = port.getConnectionX();
			endY = port.getConnectionY();
		}
	}

}