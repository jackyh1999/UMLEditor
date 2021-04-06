package controller.mode;

import controller.line.Line;
import controller.object.MyObject;
import controller.object.Object_port;
import scene.MyCanvas;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;

public class Mode_line extends Mode{
	
	
	@Override
	public void ObjectPressed(MyObject mo) {
		
		
		
	}
	
	@Override
	public void ObjectDragged(MyObject mo) {
		System.out.println("obj drag");
		Line.line.BeginRecord(mo);
	}
	
	@Override
	public void ObjectReleased(MyObject mo, MouseEvent e) {
		//System.out.println("obj drag");
		Line.line.EndRecord(mo, e);
	}
	
	@Override
	public void ObjectEntered(MyObject mo) {
		
	}
}
