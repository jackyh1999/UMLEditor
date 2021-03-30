package scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

import controller.mode.*;
import controller.object.*;

public class MyCanvas extends JPanel implements MouseListener, MouseMotionListener{
	
	public static Graphics2D g2d;
	public Color black = Color.BLACK; 
	//public Rectangle r = new Rectangle(0, 0, 640, 580);
	
	public final static int canvas_x = 128;
	public final static int canvas_y = 91;
	
	public static int mouse_begin_x = 0;
	public static int mouse_begin_y = 0;
	public static int mouse_end_x = 0;
	public static int mouse_end_y = 0;
	
	
	//public static ArrayList<Object_class> class_list = new ArrayList<Object_class>();
	//public static ArrayList<Object_usecase> usecase_list = new ArrayList<Object_usecase>();
	
	public MyCanvas() {
		GUI.main_frame.add(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillRect(mouse_begin_x, mouse_begin_y, mouse_end_x-mouse_begin_x, mouse_end_y-mouse_begin_y);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {		
		Mode.mode.CanvasClicked();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		mouse_begin_x = MouseInfo.getPointerInfo().getLocation().x - canvas_x;
		mouse_begin_y = MouseInfo.getPointerInfo().getLocation().y - canvas_y;
		//Mode.mode.CanvasPressed();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		Mode.mode.CanvasReleased();
		mouse_begin_x = 0;
		mouse_begin_y = 0;
		mouse_end_x = 0;
		mouse_end_y = 0;
		repaint();	
	}
	
	@Override
	public void mouseDragged(MouseEvent me) {
		//Mode.mode.CanvasDragged();
		mouse_end_x = MouseInfo.getPointerInfo().getLocation().x - canvas_x;
		mouse_end_y = MouseInfo.getPointerInfo().getLocation().y - canvas_y;
		//System.out.println("Draggggg");
		
		repaint();		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("Move");
	}
	
}
