package scene.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ChangeNameWindow_Cancel extends JButton implements ActionListener{
	
	public ChangeNameWindow_Cancel() {
		this.addActionListener(this);
	}

	public void CloseWindow() {
		//GUI.window_textarea.setText("");
		//GUI.change_name_window.setVisible(false);
		//GUI.change_name_window.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CloseWindow();	
	}
}
