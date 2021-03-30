package controller.object;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import scene.GUI;

public class Port extends JLabel{
	
	private Image img;
	public Port(int x, int y) {
		
		try {
			img = ImageIO.read(new File("src/material/port.png"));
		}
		catch(IOException e){
			
		}
		
		ImageIcon ii = new ImageIcon();
		ii.setImage(img);
		
		this.setIcon(ii);
		this.setLocation(x, y);
		this.setSize(10, 10);
		//this.setVisible(false);
		this.setEnabled(false);
		GUI.main_canvas.add(this);
	}
	
	public void Initialize() {
		
	}
}
