package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_AssociationLine extends MyButton{

	public MyButton_AssociationLine(ImageIcon icon) {
		super(icon);	
	}

	@Override
	public void ChangeMode() {
		MyMode.mode = MyMode.mode.mode_assline;
		System.out.println("Mode:assline");
	}

}
