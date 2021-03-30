package controller.mybutton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import controller.mode.Mode;
import scene.GUI;
import scene.MyCanvas;

public class MyButton_select extends MyButton {
	
	
	public MyButton_select(ImageIcon icon) {
		this.setSize(GUI.button_width, GUI.button_height);
		this.setIcon(AdjustIconSize(icon));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ButtonAction() {
		// TODO Auto-generated method stub
		Mode.mode = Mode.mode_select;
		System.out.println("Mode:select.");
		
	}

}
