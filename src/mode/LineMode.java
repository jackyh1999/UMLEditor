package mode;

import java.awt.event.MouseEvent;
import java.util.List;

import model.Port;
import model.line.Line;
import model.object.MyObject;
import scene.Canvas;

public class LineMode extends Mode{
	
	MyObject startObject;
	
	@Override
	public void handleCanvasPressed(MouseEvent e) {
		startObject = chooseObject(e.getX(), e.getY());
		if( startObject != null) {
			Port startPort = startObject.choosePort(e.getX(), e.getY());
			int startX = startPort.getConnectionX();
			int startY = startPort.getConnectionY();
			int endX = startX;
			int endY = startY;
			Line tmp = new Line(startX, startY, endX, endY, null);
			Canvas.getInstance().getLineList().add(tmp);
			//System.out.println(startX + " " + startY + " " + endX + " " + endY);
		}
		
	}
	
	@Override 
	public void handleCanvasDragged(MouseEvent e) {
		if(startObject != null) {
			List<Line> lineList = Canvas.getInstance().getLineList();
			int top = lineList.size()-1;
			lineList.get(top).setEndPoint(e.getX(), e.getY());
		}
		
	}
	
	@Override
	public void handleCanvasReleased(MouseEvent e) {
		if(startObject != null) {
			MyObject obj = chooseObject(e.getX(), e.getY());
			List<Line> lineList = Canvas.getInstance().getLineList();
			int top = lineList.size()-1;
			if(obj == null) {
				lineList.remove(top);
			}
			else {
				Port startPort = obj.choosePort(e.getX(), e.getY());
				lineList.get(top).setEndPoint(startPort.getConnectionX(), startPort.getConnectionY());
			}
			startObject = null;
		}	
	}
	
	/*
	protected MyLine temp_line = new MyLine();
	
	@Override
	public void ObjectPressed(MyObject mo, MouseEvent e) {
		System.out.println("obj press");
		//MyLine.temp_line.BeginRecord(mo);	
		temp_line.BeginRecord(mo, e);	
	}
	
	@Override
	public void ObjectDragged(MyObject mo) {
		
	}
	
	@Override
	public void ObjectReleased(MyObject mo, MouseEvent e) {
		System.out.println("obj release");
		if( temp_line.EndRecord(e) ) {
			DrawLine(temp_line);
		}
		GUI.main_canvas.repaint();
	}
	
	@Override
	public void ObjectEntered(MyObject mo) {
		
	}
	
	public void DrawLine(MyLine line) {
		
	}
	*/
}
