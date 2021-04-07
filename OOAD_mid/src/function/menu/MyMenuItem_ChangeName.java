package function.menu;

import java.awt.event.ActionEvent;

import function.mode.MyMode;

public class MyMenuItem_ChangeName extends MyMenuItem{
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		MyMode.mode.ChangeName();
	}
}
