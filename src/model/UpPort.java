package model;

import model.object.BaseObject;

public class UpPort extends Port {

	
	public UpPort(int x, int y, int width, int height) {
		this.x = x + width/2 - this.width/2;
		this.y = y - this.height;
	}

	@Override
	public int getConnectionX() {
		// TODO Auto-generated method stub
		return x + width/2;
	}
	
	@Override
	public int getConnectionY() {
		// TODO Auto-generated method stub
		return y + height;
	}
}
