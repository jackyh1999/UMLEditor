package controller.object;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.mode.*;
import scene.GUI;
import scene.MyCanvas;

public class Object_class extends MyObject implements MouseListener, MouseMotionListener{
	
	public static final int width = 150;
	public static final int height = 100;

	
	private Image img;
	public JTextField tf = new JTextField();
	public JPanel aclass = new JPanel();
	public JLabel atext = new JLabel();
	public JTable jt;
	public JLabel img_label = new JLabel();
	//private BufferedImage background;
	
	public Object_class(Point p) {
		
		this.x = p.x-MyCanvas.canvas_x;
		this.y = p.y-MyCanvas.canvas_y;
		
		
		try {
			//background = ImageIO.read(new File("src/material/class.png"));
			img = ImageIO.read(new File("src/material/class.png"));
		}
		catch(IOException e){
			
		}

		MyObject.object_list.add(this);
		GUI.main_canvas.DrawClass(this.x, this.y);

		this.setLocation(this.x, this.y);
		this.setSize(150, 100);
		this.addMouseListener(this);	
		this.addMouseMotionListener(this);
		this.layer = GUI.object_layer++;
		
		this.port =  new Object_port[4];
		this.port[0] = new Object_port(this.x + 70, this.y - 10);
		this.port[1] = new Object_port(this.x + 150, this.y + 45);
		this.port[2] = new Object_port(this.x + 70, this.y + 100);
		this.port[3] = new Object_port(this.x -10 , this.y + 45);
		//this.member_list.add(this);
		
		this.range = new Polygon[4];
		this.range[0] = new Polygon();
		this.range[0].addPoint(this.x, this.y);
		this.range[0].addPoint(this.x + this.width, this.y);
		this.range[0].addPoint(this.x + this.width/2, this.y + this.height/2);
		
		this.range[1] = new Polygon();
		this.range[1].addPoint(this.x + this.width, this.y);
		this.range[1].addPoint(this.x + this.width/2, this.y + this.height/2);
		this.range[1].addPoint(this.x + this.width, this.y + this.height);
		
		this.range[2] = new Polygon();
		this.range[2].addPoint(this.x + this.width/2, this.y + this.height/2);
		this.range[2].addPoint(this.x + this.width, this.y + this.height);
		this.range[2].addPoint(this.x, this.y + this.height);
		
		this.range[3] = new Polygon();
		this.range[3].addPoint(this.x + this.width/2, this.y + this.height/2);
		this.range[3].addPoint(this.x, this.y + this.height);
		this.range[3].addPoint(this.x, this.y);
		
		//MyObject.object_list.add(this);
		GUI.main_canvas.add(this, this.layer, 0);
		//GUI.main_canvas.add(this.lb2, this.layer, 1);
		//GUI.main_canvas.add(this.lb1, this.layer, 2);
		//System.out.println(this.layer);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Class Clicked");
		Mode.mode.ObjectClicked(this);
		//System.out.println("Class Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//getMousePosition();
		Mode.mode.ObjectPressed(this);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		Mode.mode.ObjectReleased(this, e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		Mode.mode.ObjectEntered(this);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Drag");
		Mode.mode.ObjectDragged(this);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
