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

import controller.mode.*;
import controller.object.*;

public class MyCanvas extends JPanel implements MouseListener{
	
	public static Graphics2D g2d;
	public Color black = Color.BLACK; 
	//public Rectangle r = new Rectangle(0, 0, 640, 580);
	
	public final static int canvas_x = 128;
	public final static int canvas_y = 91;
	
	public static ArrayList<Object_class> class_list = new ArrayList<Object_class>();
	public static ArrayList<Object_usecase> usecase_list = new ArrayList<Object_usecase>();
	
	public MyCanvas() {
		GUI.main_frame.add(this);
		this.addMouseListener(this);

	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {		
		Mode.mode.CanvasClicked();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
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
