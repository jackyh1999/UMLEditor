package controller;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import scene.MyButton;

public class MyButton_usecase extends MyButton{

	public MyButton_usecase(ImageIcon icon) {
		this.setIcon(AdjustIconSize(icon));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ButtonAction() {
		// TODO Auto-generated method stub
		Mode.mode = new Mode_usecase();
		System.out.println("Mode:usecase");
	}

}
