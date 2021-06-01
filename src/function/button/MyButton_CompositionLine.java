package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_CompositionLine extends MyButton {

	private final int x = 20;
	private final int y = 360;
	
	public MyButton_CompositionLine() {
		this.icon = new ImageIcon("src/material/compline.PNG");
		this.setLocation(this.x, this.y);
		this.setSize(this.width, this.height);
		this.setIcon(this.AdjustIconSize(this.icon));
	}

	@Override
	public void ChangeMode() {		
		MyMode.mode = MyMode.mode.mode_compline;
		System.out.println("Mode:compline");
	}

}
