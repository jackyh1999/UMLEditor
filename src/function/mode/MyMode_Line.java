package function.mode;

import java.awt.event.MouseEvent;

import scene.GUI;
import function.line.MyLine;
import function.object.MyObject;

public class MyMode_Line extends MyMode{
	
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
}
