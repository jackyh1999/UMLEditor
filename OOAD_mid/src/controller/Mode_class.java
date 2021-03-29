package controller;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import scene.MyCanvas;

public class Mode_class extends Mode{
	
	@Override
	public void dosomething() {
		
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src/material/class.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image newimg = img.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		Object_class sc = new Object_class(MouseInfo.getPointerInfo().getLocation());
		//MyCanvas.class_list.add(sc);
		
		//System.out.println(r.x + " " + r.y);
		System.out.println("Draw class.");
	}
}
