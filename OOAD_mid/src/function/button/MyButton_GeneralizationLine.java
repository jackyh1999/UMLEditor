package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_GeneralizationLine extends MyButton{

	public MyButton_GeneralizationLine(ImageIcon icon) {
		super(icon);
	}
	
	@Override
	public void ChangeMode() {
		MyMode.mode = MyMode.mode.mode_genline;
		System.out.println("Mode:genline");
	}
	
}
