package function.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import scene.GUI;

public class ChangeNameWindow_Cancel extends JButton{
	
	public ChangeNameWindow_Cancel() {
		this.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				CloseWindow();
				System.out.println("cancel");
			}
		});
	}

	public void CloseWindow() {
		GUI.change_name_window.setVisible(false);
		//GUI.change_name_window.setEnabled(false);
	}


}
