package controller.mybutton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import scene.GUI;

public class MyButton_cnwcancel extends JButton{

	
	public MyButton_cnwcancel() {
		this.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				CloseWindow();
				System.out.println("cancel");
			}
		});
	}

	public void CloseWindow() {
		// TODO Auto-generated method stub
		GUI.change_name_window.setVisible(false);
		//GUI.change_name_window.setEnabled(false);
	}


}
