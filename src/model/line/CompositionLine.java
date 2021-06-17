package model.line;

import java.awt.Graphics;

public class CompositionLine extends LineType{

	private final int arrowScale = 20;
	
	public void draw(Graphics g, int startX, int startY, int endX, int endY) {
		double[] vec = calculateUnitVector(startX, startY, endX, endY);
		int centerPointX = endX - (int)(vec[0]*arrowScale*0.5);
		int centerPointY = endY - (int)(vec[1]*arrowScale*0.5);
		int arrowPointX = endX - (int)(vec[0]*arrowScale);
		int arrowPointY = endY - (int)(vec[1]*arrowScale);
		int x1 = centerPointX + (int)(vec[1]*(-1)*arrowScale*0.5);
		int y1 = centerPointY + (int)(vec[0]*arrowScale*0.5);
		int x2 = centerPointX + (int)(vec[1]*arrowScale*0.5);
		int y2 = centerPointY + (int)(vec[0]*(-1)*arrowScale*0.5);
		g.drawLine(startX, startY, arrowPointX, arrowPointY);
		g.drawPolygon(new int[] {endX, x1, arrowPointX, x2},  new int[]{endY, y1, arrowPointY, y2}, 4);
	}
}
