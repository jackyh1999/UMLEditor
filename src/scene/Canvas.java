package scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import mode.DefaultMode;
import mode.Mode;
import model.line.Line;
import model.object.BaseObject;
import model.object.MyObject;

public class Canvas extends JPanel implements MouseListener, MouseMotionListener{
 
	private static Canvas canvas; 
	
	private List<MyObject> objectList;	// 當前畫布上的物件(包含基本物件和群組物件)
	private List<BaseObject> layers;	// 圖層(只增加不減少，除非刪除物件)
	private List<Line> lineList;
	private Mode currentMode;
	
	private final int x = 150;
	private final int y = 120;
	private final int width = 600;
	private final int height = 500;

	private Rectangle selectRange;
	
	private Canvas() {
		
		objectList = new ArrayList<MyObject>();
		layers = new ArrayList<BaseObject>();
		lineList = new ArrayList<Line>();
		selectRange = new Rectangle();
		currentMode = new DefaultMode();
		
		this.setLocation(x, y);
		this.setSize(width, height);
		this.setBackground(Color.WHITE);
		this.setVisible(true);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	public static Canvas getInstance() {
		if(canvas == null) {
			canvas = new Canvas();
		}
		return canvas;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillRect(selectRange.x, selectRange.y, selectRange.width, selectRange.height);
		
		for(BaseObject obj : layers) obj.draw(g);
		for(Line line : lineList) line.draw(g);
		
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
	
	public List<BaseObject> getLayers(){
		return layers;
	}
	
	public List<Line> getLineList(){
		return lineList;
	}
	
	public void setSelectRange(Rectangle r) {
		selectRange = r;
	}
	
	public MyObject chooseObject(int x, int y) {
		// 優先選最上層物件
		for(int depth = layers.size()-1; depth >= 0; depth--) {
			MyObject obj = layers.get(depth);
			if( obj.isContain(x,y) ) {
				// 若物件屬於某個群組物件，則回傳群組物件
				while(obj.getGroup() != null) obj = (MyObject) obj.getGroup();
				return obj;
			}
		}
		return null;
	}
	
	public BaseObject chooseBaseObject(int x, int y) {
		for(int depth = layers.size()-1; depth >= 0; depth--) {
			// 只回傳單一物件
			BaseObject obj = layers.get(depth);
			if( obj.isContain(x,y) ) return obj;
		}
		return null;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		currentMode.handleCanvasDragged(e);
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		currentMode.handleCanvasClicked(e);
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
		currentMode.handleCanvasPressed(e);
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		currentMode.handleCanvasReleased(e);
		repaint();
	}
	
}
