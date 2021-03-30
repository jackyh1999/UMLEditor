package controller.mode;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import controller.object.MyObject;
import controller.object.Object_class;
import scene.MyCanvas;

public class Mode_class extends Mode{
	
	@Override
	public void CanvasClicked() {
		MyObject mo = new Object_class(MouseInfo.getPointerInfo().getLocation());
	}
}
