package mode;

import java.awt.event.MouseEvent;

import model.object.BaseObject;
import model.object.ClassType;
import model.object.MyObject;
import scene.Canvas;

public class ClassMode extends Mode{
	
	@Override
	public void handleCanvasClicked(MouseEvent e) {
		BaseObject obj = new BaseObject(e.getX(), e.getY(), new ClassType());
		Canvas.getInstance().getObjectList().add(obj);
		Canvas.getInstance().getLayers().add(obj);
	}
	/*
	private static Mode classMode;
	
	private ClassMode() {
		
	}
	
	public static Mode getInstance() {
		if(classMode == null) classMode = new ClassMode();
		return classMode;
	}
	*/
	
	/*
	@Override
	public void CanvasClicked(MouseEvent e) {
		MyObject new_class = new MyObject_Class(e.getX(), e.getY());
	}
	*/
}
