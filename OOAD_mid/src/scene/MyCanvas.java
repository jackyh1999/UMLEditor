package scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import controller.line.Line;
import controller.mode.*;
import controller.object.*;

public class MyCanvas extends JLayeredPane implements MouseListener, MouseMotionListener{
	
	public static Graphics2D g2d;
	public Color c = Color.BLACK; 
	//public Rectangle r = new Rectangle(0, 0, 640, 580);
	
	public final static int canvas_x = 128;
	public final static int canvas_y = 91;
	
	public static int rect_x = 0;
	public static int rect_y = 0;
	public static int rect_w = 0;
	public static int rect_h = 0;
	public static Rectangle draw_rect = new Rectangle();
	public static Rectangle fill_rect = new Rectangle();
	public int line_begin_x;
	public int line_begin_y;
	public int line_end_x;
	public int line_end_y;
	private int mouse_begin_x;
	private int mouse_begin_y;
	private int mouse_end_x;
	private int mouse_end_y;
	
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
		g.setColor(c);
		g.drawRect(draw_rect.x, draw_rect.y, draw_rect.width, draw_rect.height);
		g.fillRect(fill_rect.x, fill_rect.y, fill_rect.width, fill_rect.height);		
		for(MyObject mo : MyObject.object_list) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(mo.x, mo.y, mo.width, mo.height);
			g.setColor(Color.BLACK);
			g.drawRect(mo.x, mo.y, mo.width, mo.height);
			g.drawLine(mo.x, mo.y+33 , mo.x+150 , mo.y+33);
			g.drawLine(mo.x, mo.y+66 , mo.x+150 , mo.y+66);
			
			g.drawPolygon(mo.range[0]);
			g.drawPolygon(mo.range[1]);
			g.drawPolygon(mo.range[2]);
			g.drawPolygon(mo.range[3]);
			g.drawString(mo.text, mo.x+20, mo.y+20);
		}		
		g.setColor(Color.BLACK);
		for(Object_port op : Object_port.port_list) {	
			g.fillRect(op.x, op.y, op.width, op.height);		
		}
		for(Line line : Line.line_list) {
			g.drawLine(line.begin_port.x, line.begin_port.y, line.end_port.x, line.end_port.y);
		}
	}
	/*
	public void paintClass(Graphics g) {
		super.paintComponent(g);
	}
	*/
	
	public void DrawClass(int x, int y) {
		repaint();
	}
	
	public Rectangle SetRect(int x, int y, int w, int h) {
		Rectangle temp = new Rectangle(x, y, w, h);
		return temp;
	}
	
	public void SetLine(int x1, int y1, int x2, int y2) {
		this.line_begin_x = x1;
		this.line_begin_y = y1;
		this.line_end_x = x2;
		this.line_end_y = y2;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {		
		Mode.mode.CanvasClicked();
		repaint();
		//System.out.println(MouseInfo.getPointerInfo().getLocation());
		//System.out.println(getMousePosition());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		mouse_begin_x = getMousePosition().x;
		mouse_begin_y = getMousePosition().y;
		//Mode.mode.CanvasPressed();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		Mode.mode.CanvasReleased();
		mouse_begin_x = 0;
		mouse_begin_y = 0;
		mouse_end_x = 0;
		mouse_end_y = 0;
		fill_rect.x = 0;
		fill_rect.y = 0;
		fill_rect.width = 0;
		fill_rect.height = 0;
		repaint();	
	}
	
	@Override
	public void mouseDragged(MouseEvent me) {
		//Mode.mode.CanvasDragged();
		mouse_end_x = getMousePosition().x;
		mouse_end_y = getMousePosition().y;
		fill_rect.x = Math.min(mouse_begin_x, mouse_end_x);
		fill_rect.y = Math.min(mouse_begin_y, mouse_end_y);
		fill_rect.width = Math.abs(mouse_end_x - mouse_begin_x);
		fill_rect.height = Math.abs(mouse_end_y - mouse_begin_y);
		
		//System.out.println("Draggggg");
		c = Color.CYAN; 
		repaint();		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("Move");
	}
	
}
