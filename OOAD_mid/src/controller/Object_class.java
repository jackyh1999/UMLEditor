package controller;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import scene.GUI;
import scene.MyCanvas;

public class Object_class extends JLabel{
	
	public static final int width = 150;
	public static final int height = 100;	
	
	private Image img;
	public JTextField tf = new JTextField();
	public JLabel lb;
	
	public Object_class(Point p) {
		try {
			img = ImageIO.read(new File("src/material/class.png"));
		}catch(IOException e){
			
		}
				
		ImageIcon ii = new ImageIcon();
		ii.setImage(img);
		
		this.setText("Hi");
		this.setIcon(AdjustIconSize(ii));
		
		this.setLocation(p.x-MyCanvas.canvas_x, p.y-MyCanvas.canvas_y);
		this.setSize(150, 100);
		
		MyCanvas.class_list.add(this);
		GUI.main_canvas.add(this);
		System.out.println(p.x + " " +p.y);
	}
	
	public ImageIcon AdjustIconSize(ImageIcon icon) {
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance( 150, 100,  Image.SCALE_SMOOTH ) ;  
		icon.setImage(newimg);
		return icon;
	}
	
	public void ClassClicked() {
		System.out.println("Class Clicked.");
	}
}
