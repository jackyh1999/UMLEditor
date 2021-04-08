package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;
import function.mode.MyMode_UseCase;

public class MyButton_UseCase extends MyButton{

	private final int x = 20;
	private final int y = 560;
	
	public MyButton_UseCase() {
		this.icon = new ImageIcon("src/material/usecase.PNG");
		this.setLocation(this.x, this.y);
		this.setSize(this.width, this.height);
		this.setIcon(this.AdjustIconSize(this.icon));
	}
	
	@Override
	public void ChangeMode() {	
		MyMode.mode = new MyMode_UseCase();
		System.out.println("Mode:usecase");
	}

}
