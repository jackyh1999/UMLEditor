package controller;

import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class Shape_usecase {

	public static final int width = 150;
	public static final int height = 100;
	
	public Shape_usecase(Image newimg, Point p) {
		this.img = newimg;
		this.x = p.x;
		this.y = p.y;
	}
	
	public Image img;
	public int x;
	public int y;
}
