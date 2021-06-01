package function.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class MyMenuItem extends JMenuItem implements ActionListener{
	
	public MyMenuItem() {
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
}
