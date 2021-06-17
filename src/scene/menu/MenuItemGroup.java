package scene.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import controller.ObjectController;

public class MenuItemGroup extends JMenuItem implements ActionListener{

	private final String text = "Group";
	
	public MenuItemGroup() {
		this.setText(text);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ObjectController.getInstance().group();
	}
	
}
