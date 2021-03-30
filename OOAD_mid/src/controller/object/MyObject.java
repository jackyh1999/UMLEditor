package controller.object;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyObject extends JLabel{
	
	public static final int width = 150;
	public static final int height = 100;
	public int x;
	public int y;
	
	public Object_port[] port;
	public Object_composite group = null;
	public static ArrayList<MyObject> object_list = new ArrayList<MyObject>();

	public MyObject() {
		
	}
	
	public void Select() {	
		if(this.group == null) {
			for(int i=0;i<4;i++) {
				this.port[i].setEnabled(true);
				//mo.port[i].setVisible(true);
				Object_port.port_list.add(this.port[i]);
			}
		}
		else {
			
			this.group.Select();
		}
				
	}
	
	
	public ImageIcon AdjustIconSize(ImageIcon icon) {
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance( 150, 100,  Image.SCALE_SMOOTH ) ;  
		icon.setImage(newimg);
		return icon;
	}
}
