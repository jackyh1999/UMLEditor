package function.mode;

import java.awt.event.MouseEvent;

import function.object.MyObject;
import function.object.MyObject_Class;

public class MyMode_Class extends MyMode{
	
	@Override
	public void CanvasClicked(MouseEvent e) {
		MyObject new_class = new MyObject_Class(e.getX(), e.getY());
	}
}
