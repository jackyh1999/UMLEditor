package scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import mode.Mode;
import model.line.Line;

public class Canvas extends JPanel{
 
	private static Canvas canvas; 
	
	private List<Object> objectList;
	private List<Line> lineList;
	private Mode currentMode;
	private CanvasMouseEvent cme;
	
	private final int x = 120;
	private final int y = 60;
	private final int width = 640;
	private final int height = 580;
		
	/*
	public static int object_layer = 0;	
	public final static int canvas_x = 128;
	public final static int canvas_y = 91;
	
	public static Rectangle range_rect = new Rectangle();
	
	private int mouse_begin_x;
	private int mouse_begin_y;
	private int mouse_end_x;
	private int mouse_end_y;
	
	*/
	
	private Canvas() {
		//GUI.main_frame.add(this);
		cme = new CanvasMouseEvent();
		
		this.setLocation(x, y);
		this.setSize(width, height);
		this.setBackground(Color.WHITE);
		//this.setOpaque(true);
		this.setVisible(true);
		this.addMouseListener(cme);
		this.addMouseMotionListener(cme);
		System.out.println("Canvas created");
	}
	
	public static Canvas getInstance() {
		if(canvas == null) {
			canvas = new Canvas();
		}
		return canvas;
	}
	
	public Mode getCurrentMode() {
		return currentMode;
	}
	
	public void setCurrentMode(Mode mode) {
		currentMode = mode;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//DrawSelectRange(g);
						
		/*
		 * 
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
		
		*/
		
	}
	
	public Rectangle SetRect(int x, int y, int w, int h) {
		Rectangle temp = new Rectangle(x, y, w, h);
		return temp;
	}
	
	/*
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
	
	*/
	
	
	
	
}
