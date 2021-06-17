package scene;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ObjectController;

public class ChangeNameWindow extends JPanel{
	
	private static ChangeNameWindow changeNameWindow;
	
	private final int x = 300;
	private int y = 60;
	private int width = 250;
	private int height = 40;
	
	private JTextField textField;
	private JButton ok;
	private JButton cancel;
	
	
	private ChangeNameWindow() {
		
		textField = new JTextField();
		ok = new JButton("OK");
		cancel = new JButton("Cancel");
		
		textField.setPreferredSize(new Dimension(100, 30));
		
		//ok.setLocation(x, y);;
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ObjectController.getInstance().changeName(textField.getText());
				closeWindow();
			}
		});
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				closeWindow();
			}
		});
		
		this.setLocation(x, y);
		this.setSize(width, height);
		this.setBackground(Color.GRAY);

		this.add(textField);
		this.add(ok);
		this.add(cancel);
		this.setVisible(false);
	}
	
	public static ChangeNameWindow getInstance() {
		if(changeNameWindow == null) changeNameWindow = new ChangeNameWindow();
		return changeNameWindow;
	}
	
	private void closeWindow() {
		textField.setText(null);
		this.setVisible(false);
		Canvas.getInstance().repaint();
	}
}
