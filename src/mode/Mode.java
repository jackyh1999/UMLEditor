package mode;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class Mode {
	
	/*
	public static MyMode mode = new MyMode();
	public static MyMode mode_select = new MyMode_Select();	
	public static MyMode mode_assline = new MyMode_AssociationLine();
	public static MyMode mode_genline = new MyMode_GeneralizationLine();
	public static MyMode mode_compline = new MyMode_CompositionLine();
	public static MyMode mode_class = new MyMode_Class();
	public static MyMode mode_usecase = new MyMode_UseCase();
	*/
	
	public void handleCanvasClicked(MouseEvent e) {
		System.out.println("Default Mode.");
	}
	
	public void handleCanvasPressed() {
	}
	
	public void handleCanvasDragged() {
		Rectangle r = new Rectangle();	
	}
	
	public void handleCanvasReleased() {
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
