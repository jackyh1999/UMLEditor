package function.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import function.mode.MyMode;
import scene.GUI;
import scene.MyCanvas;

public class MyObject_Class extends MyObject implements MouseListener, MouseMotionListener{
	
	private final int w = 150;
	private final int h = 100;
	private final int class_num = 3;
	private int gap;
	
	public MyObject_Class(int x, int y) {
		
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.center_x = this.x + this.width/2;
		this.center_y = this.y + this.height/2;
		this.gap = this.height / this.class_num;
		this.layer = MyCanvas.object_layer++;
		this.setLocation(this.x, this.y);
		this.setSize(this.width, this.height);
		this.addMouseListener(this);	
		this.addMouseMotionListener(this);
		this.CreatePort();		
		MyObject.object_list.add(this);		
		GUI.main_canvas.add(this, this.layer, 0);
	}
	
	@Override
	public void DrawObject(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(this.x, this.y, this.width, this.height);
		
		g.setColor(Color.BLACK);
		g.drawRect(this.x, this.y, this.width, this.height);
		for(int i=1;i<this.class_num;i++) {
			g.drawLine(this.x, this.y + this.gap*i , this.x + this.width , this.y + this.gap*i);
		}
		g.drawString(this.text, this.center_x, this.y + this.gap/2);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		MyMode.mode.ObjectClicked(this, e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		MyMode.mode.ObjectPressed(this, e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		MyMode.mode.ObjectReleased(this, e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		MyMode.mode.ObjectEntered(this);
	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		MyMode.mode.ObjectDragged(this);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	}
	
}
