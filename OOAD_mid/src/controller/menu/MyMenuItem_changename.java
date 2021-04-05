package controller.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import controller.mode.Mode;

public class MyMenuItem_changename extends JMenuItem implements ActionListener{

	public MyMenuItem_changename() {
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Mode.mode.ChangeName();
	}
	
}
