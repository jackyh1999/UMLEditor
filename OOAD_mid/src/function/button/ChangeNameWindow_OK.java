package function.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import function.mode.MyMode_Select;
import function.object.MyObject;
import scene.GUI;

public class ChangeNameWindow_OK extends JButton{

	public ChangeNameWindow_OK() {
		this.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				ObjectSetText();
			}
		});
	}

	public void ObjectSetText() {
		// TODO Auto-generated method stub
		MyObject mo = MyMode_Select.selected_list.get(0);
		mo.SetText(GUI.window_textarea.getText()); 
		GUI.change_name_window.setVisible(false);
		GUI.change_name_window.setEnabled(false);
		GUI.main_canvas.repaint();
	}

	
}
