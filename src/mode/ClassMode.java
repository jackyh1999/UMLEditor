package mode;

import java.awt.event.MouseEvent;

import model.object.BaseObject;
import model.object.ClassType;
import scene.Canvas;

public class ClassMode extends Mode{
	
	@Override
	public void handleCanvasClicked(MouseEvent e) {
		BaseObject obj = new BaseObject(e.getX(), e.getY(), new ClassType());
		Canvas.getInstance().getObjectList().add(obj);
		Canvas.getInstance().getLayers().add(obj);
	}
}
