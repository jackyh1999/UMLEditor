package scene;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import mode.Mode;

public class ModeButton extends JButton implements ActionListener{
	
	private final int btnInitX = 20;
	private final int btnInitY = 60;
	private final int btnGapY = 100;
	private final int width = 80;
	private final int height = 80;
	
	private final int iconWidth = 60;
	private final int iconHeight = 50;

	private Mode mode;
	
	public ModeButton(int n, ImageIcon imgIcon, Mode mode) {
		this.setSize(width, height);
		this.setLocation(btnInitX, btnInitY + btnGapY * n);
		this.setIcon( adjustIconSize(imgIcon) );
		this.addActionListener(this);
		this.mode = mode;
	}
	
	private ImageIcon adjustIconSize(ImageIcon icon) {
		Image newimg = icon.getImage().getScaledInstance( iconWidth, iconHeight, Image.SCALE_SMOOTH ) ;  
		icon.setImage(newimg);
		return icon;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		UMLEditor.getInstance().changeButtonColor(this);
		Canvas.getInstance().setCurrentMode(mode);
	}
	
}
