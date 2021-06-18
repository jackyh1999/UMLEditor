package scene;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import mode.AssociationMode;
import mode.ClassMode;
import mode.CompositionMode;
import mode.GeneralizationMode;
import mode.SelectMode;
import mode.UseCaseMode;
import scene.menu.MyMenuBar;

public class UMLEditor extends JFrame{
	
	private static UMLEditor umlEditor;
	
	private final int width = 800;
	private final int height = 700;
	private final String title = "UMLEditor";
	
	private JMenuBar menuBar;
	private List<ModeButton> btnList;
	private int btnNum;
	private JPanel canvas;
	private JPanel changeNameWindow;

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
		
		this.add(menuBar);
		for( ModeButton btn : btnList) this.add(btn);
		this.add(changeNameWindow);
		this.add(canvas);
		
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

}
