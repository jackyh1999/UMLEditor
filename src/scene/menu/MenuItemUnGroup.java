package scene.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class MenuItemUnGroup extends JMenuItem implements ActionListener{

	private final String text = "UnGroup";
	
	public MenuItemUnGroup() {
		this.setText(text);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
