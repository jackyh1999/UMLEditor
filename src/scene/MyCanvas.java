package scene;

import java.awt.Color;
import java.awt.Graphics;
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
 
	public static int object_layer = 0;	
	public final static int canvas_x = 128;
	public final static int canvas_y = 91;
	
	public static Rectangle range_rect = new Rectangle();
	
	private int mouse_begin_x;
	private int mouse_begin_y;
	private int mouse_end_x;
	private int mouse_end_y;
	
	public MyCanvas() {
		GUI.main_frame.add(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		DrawSelectRange(g);
						
		// Draw Object
		for(MyObject obj : MyObject.object_list) {
			obj.DrawObject(g);
		}		
		
		// Draw Port
		for(MyObject_Port op : MyObject_Port.port_list) {	
			op.DrawObject(g);
		}
		
		// Draw Line
		for(MyLine line : MyLine.line_list) {
			g.drawLine(line.begin_port.GetCenterX(), line.begin_port.GetCenterY(), 
					   line.end_port.GetCenterX(), line.end_port.GetCenterY());
			line.DrawLine(g);		
		}
		
	}
	
	public Rectangle SetRect(int x, int y, int w, int h) {
		Rectangle temp = new Rectangle(x, y, w, h);
		return temp;
	}
	
	public void RangeInit() {
		mouse_begin_x = 0;
		mouse_begin_y = 0;
		mouse_end_x = 0;
		mouse_end_y = 0;
		range_rect = SetRect(0,0,0,0);
	}
	
	public void DrawSelectRange(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(range_rect.x, range_rect.y, range_rect.width, range_rect.height);
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
	public void mousePressed(MouseEvent e) {
		mouse_begin_x = e.getX();
		mouse_begin_y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		MyMode.mode.CanvasReleased();
		RangeInit();
		repaint();	
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		mouse_end_x = e.getX();
		mouse_end_y = e.getY();
		range_rect.x = Math.min(mouse_begin_x, mouse_end_x);
		range_rect.y = Math.min(mouse_begin_y, mouse_end_y);
		range_rect.width = Math.abs(mouse_end_x - mouse_begin_x);
		range_rect.height = Math.abs(mouse_end_y - mouse_begin_y);	
		repaint();		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {

	}
	
}
