package controller.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import controller.mode.Mode;

public class MyMenuItem_ungroup extends JMenuItem implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Mode.mode.UnGroup();
	}

}
