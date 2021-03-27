package controller;

import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.util.ArrayList;

import scene.MyCanvas;

public class Mode_class extends Mode{
	
	@Override
	public void dosomething() {
		Rectangle r = new Rectangle(MouseInfo.getPointerInfo().getLocation());	
		r.setSize(50, 50);
		MyCanvas.class_list.add(r);
		System.out.println(r.x + " " + r.y);
		System.out.println("Draw class.");
	}
}
