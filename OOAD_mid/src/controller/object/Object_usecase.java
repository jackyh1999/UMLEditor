package controller.object;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import controller.mode.Mode;
import scene.GUI;
import scene.MyCanvas;

public class Object_usecase extends MyObject implements MouseListener{

	public static final int width = 150;
	public static final int height = 100;
	
	public Image img;

	
	public Object_usecase(Point p) {

		this.x = p.x-MyCanvas.canvas_x;
		this.y = p.y-MyCanvas.canvas_y;
		
		try {
			img = ImageIO.read(new File("src/material/usecase.png"));
		}
		catch(IOException e){
			
		}
				
		ImageIcon ii = new ImageIcon();
		ii.setImage(img);
		this.setIcon(AdjustIconSize(ii));
		
		this.setLocation(this.x, this.y);
		this.setSize(150, 100);
		this.addMouseListener(this);		
		
		this.port =  new Object_port[4];
		this.port[0] = new Object_port(this.x + 70, this.y - 10);
		this.port[1] = new Object_port(this.x + 150, this.y + 45);
		this.port[2] = new Object_port(this.x + 70, this.y + 100);
		this.port[3] = new Object_port(this.x -10 , this.y + 45);
		
		MyObject.object_list.add(this);
		GUI.main_canvas.add(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Mode.mode.ObjectClicked(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
