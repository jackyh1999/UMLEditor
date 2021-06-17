package mode;

import java.awt.event.MouseEvent;

import model.object.BaseObject;
import model.object.MyObject;
import scene.Canvas;

public class Mode {
	
	public void handleCanvasClicked(MouseEvent e) {
		
	}
	
	public void handleCanvasPressed(MouseEvent e) {
		
	}
	
	public void handleCanvasDragged(MouseEvent e) {
			
	}
	
	public void handleCanvasReleased(MouseEvent e) {
	
	}
	
	public MyObject chooseObject(int x, int y) {
		return Canvas.getInstance().chooseObject(x,y);
	}
	
	public BaseObject chooseBaseObject(int x, int y) {
		return Canvas.getInstance().chooseBaseObject(x,y);
	}
	
}
