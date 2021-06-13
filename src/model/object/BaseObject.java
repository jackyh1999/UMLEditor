package model.object;

import java.awt.Graphics;

import model.DownPort;
import model.LeftPort;
import model.Port;
import model.RightPort;
import model.UpPort;

public class BaseObject extends MyObject{

	//private int x;
	//private int y;
	private ObjectType objectType;
	
	
	public BaseObject(int x, int y, ObjectType objectType) {
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
		isSelect = false;
	}

	@Override
	public void draw(Graphics g) {
		objectType.draw(x, y, g);
		if(isSelect) {
			for(Port port : ports) {
				port.draw(g);
			}
		}
	}
}
