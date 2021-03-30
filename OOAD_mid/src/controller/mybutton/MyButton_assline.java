package controller.mybutton;

import javax.swing.ImageIcon;

import controller.mode.Mode;

public class MyButton_assline extends MyButton{

	public MyButton_assline() {
		
		
	}

	public MyButton_assline(ImageIcon icon) {
		this.setIcon(AdjustIconSize(icon));
		
	}

	@Override
	public void ChangeMode() {
		
		Mode.mode = Mode.mode.mode_assline;
		System.out.println("Mode:assline");
	}

}
