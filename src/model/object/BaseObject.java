package model.object;

import java.awt.Graphics;
import java.awt.Rectangle;

import model.DownPort;
import model.LeftPort;
import model.Port;
import model.RightPort;
import model.UpPort;

public class BaseObject extends MyObject{

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	private ObjectType objectType;
	
	protected Port[] ports;
	protected final int portNum = 4;
	
	public BaseObject(int x, int y, ObjectType objectType) {
		super();
		
		this.x = x;
		this.y = y;
		this.objectType = objectType;
		width = objectType.width;
		height = objectType.height;
		
		ports = new Port[4];
		ports[0] = new UpPort(x, y, width, height);
		ports[1] = new RightPort(x, y, width, height);
		ports[2] = new DownPort(x, y, width, height);
		ports[3] = new LeftPort(x, y, width, height);
	}

	public void draw(Graphics g) {
		objectType.draw(x, y, g);
		if(isSelect) {
			for(Port port : ports) {
				port.draw(g);
			}
		}
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
	
	@Override
	public void setName(String name) {
		objectType.setName(name);
	}
	
	@Override
	public void setSelect(boolean b) {
		isSelect = b;
	}
	
	public boolean isContain(int x, int y) {
		Rectangle r = new Rectangle(this.x, this.y, this.width, this.height);
		if(r.contains(x,y)) return true;
		else return false;
	}
	
	public boolean isInside(Rectangle r) {
		if((x > r.x) && (x < r.x + r.width) && (y > r.y) && (y < r.y + r.height)) return true;
		else return false;
	}
	
	public Port choosePort(int x, int y) {
		double distance, min = Double.MAX_VALUE;
		int index = -1;
		for(int i=0;i<portNum;i++) {
			distance = getDistance(x, y, ports[i].getX(), ports[i].getY());
			if(distance < min) {
				min = distance;
				index = i;
			}
		}
		return ports[index];
	}
	
	private double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
	}
	
	@Override
	public void move(int translateX, int translateY) {
		x += translateX;
		y += translateY;
		for(Port port : ports) port.move(translateX,translateY);
	}
}
