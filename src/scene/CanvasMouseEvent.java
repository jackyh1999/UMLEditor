package scene;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CanvasMouseEvent implements MouseListener, MouseMotionListener{

	private Canvas canvas;
	
	@Override
	public void mouseClicked(MouseEvent e) {		
		canvas.getCurrentMode().handleCanvasClicked(e);
		//repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		//mouse_begin_x = e.getX();
		//mouse_begin_y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		canvas.getCurrentMode().handleCanvasReleased();
		//RangeInit();
		//repaint();	
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		/*
		mouse_end_x = e.getX();
		mouse_end_y = e.getY();
		range_rect.x = Math.min(mouse_begin_x, mouse_end_x);
		range_rect.y = Math.min(mouse_begin_y, mouse_end_y);
		range_rect.width = Math.abs(mouse_end_x - mouse_begin_x);
		range_rect.height = Math.abs(mouse_end_y - mouse_begin_y);	
		repaint();		
		*/
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {

	}
}
