package controller.mybutton;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import scene.GUI;

public abstract class MyButton extends JButton{
	
	public static ArrayList<JButton> button_list = new ArrayList<JButton>();
	
	public MyButton() {
		
		this.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				ButtonClicked();
			}
		});
		
		button_list.add(this);
		GUI.main_frame.add(this);		
		
	}
	
	public void ButtonClicked() {
		
		for(JButton btn : button_list) {
			if(btn.equals(this)) 
				this.setBackground(Color.DARK_GRAY);
			else
				btn.setBackground(null);			
		}	
		this.ChangeMode();
	}
	
	public abstract void ChangeMode();
	
	public ImageIcon AdjustIconSize(ImageIcon icon) {
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance( 60, 50,  Image.SCALE_SMOOTH ) ;  
		icon.setImage(newimg);
		return icon;
	}
}


