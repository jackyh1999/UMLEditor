package model.object;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class ClassType extends ObjectType{

	private int classHeight = 30;
	private int attributeHeight = 30;
	private int operationHeight = 30;
	private List<String> attributes;
	private List<String> operations;
	
	public ClassType(){
		attributes = new ArrayList<String>();
		operations = new ArrayList<String>();
		width = 150;
		height = calculateTotalHeight();
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
	}
	
	private int calculateTotalHeight() {
		return classHeight + attributeHeight * (attributes.size()+1) + operationHeight * (operations.size()+1);
	}

	
	
}
