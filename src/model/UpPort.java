package model;

public class UpPort extends Port {

	
	public UpPort(int x, int y, int width, int height) {
		super();
		this.x = x + width/2 - this.width/2;
		this.y = y - this.height;
	}

	@Override
	public int getConnectionX() {
		return x + width/2;
	}
	
	@Override
	public int getConnectionY() {
		return y + height;
	}
}
