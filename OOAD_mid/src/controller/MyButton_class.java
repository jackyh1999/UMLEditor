package controller;

import scene.MyButton;

public class MyButton_class extends MyButton{

	@Override
	public void ButtonAction() {
		// TODO Auto-generated method stub
		//Mode.mode = Mode_enum.Class;
		Mode.mode = new Mode_class();
		System.out.println("Mode:class");
	}
	
}
