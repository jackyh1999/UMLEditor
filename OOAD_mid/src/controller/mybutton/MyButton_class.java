package controller.mybutton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import controller.mode.Mode;
import scene.MyCanvas;

public class MyButton_class extends MyButton{

	public MyButton_class(ImageIcon icon) {
		this.setIcon(AdjustIconSize(icon));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ButtonAction() {
		// TODO Auto-generated method stub
		Mode.mode = Mode.mode_class;
		System.out.println("Mode:class");
	}	
	
}
