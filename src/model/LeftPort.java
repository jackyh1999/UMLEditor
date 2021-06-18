package model;

public class LeftPort extends Port {

	public LeftPort(int x, int y, int width, int height) {
		super();
		this.x = x - this.width;
		this.y = y + height/2 - this.height/2;
	}
	
	@Override
	public int getConnectionX() {
		return x + width;
	}
	
	@Override
	public int getConnectionY() {
		return y + height/2;
	}
}
