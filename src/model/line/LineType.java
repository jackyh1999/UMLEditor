package model.line;

import java.awt.Graphics;

public abstract class LineType {
	
	public abstract void draw(Graphics g, int startX, int startY, int endX, int endY);
	
	public double[] calculateUnitVector(int startX, int startY, int endX, int endY) {
		double length = Math.sqrt( Math.pow(endX-startX, 2) + Math.pow(endY-startY, 2));
		double[] vec = new double[2];
		vec[0] = (endX-startX) / length;
		vec[1] = (endY-startY) / length;
		return vec;
	}
}
