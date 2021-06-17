package mode;

import java.awt.event.MouseEvent;

import model.object.BaseObject;
import model.object.UseCaseType;
import scene.Canvas;

public class UseCaseMode extends Mode{

	/*
	@Override
	public void CanvasClicked(MouseEvent e) {
		MyObject new_usecase = new MyObject_UseCase(e.getX(), e.getY());
	}
	*/
	@Override
	public void handleCanvasClicked(MouseEvent e) {
		BaseObject obj = new BaseObject(e.getX(), e.getY(), new UseCaseType());
		Canvas.getInstance().getObjectList().add(obj);
		Canvas.getInstance().getLayers().add(obj);
	}
}
