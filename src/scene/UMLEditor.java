package scene;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.OverlayLayout;

import mode.AssociationMode;
import mode.ClassMode;
import mode.CompositionMode;
import mode.GeneralizationMode;
import mode.SelectMode;
import mode.UseCaseMode;
import scene.Canvas;
import scene.menu.MyMenuBar;

public class UMLEditor extends JFrame{
	
	private final int width = 800;
	private final int height = 700;
	private final String title = "UMLEditor";
	
	private JMenuBar menuBar;
	private List<ModeButton> btnList;
	
	private int btnNum;
	
	private JPanel canvas;
	private JPanel changeNameWindow;
	/*

	private Dimension window_textarea_size = new Dimension(100, 20);
	
	*/
	private static UMLEditor umlEditor;
	
	private UMLEditor() {
			
		menuBar = new MyMenuBar();
		
		btnNum = 0;
		btnList = new ArrayList<ModeButton>();
		btnList.add( new ModeButton(btnNum++, new ImageIcon("src/material/select.PNG"),   new SelectMode()) );
		btnList.add( new ModeButton(btnNum++, new ImageIcon("src/material/assline.PNG"),  new AssociationMode()) );
		btnList.add( new ModeButton(btnNum++, new ImageIcon("src/material/genline.PNG"),  new GeneralizationMode()) ); 
		btnList.add( new ModeButton(btnNum++, new ImageIcon("src/material/compline.PNG"), new CompositionMode()) );
		btnList.add( new ModeButton(btnNum++, new ImageIcon("src/material/class.PNG"),    new ClassMode()) );
		btnList.add( new ModeButton(btnNum++, new ImageIcon("src/material/usecase.PNG"),  new UseCaseMode()) );
		
		canvas = Canvas.getInstance();
		changeNameWindow = ChangeNameWindow.getInstance();
		
		//overlay = new JPanel();
		//overlay.setLayout(new OverlayLayout(overlay));
		
		this.add(menuBar);
		for( ModeButton btn : btnList) this.add(btn);
		this.add(changeNameWindow);
		this.add(canvas);
		//this.add(overlay);
		
		this.setTitle(title);
		this.setSize(width, height);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static UMLEditor getInstance() {
		if(umlEditor == null) umlEditor = new UMLEditor();
		return umlEditor;
	}
	
	public void changeButtonColor(ModeButton btnClicked) {
		for( ModeButton btn : btnList ) {
			if(btn.equals(btnClicked)) btn.setBackground(Color.GRAY);
			else btn.setBackground(null);			
		}	
	}
	/*
	
	private void ChangeNameWindowInit() {
		
		change_name_window.setLocation(change_name_window_x, change_name_window_y);
		change_name_window.setSize(change_name_window_width, change_name_window_height);
		change_name_window.setBackground(Color.GRAY);
		window_textarea.setPreferredSize(window_textarea_size);
		cnw_btn_ok.setText("OK");
		cnw_btn_cancel.setText("Cancel");
		change_name_window.add(window_textarea);
		
		change_name_window.add(cnw_btn_ok);
		change_name_window.add(cnw_btn_cancel);
		change_name_window.setVisible(false);
		change_name_window.setEnabled(false);
		main_canvas.add(change_name_window, 100, 0);
	}
	*/
}
