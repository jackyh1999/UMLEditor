package function.button;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_CompositionLine extends MyButton {

	public MyButton_CompositionLine(ImageIcon icon) {
		super(icon);
	}

	@Override
	public void ChangeMode() {		
		MyMode.mode = MyMode.mode.mode_compline;
		System.out.println("Mode:compline");
	}

}
