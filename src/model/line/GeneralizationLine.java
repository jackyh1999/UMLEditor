package model.line;

import java.awt.Graphics;
import java.awt.Polygon;

public class GeneralizationLine extends LineType{

	Polygon triangle = new Polygon();
	
	/*
	public GeneralizationLine(MyLine line) {
		System.out.println("new gen line");
		this.begin_port = line.begin_port;
		this.end_port = line.end_port;
		this.vec = line.vec;
		SetCoordinate();
	}
	
	@Override
	public void DrawLine(Graphics g) {	
		g.drawPolygon(triangle);
	}
	
	public void SetCoordinate() {
		triangle.addPoint(this.end_port.GetCenterX() + (int)(vec[0]*20), this.end_port.GetCenterY() + (int)(vec[1]*20));
		triangle.addPoint(this.end_port.GetCenterX() - (int)(vec[1]*10), this.end_port.GetCenterY() + (int)(vec[0]*10));
		triangle.addPoint(this.end_port.GetCenterX() + (int)(vec[1]*10), this.end_port.GetCenterY() - (int)(vec[0]*10));
	
	}
	*/
}
