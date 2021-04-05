package controller.mybutton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import controller.mode.Mode;
import controller.mode.Mode_select;
import controller.object.MyObject;
import scene.GUI;

public class MyButton_cnwok extends JButton{

	public MyButton_cnwok() {
		this.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				ObjectSetText();
			}
		});
	}
	

	public void ObjectSetText() {
		// TODO Auto-generated method stub
		MyObject mo = Mode_select.selected_list.get(0);
		mo.text = GUI.cnw_textarea.getText();
		GUI.change_name_window.setVisible(false);
		GUI.change_name_window.setEnabled(false);
		GUI.main_canvas.repaint();
	}

	
}
