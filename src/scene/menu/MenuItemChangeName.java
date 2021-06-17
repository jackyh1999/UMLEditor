package scene.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import controller.ObjectController;
import scene.ChangeNameWindow;
import scene.UMLEditor;

public class MenuItemChangeName extends JMenuItem implements ActionListener{

	private final String text = "Change Object Name";
	
	public MenuItemChangeName() {
		this.setText(text);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ChangeNameWindow.getInstance().setVisible(true);
	}
}
