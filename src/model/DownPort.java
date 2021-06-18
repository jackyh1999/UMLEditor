package model;

public class DownPort extends Port {
	
	public DownPort(int x, int y, int width, int height) {
		super();
		this.x = x + width/2 - this.width/2;
		this.y = y + height;
	}
	
	@Override
	public int getConnectionX() {
		return x + width/2;
	}
	
	@Override
	public int getConnectionY() {
		return y;
	}
}
