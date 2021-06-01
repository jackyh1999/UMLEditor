package function.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import function.mode.MyMode;
import scene.GUI;
import scene.MyCanvas;

public class MyObject_UseCase extends MyObject implements MouseListener{

	private final int w = 150;
	private final int h = 100;
		
	public MyObject_UseCase(int x, int y) {

		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.center_x = this.x + this.width/2;
		this.center_y = this.y + this.height/2;
		this.layer = MyCanvas.object_layer++;
		//this.center = new Point(this.center_x, this.center_y);
		this.setLocation(this.x, this.y);
		this.setSize(this.width, this.height);
		this.addMouseListener(this);	
		this.addMouseMotionListener(this);
		this.CreatePort();		
		
		MyObject.object_list.add(this);
		//GUI.main_canvas.DrawClass(this.x, this.y);		
		GUI.main_canvas.add(this, this.layer, 0);
		
	}

	@Override
	public void DrawObject(Graphics g) {
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(this.x, this.y, this.width, this.height);
		
		g.setColor(Color.BLACK);
		g.drawOval(this.x, this.y, this.width, this.height);
		
		g.drawString(this.text, this.center_x, this.y + this.height/2);
		
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
