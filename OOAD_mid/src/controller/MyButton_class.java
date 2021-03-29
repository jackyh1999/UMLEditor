package controller;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import scene.MyButton;

public class MyButton_class extends MyButton{

	public MyButton_class(ImageIcon icon) {
		this.setIcon(AdjustIconSize(icon));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ButtonAction() {
		// TODO Auto-generated method stub
		//Mode.mode = Mode_enum.Class;
		Mode.mode = Mode.mode_class;
		System.out.println("Mode:class");
	}
	
}
