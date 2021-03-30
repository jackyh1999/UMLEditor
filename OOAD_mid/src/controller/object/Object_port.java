package controller.object;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import scene.GUI;

public class Object_port extends JLabel{
	
	private Image img;
	public static ArrayList<Object_port> port_list = new ArrayList<Object_port>();
	
	public Object_port(int x, int y) {
		
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
		//this.setBackground(new Color(0, 0, 0));
		
		//this.setVisible(false);
		this.setEnabled(false);
		GUI.main_canvas.add(this);
	}
	
	public void Initialize() {
		
	}
}
