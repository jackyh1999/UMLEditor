package controller.object;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyObject extends JLabel{
	
	public Port[] port;

	public MyObject() {
		
	}
	
	public ImageIcon AdjustIconSize(ImageIcon icon) {
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance( 150, 100,  Image.SCALE_SMOOTH ) ;  
		icon.setImage(newimg);
		return icon;
	}
}
