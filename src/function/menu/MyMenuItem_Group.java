package function.menu;

import java.awt.event.ActionEvent;

import function.mode.MyMode;

public class MyMenuItem_Group extends MyMenuItem {

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("item select");
		MyMode.mode.Group();
		
	}

}
