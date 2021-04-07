package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;
import function.mode.MyMode_UseCase;

public class MyButton_UseCase extends MyButton{

	public MyButton_UseCase(ImageIcon icon) {
		super(icon);
	}
	
	@Override
	public void ChangeMode() {	
		MyMode.mode = new MyMode_UseCase();
		System.out.println("Mode:usecase");
	}

}
