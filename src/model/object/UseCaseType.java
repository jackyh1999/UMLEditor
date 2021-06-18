package model.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UseCaseType extends ObjectType{
		
	public UseCaseType() {
		width = 150;
		height = 100;
	}
	
	@Override
	public void draw(int x, int y, Graphics g) {
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(x, y, width, height);
		
		g.setColor(Color.BLACK);
		g.drawOval(x, y, width, height);
		
		drawCenteredString(g, name, x, y, width, height);	
	}
	
}
