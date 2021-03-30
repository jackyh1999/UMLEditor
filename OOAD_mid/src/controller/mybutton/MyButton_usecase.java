package controller.mybutton;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import controller.mode.Mode;
import controller.mode.Mode_usecase;

public class MyButton_usecase extends MyButton{

	public MyButton_usecase(ImageIcon icon) {
		this.setIcon(AdjustIconSize(icon));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ChangeMode() {
		
		Mode.mode = new Mode_usecase();
		System.out.println("Mode:usecase");
	}

}
