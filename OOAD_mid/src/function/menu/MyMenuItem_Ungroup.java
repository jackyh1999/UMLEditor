package function.menu;

import java.awt.event.ActionEvent;

import function.mode.MyMode;

public class MyMenuItem_Ungroup extends MyMenuItem{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MyMode.mode.UnGroup();
	}

}
