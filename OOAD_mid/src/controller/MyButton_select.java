package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import scene.GUI;
import scene.MyButton;
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
		for(Object_class oc : MyCanvas.class_list) {
			oc.addMouseListener(new MouseAdapter() {	
				@Override
				public void mouseClicked(MouseEvent e) {
					//ClassClicked();
				}
			});
		}
	}

}
