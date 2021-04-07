package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_Select extends MyButton {
	
	public MyButton_Select(ImageIcon icon) {
		super(icon);
	}

	@Override
	public void ChangeMode() {	
		MyMode.mode = MyMode.mode_select;
		System.out.println("Mode:select.");	
	}

}
