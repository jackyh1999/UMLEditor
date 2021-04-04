package controller.menu;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import controller.mode.Mode;

public class MyMenuItem_group extends JMenuItem implements ActionListener{

	public MyMenuItem_group() {
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("item select");
		Mode.mode.Group();
		
	}

}
