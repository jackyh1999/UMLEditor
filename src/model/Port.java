package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import model.line.Line;

public abstract class Port{
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	private List<Line> lines;
	
	public Port() {
		width = 10;
		height = 10;
		lines = new ArrayList<Line>();
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
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
	
	public List<Line> getLineList(){
		return lines;
	}
	
	public abstract int getConnectionX();
	
	public abstract int getConnectionY();
	
	public void move(int translateX, int translateY) {
		x += translateX;
		y += translateY;
		for(Line line : lines) line.move(this);
	}
}
