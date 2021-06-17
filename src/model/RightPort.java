package model;

import model.object.BaseObject;

public class RightPort extends Port{

	public RightPort(int x, int y, int width, int height) {
		super();
		this.x = x + width;
		this.y = y + height/2 - this.height/2;
	}
	
	@Override
	public int getConnectionX() {
		// TODO Auto-generated method stub
		return x;
	}
	
	@Override
	public int getConnectionY() {
		// TODO Auto-generated method stub
		return y + width/2;
	}
	
}
