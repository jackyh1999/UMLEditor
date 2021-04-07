package scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLayeredPane;

import function.line.MyLine;
import function.mode.MyMode;
import function.object.MyObject;
import function.object.MyObject_Port;

public class MyCanvas extends JLayeredPane implements MouseListener, MouseMotionListener{
	
	public static Graphics2D g2d;
	private Color c = Color.BLACK; 
	public static int object_layer = 0;
	
	public final static int canvas_x = 128;
	public final static int canvas_y = 91;

	public static Rectangle draw_rect = new Rectangle();
	public static Rectangle fill_rect = new Rectangle();
	
	private int line_begin_x;
	private int line_begin_y;
	private int line_end_x;
	private int line_end_y;
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
		g.setColor(Color.CYAN);
		g.drawRect(draw_rect.x, draw_rect.y, draw_rect.width, draw_rect.height);
		g.fillRect(fill_rect.x, fill_rect.y, fill_rect.width, fill_rect.height);		
		for(MyObject obj : MyObject.object_list) {
			obj.DrawObject(g);
		}		
		g.setColor(Color.BLACK);
		for(MyObject_Port op : MyObject_Port.port_list) {	
			op.DrawObject(g);
		}
		for(MyLine line : GUI.line_list) {
			g.drawLine(line.begin_port.GetCenterX(), line.begin_port.GetCenterY(), 
					   line.end_port.GetCenterX(), line.end_port.GetCenterY());
			line.DrawLine(g);		
		}
	}
	
	public void DrawAssLine(Graphics g) {
		
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
	public void mouseClicked(MouseEvent e) {		
		MyMode.mode.CanvasClicked(e);
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
		mouse_begin_x = getMousePosition().x;
		mouse_begin_y = getMousePosition().y;
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		MyMode.mode.CanvasReleased();
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
		mouse_end_x = getMousePosition().x;
		mouse_end_y = getMousePosition().y;
		fill_rect.x = Math.min(mouse_begin_x, mouse_end_x);
		fill_rect.y = Math.min(mouse_begin_y, mouse_end_y);
		fill_rect.width = Math.abs(mouse_end_x - mouse_begin_x);
		fill_rect.height = Math.abs(mouse_end_y - mouse_begin_y);
		
		c = Color.CYAN; 
		repaint();		
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}
	
}
