package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_AssociationLine extends MyButton{

	private final int x = 20;
	private final int y = 160;
	
	public MyButton_AssociationLine() {
		this.icon = new ImageIcon("src/material/assline.PNG");
		this.setLocation(this.x, this.y);
		this.setSize(this.width, this.height);
		this.setIcon(this.AdjustIconSize(this.icon));
	}

	@Override
	public void ChangeMode() {
		MyMode.mode = MyMode.mode.mode_assline;
		System.out.println("Mode:assline");
	}

}
