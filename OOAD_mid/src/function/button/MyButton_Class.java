package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_Class extends MyButton{

	private final int x = 20;
	private final int y = 460;
	
	public MyButton_Class() {
		this.icon = new ImageIcon("src/material/class.PNG");
		this.setLocation(this.x, this.y);
		this.setSize(this.width, this.height);
		this.setIcon(this.AdjustIconSize(this.icon));
	}

	@Override
	public void ChangeMode() {	
		MyMode.mode = MyMode.mode_class;
		System.out.println("Mode:class");
	}	
}
