package controller.mybutton;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import controller.mode.Mode;

public class MyButton_compline extends MyButton {

	public MyButton_compline(ImageIcon icon) {
		this.setIcon(AdjustIconSize(icon));
		
	}

	@Override
	public void ChangeMode() {
		
		Mode.mode = Mode.mode.mode_compline;
		System.out.println("Mode:compline");
	}

}
