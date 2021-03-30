package controller.mybutton;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import controller.mode.Mode;


public class MyButton_genline extends MyButton{

	public MyButton_genline(ImageIcon icon) {
		this.setIcon(AdjustIconSize(icon));
		
	}
	
	@Override
	public void ChangeMode() {
		
		Mode.mode = Mode.mode.mode_genline;
		System.out.println("Mode:genline");
	}
	
}
