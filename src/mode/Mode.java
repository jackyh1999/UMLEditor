package mode;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import model.object.MyObject;
import scene.Canvas;

public class Mode {
	
	public void handleCanvasClicked(MouseEvent e) {
		
	}
	
	public void handleCanvasPressed(MouseEvent e) {
		
	}
	
	
	public void handleCanvasDragged(MouseEvent e) {
		//Rectangle r = new Rectangle();	
	}
	
	public void handleCanvasReleased(MouseEvent e) {
	
	}
	
	public MyObject chooseObject(int x, int y) {
		return Canvas.getInstance().chooseObject(x,y);
	}
	/*
	public void Initialize() {
		
	}

	public void ObjectClicked(MyObject mo, MouseEvent e) {
		
	}
	
	public void Group() {
		
	}
	
	public void UnGroup() {
		
	}

	public void ChangeName() {
		
	}
	*/
	
	/*
	public void ObjectPressed(MyObject mo, MouseEvent e) {
		
	}

	public void ObjectReleased(MyObject mo, MouseEvent e) {
		
	}

	public void ObjectDragged(MyObject mo) {
		
	}
	
	public void ObjectEntered(MyObject mo) {
		
	}
	*/
}
