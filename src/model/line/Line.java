package model.line;

import java.awt.Graphics;

import model.Port;

public class Line {
		
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