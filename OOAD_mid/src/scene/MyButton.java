package scene;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;

public abstract class MyButton extends JButton{
	
	public static ArrayList<JButton> button_list = new ArrayList<JButton>();
	
	public MyButton() {
		button_list.add(this);
		GUI.main_frame.add(this);
		this.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				ButtonClicked();
			}
		});
	}
	
	public void ButtonClicked() {
		System.out.println("Clicked.");
		for(JButton btn : button_list) {
			if(btn.equals(this)) 
				this.setBackground(Color.BLACK);
			else
				btn.setBackground(Color.WHITE);			
		}	
		this.ButtonAction();
	}
	
	public abstract void ButtonAction();
}


