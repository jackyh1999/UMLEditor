package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_Class extends MyButton{

	public MyButton_Class(ImageIcon icon) {
		super(icon);
	}

	@Override
	public void ChangeMode() {	
		MyMode.mode = MyMode.mode_class;
		System.out.println("Mode:class");
	}	
}
