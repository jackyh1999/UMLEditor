package model.object;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public abstract class ObjectType {

	protected int width;
	protected int height;
	protected String name = "";
	protected final Font font = new Font("Times New Roman",Font.BOLD,16);
	
	public abstract void draw(int x, int y, Graphics g);

	public void setName(String name) {
		this.name = name;
	}
	
	public void drawCenteredString(Graphics g, String text, int x, int y, int width, int height) {
	    FontMetrics metrics = g.getFontMetrics(font);
	    int centerX = x + (width - metrics.stringWidth(text)) / 2;
	    int centerY = y + ((height - metrics.getHeight()) / 2) + metrics.getAscent();
	    g.drawString(text, centerX, centerY);
	}
}
