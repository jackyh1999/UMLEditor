package function.line;

import java.awt.Graphics;
import java.awt.Polygon;

import scene.GUI;

public class CompositionLine extends MyLine{

	Polygon diamond = new Polygon();
	
	public CompositionLine(MyLine line) {
		this.begin_port = line.begin_port;
		this.end_port = line.end_port;
		this.vec = line.vec;
		SetCoordinate();
	}
	
	@Override
	public void DrawLine(Graphics g) {
		g.drawPolygon(diamond);
	}
	
	public void SetCoordinate() {
		diamond.addPoint(this.end_port.GetCenterX(), this.end_port.GetCenterY());
		diamond.addPoint(this.end_port.GetCenterX() + (int)(vec[1]*(-10)) + (int)(vec[0]*10) , 
						 this.end_port.GetCenterY() + (int)(vec[0]*10) + (int)(vec[1]*10));
		diamond.addPoint(this.end_port.GetCenterX() + (int)(vec[0]*20), this.end_port.GetCenterY() + (int)(vec[1]*20));
		diamond.addPoint(this.end_port.GetCenterX() + (int)(vec[1]*10) + (int)(vec[0]*10), 
						 this.end_port.GetCenterY() + (int)(vec[0]*(-10)) + (int)(vec[1]*10));
	}
}
