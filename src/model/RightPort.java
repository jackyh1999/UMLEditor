package model;

public class RightPort extends Port{

	public RightPort(int x, int y, int width, int height) {
		super();
		this.x = x + width;
		this.y = y + height/2 - this.height/2;
	}
	
	@Override
	public int getConnectionX() {
		return x;
	}
	
	@Override
	public int getConnectionY() {
		return y + width/2;
	}
	
}
