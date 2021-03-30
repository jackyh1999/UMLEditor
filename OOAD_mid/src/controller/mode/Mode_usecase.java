package controller.mode;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.object.Object_usecase;
import controller.object.MyObject;
import scene.MyCanvas;

public class Mode_usecase extends Mode{

	@Override
	public void CanvasClicked() {		
		MyObject su = new Object_usecase(MouseInfo.getPointerInfo().getLocation());
	}
}
