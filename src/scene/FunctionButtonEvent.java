package scene;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FunctionButtonEvent implements ActionListener{

	private static FunctionButtonEvent functionButtonEvent;
	
	private FunctionButtonEvent() {
		
	}
	
	public static FunctionButtonEvent getInstance() {
		if(functionButtonEvent == null) functionButtonEvent = new FunctionButtonEvent();
		return functionButtonEvent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//UMLEditor.getInstance().changeButtonColor(e.getSource());
		//Canvas.getInstance().setCurrentMode(mode);
	}

}
