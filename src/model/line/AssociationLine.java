package model.line;

import java.awt.Graphics;

public class AssociationLine extends LineType{
	
	private final int arrowScale = 20;
	
	@Override
	public void draw(Graphics g, int startX, int startY, int endX, int endY) {
		double[] vec = calculateUnitVector(startX, startY, endX, endY);
		int arrowPointX = endX - (int)(vec[0]*arrowScale);
		int arrowPointY = endY - (int)(vec[1]*arrowScale);
		int x1 = arrowPointX + (int)(vec[1]*(-1)*arrowScale*0.5);
		int y1 = arrowPointY + (int)(vec[0]*arrowScale*0.5);
		int x2 = arrowPointX + (int)(vec[1]*arrowScale*0.5);
		int y2 = arrowPointY + (int)(vec[0]*(-1)*arrowScale*0.5);
		g.drawLine(startX, startY, endX, endY);
		g.drawLine(x1, y1, endX, endY);
		g.drawLine(x2, y2, endX, endY);
	}
	
}
