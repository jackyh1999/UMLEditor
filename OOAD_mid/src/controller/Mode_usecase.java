package controller;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import scene.MyCanvas;

public class Mode_usecase extends Mode{

	@Override
	public void dosomething() {
		
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src/material/usecase.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image newimg = img.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		Shape_usecase su = new Shape_usecase(newimg, MouseInfo.getPointerInfo().getLocation());
		MyCanvas.usecase_list.add(su);
		
		System.out.println("Draw usecase.");
		
	}
}
