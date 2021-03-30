package controller.mode;

import javax.swing.JLabel;

import controller.object.MyObject;

public class Mode {
	public static Mode mode = new Mode();
	public static Mode mode_select = new Mode_select();
	public static Mode mode_class = new Mode_class();
	public static Mode mode_compline = new Mode_select();
	public static Mode mode_assline = new Mode_class();
	public static Mode mode_genline = new Mode_select();
	public static Mode mode_usecase = new Mode_class();
	//public static Mode_enum mode;
	public void CanvasClicked() {
		System.out.println("Default Mode.");
	}
	
	public void Initialize() {
		
	}

	public void ObjectClicked(MyObject mo) {
		// TODO Auto-generated method stub
		
	}
}
