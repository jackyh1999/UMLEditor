package function.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import function.mode.MyMode_Select;
import function.object.MyObject;
import scene.GUI;

public class ChangeNameWindow_OK extends JButton implements ActionListener{

	public ChangeNameWindow_OK() {
		this.addActionListener(this);
		/*
		this.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				ObjectSetText();
			}
		});
		*/
	}

	public void ObjectSetText() {
		MyObject mo = MyMode_Select.selected_list.get(0);
		mo.SetText(GUI.window_textarea.getText()); 
		GUI.window_textarea.setText("");
		GUI.change_name_window.setVisible(false);
		GUI.change_name_window.setEnabled(false);
		GUI.main_canvas.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ObjectSetText();		
	}
	
}
