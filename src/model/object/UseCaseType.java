package model.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UseCaseType extends ObjectType{

	//private int width = 150;
	//private int height = 100;
		
	public UseCaseType() {
		this.width = 150;
		this.height = 100;
	}
	
	@Override
	public void draw(int x, int y, Graphics g) {
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(x, y, width, height);
		
		g.setColor(Color.BLACK);
		g.drawOval(x, y, width, height);
		
		g.drawString(name, x + width/2 - name.length()*font, y + font);	
	}
	/*
	public UseCase(int x, int y) {

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
	
	*/
}
