package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import scene.GUI;
import scene.MyButton;
import scene.MyCanvas;

public class MyButton_select extends MyButton {
	
	private ObjectListener ol = new ObjectListener();
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
			oc.addMouseListener(ol);
			/*
			oc.addMouseListener(new MouseAdapter() {	
				@Override
				public void mouseClicked(MouseEvent e) {
					//ClassClicked();
				}
			});
			*/
		}
	}
	
	class ObjectListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Object clicked.");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
