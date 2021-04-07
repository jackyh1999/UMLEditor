package function.mode;

import java.awt.event.MouseEvent;

import function.object.MyObject;
import function.object.MyObject_UseCase;

public class MyMode_UseCase extends MyMode{

	@Override
	public void CanvasClicked(MouseEvent e) {
		MyObject new_usecase = new MyObject_UseCase(e.getX(), e.getY());
	}
}
