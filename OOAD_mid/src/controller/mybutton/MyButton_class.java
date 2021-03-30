package controller.mybutton;

import javax.swing.ImageIcon;

import controller.mode.Mode;

public class MyButton_class extends MyButton{

	public MyButton_class(ImageIcon icon) {
		this.setIcon(AdjustIconSize(icon));
		
	}

	@Override
	public void ChangeMode() {
		
		Mode.mode = Mode.mode_class;
		System.out.println("Mode:class");
	}	
	
}
