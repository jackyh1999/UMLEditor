package scene;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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
import controller.Object_class;
import controller.Shape_usecase;

public class MyCanvas extends JPanel implements MouseListener{
	
	public static Graphics2D g2d;
	public Color black = Color.BLACK; 
	//public Rectangle r = new Rectangle(0, 0, 640, 580);
	
	public final static int canvas_x = 128;
	public final static int canvas_y = 91;
	
	public static ArrayList<Object_class> class_list = new ArrayList<Object_class>();
	public static ArrayList<Shape_usecase> usecase_list = new ArrayList<Shape_usecase>();
	
	public MyCanvas() {
		GUI.main_frame.add(this);
		this.addMouseListener(this);
		System.out.println("MyCanvas Constructor.");
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		/*
		for(Shape_class sc : class_list) {
			g.drawImage(sc.img, sc.x-canvas_x, sc.y-canvas_y, this);
		}
		*/
		for(Shape_usecase su : usecase_list) {
			g.drawImage(su.img, su.x-canvas_x, su.y-canvas_y, this);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		//System.out.println("Canvas clicked.");
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
		// System.out.println("Canvas Pressd.");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println("Canvas released.");
	}
	
}
