package scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import mode.Mode;
import model.line.Line;
import model.object.MyObject;

public class Canvas extends JPanel implements MouseListener, MouseMotionListener{
 
	private static Canvas canvas; 
	
	
	private List<MyObject> objectList;
	private List<Line> lineList;
	private Mode currentMode;
	
	private final int x = 120;
	private final int y = 60;
	private final int width = 640;
	private final int height = 580;
		
	private int selectRangeX = 0;
	private int selectRangeY = 0;
	private int selectRangeWidth = 0;
	private int selectRangeHeight = 0;
	private Rectangle selectRange;
	/*
	public static int object_layer = 0;	
	public final static int canvas_x = 128;
	public final static int canvas_y = 91;
	
	
	
	private int mouse_begin_x;
	private int mouse_begin_y;
	private int mouse_end_x;
	private int mouse_end_y;
	
	*/
	
	private Canvas() {
		//GUI.main_frame.add(this);
		
		objectList = new ArrayList<MyObject>();
		lineList = new ArrayList<Line>();
		selectRange = new Rectangle();
		
		this.setLocation(x, y);
		this.setSize(width, height);
		this.setBackground(Color.WHITE);
		//this.setOpaque(true);
		this.setVisible(true);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		//System.out.println("Canvas created");
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
		System.out.println("Current mode: " + mode.getClass().getSimpleName());
	}
	
	public List<MyObject> getObjectList(){
		return objectList;
	}
	
	public List<Line> getLineList(){
		return lineList;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillRect(selectRange.x, selectRange.y, selectRange.width, selectRange.height);
		
		for(MyObject obj : objectList) obj.draw(g);
		for(Line line : lineList) line.draw(g);
		
		// for(Line line : lineList) line.Draw(g);
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
	/*
	public Rectangle SetRect(int x, int y, int w, int h) {
		Rectangle temp = new Rectangle(x, y, w, h);
		return temp;
	}
	 */
	
	public void setSelectRangeX(int x) {
		selectRangeX = x;
	}
	
	public void setSelectRangeY(int y) {
		selectRangeY = y;
	}
	
	public void setSelectRangeWidth(int width) {
		selectRangeWidth = width;
	}

	public void setSelectRangeHeight(int height) {
		selectRangeHeight = height;
	}
	
	public void setSelectRange(Rectangle r) {
		selectRange = r;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		currentMode.handleCanvasDragged(e);
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		currentMode.handleCanvasClicked(e);
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		currentMode.handleCanvasPressed(e);
		repaint();
		//System.out.println("handle mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		currentMode.handleCanvasReleased(e);
		repaint();
	}
	
	public MyObject chooseObject(int x, int y) {
		
		for(int depth = objectList.size()-1; depth >= 0; depth--) {
			if( objectList.get(depth).isContain(x,y) ) {
				return objectList.get(depth);
			}
		}
		return null;
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
