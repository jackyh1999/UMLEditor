package scene;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import controller.Mode;
import controller.Mode_class;

public class MyCanvas extends JPanel implements MouseListener{
	
	public static Graphics2D g2d;
	public Color black = Color.BLACK; 
	//public Rectangle r = new Rectangle(0, 0, 640, 580);
	
	private int canvas_x = 128;
	private int canvas_y = 91;
	
	public static ArrayList<Rectangle> class_list = new ArrayList<Rectangle>();
	
	public MyCanvas() {
		GUI.main_frame.add(this);
		this.addMouseListener(this);
		System.out.println("MyCanvas Constructor.");
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		g.drawRect(0, 0, 640, 580);
		g.fillRect(0, 0, 640, 580);
		
		g.setColor(black);
		for(Rectangle r : class_list) {
			//g.drawRect(r.x-canvas_x, r.y, r.width, r.height);
			g.fillRect(r.x-canvas_x, r.y-canvas_y, r.width, r.height);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Canvas clicked.");
		Mode.mode.dosomething();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Canvas entered.");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Canvas exited.");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Canvas Pressd.");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Canvas released.");
	}
	
}
