package model;

import model.object.BaseObject;

public class LeftPort extends Port {

	public LeftPort(int x, int y, int width, int height) {
		this.x = x - this.width;
		this.y = y + height/2 - this.height/2;
	}
	
	@Override
	public int getConnectionX() {
		// TODO Auto-generated method stub
		return x + width;
	}
	
	@Override
	public int getConnectionY() {
		// TODO Auto-generated method stub
		return y + height/2;
	}
}
