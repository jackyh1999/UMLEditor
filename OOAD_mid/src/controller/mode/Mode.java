package controller.mode;

import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import controller.object.MyObject;
import scene.GUI;

public class Mode {
	
	public static Mode mode = new Mode();
	public static Mode mode_select = new Mode_select();	
	public static Mode mode_assline = new Mode_assline();
	public static Mode mode_genline = new Mode_genline();
	public static Mode mode_compline = new Mode_compline();
	public static Mode mode_class = new Mode_class();
	public static Mode mode_usecase = new Mode_usecase();
	
	
	
	public void CanvasClicked() {
		System.out.println("Default Mode.");
	}
	
	public void CanvasPressed() {
		//this.mouse_begin_x = MouseInfo.getPointerInfo().getLocation().x;
		//this.mouse_begin_y = MouseInfo.getPointerInfo().getLocation().y;
	}
	
	public void CanvasDragged() {
		Rectangle r = new Rectangle();
		
	}
	
	public void CanvasReleased() {
		//this.mouse_end_x = MouseInfo.getPointerInfo().getLocation().x;
		//this.mouse_end_y = MouseInfo.getPointerInfo().getLocation().y;
	}
	
	public void Initialize() {
		
	}

	public void ObjectClicked(MyObject mo) {
		// TODO Auto-generated method stub
		
	}
	
	public void Group() {
		
	}
	
	public void UnGroup() {
		
	}

	public void ChangeName() {
		
	}
	
	public void ObjectPressed(MyObject mo) {
		// TODO Auto-generated method stub
		
	}

	public void ObjectReleased(MyObject mo, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void ObjectDragged(MyObject mo) {
		// TODO Auto-generated method stub
		
	}
	
	public void ObjectEntered(MyObject mo) {
		
	}
}
