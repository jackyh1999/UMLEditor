package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_Select extends MyButton {
	
	private final int x = 20;
	private final int y = 60;
	
	public MyButton_Select() {
		this.icon = new ImageIcon("src/material/select.PNG");
		this.setLocation(this.x, this.y);
		this.setSize(this.width, this.height);
		this.setIcon(this.AdjustIconSize(this.icon));
	}

	@Override
	public void ChangeMode() {	
		MyMode.mode = MyMode.mode_select;
		System.out.println("Mode:select.");	
	}

}
