package scene;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import mode.Mode;

public class FunctionButton extends JButton{
	
	private final int btnInitX = 20;
	private final int btnInitY = 60;
	private final int btnGapY = 100;
	private final int width = 80;
	private final int height = 80;
	private Mode mode;
	
	public FunctionButton(int n, ImageIcon imgIcon, Mode mode) {
		this.setSize(width, height);
		this.setLocation(btnInitX, btnInitY + btnGapY * n);
		this.setIcon(imgIcon);
		this.mode = mode;
	}
	
}
