package model.object;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
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
		
		int totalHeight = calculateTotalHeight();
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x, y, width, totalHeight);

		g.setColor(Color.BLACK);
		g.drawRect(x, y, width , totalHeight);
		g.drawLine(x, y + classHeight , x + width , y + classHeight);	
		g.drawLine(x, y + classHeight + attributeHeight * (attributes.size()+1) , x + width , y + classHeight + attributeHeight * (attributes.size()+1));

	    drawCenteredString(g, name, x, y, width, classHeight);
		//g.drawString(name, x + width/2 - (name.length()/2)*font., y + classHeight - font);	
	}
	
	private int calculateTotalHeight() {
		return classHeight + attributeHeight * (attributes.size()+1) + operationHeight * (operations.size()+1);
	}

	
	
}
