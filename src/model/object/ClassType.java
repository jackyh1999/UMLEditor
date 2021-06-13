package model.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

public class ClassType extends ObjectType{
	
	//private int width = 150;
	private int classHeight = 30;
	private int attributeHeight = 30;
	private int operationHeight = 30;
	private List<String> attributes;
	private List<String> operations;
	
	public ClassType(){
		attributes = new ArrayList<String>();
		operations = new ArrayList<String>();
		this.width = 150;
		this.height = calculateTotalHeight();
	}
	
	@Override
	public void draw(int x, int y, Graphics g) {
		//System.out.println("draw class");
		int totalHeight = calculateTotalHeight();
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x, y, width, totalHeight);

		g.setColor(Color.BLACK);
		g.drawRect(x, y, width , totalHeight);
		g.drawLine(x, y + classHeight , x + width , y + classHeight);	
		g.drawLine(x, y + classHeight + attributeHeight * (attributes.size()+1) , x + width , y + classHeight + attributeHeight * (attributes.size()+1));
		
		g.drawString(name, x + width/2 - name.length()*font, y + font);	
	}
	
	private int calculateTotalHeight() {
		return classHeight + attributeHeight * (attributes.size()+1) + operationHeight * (operations.size()+1);
	}
	/*
	public Class(int x, int y) {
		
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
	
	
	*/
	
}
