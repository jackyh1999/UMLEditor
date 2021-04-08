package function.button;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import scene.GUI;

public abstract class MyButton extends JButton implements ActionListener{
	
	public static ArrayList<MyButton> button_list = new ArrayList<MyButton>();
	
	private final int icon_width = 60;
	private final int icon_height = 50;
	private int x;
	private int y;
	protected final int width = 80;
	protected final int height = 80;
	protected ImageIcon icon;
	
	public MyButton() {
		addActionListener(this);
		button_list.add(this);
		GUI.main_frame.add(this);		
		
	}
	
	public void ButtonChangeColor() {
		
		for(MyButton btn : button_list) {
			if(btn.equals(this)) 
				this.setBackground(Color.GRAY);
			else
				btn.setBackground(null);			
		}	
		
	}
	
	public void ChangeMode() {
		
	}
	
	public ImageIcon AdjustIconSize(ImageIcon icon) {
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance( icon_width, icon_height, Image.SCALE_SMOOTH ) ;  
		icon.setImage(newimg);
		return icon;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ButtonChangeColor();
		this.ChangeMode();
	}
}


