package function.button;

import javax.swing.ImageIcon;

import function.mode.MyMode;

public class MyButton_GeneralizationLine extends MyButton{

	private final int x = 20;
	private final int y = 260;
	
	public MyButton_GeneralizationLine() {
		this.icon = new ImageIcon("src/material/genline.PNG");
		this.setLocation(this.x, this.y);
		this.setSize(this.width, this.height);
		this.setIcon(this.AdjustIconSize(this.icon));
	}
	
	@Override
	public void ChangeMode() {
		MyMode.mode = MyMode.mode.mode_genline;
		System.out.println("Mode:genline");
	}
	
}
