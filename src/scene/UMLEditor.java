package scene;

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
	private List<FunctionButton> btnList;
	
	private int btnNum;
	
	private Canvas canvas;
	private static JPanel changeNameWindow = new JPanel(new FlowLayout());
	/*
	
	public static JTextArea window_textarea = new JTextArea();	
	
	
	private JMenu menu_file = new JMenu("File");
	private JMenu menu_edit = new JMenu("Edit"); 
	
	private JMenuItem item_group = new MyMenuItem_Group();
	private JMenuItem item_ungroup = new MyMenuItem_Ungroup();
	private JMenuItem item_changename = new MyMenuItem_ChangeName();	
	
	private MyButton btn_select = new MyButton_Select();
	private MyButton btn_assline = new MyButton_AssociationLine();
	private MyButton btn_genline = new MyButton_GeneralizationLine(); 
	private MyButton btn_compline = new MyButton_CompositionLine();
	private MyButton btn_class = new MyButton_Class();
	private MyButton btn_usecase = new MyButton_UseCase();
		
	private JButton cnw_btn_ok = new ChangeNameWindow_OK();
	private JButton cnw_btn_cancel = new ChangeNameWindow_Cancel();		
	
	private final int change_name_window_x = 150;
	private final int change_name_window_y = 250;
	private final int change_name_window_width = 250;
	private final int change_name_window_height = 40;
	private Dimension window_textarea_size = new Dimension(100, 20);
	
	*/
	private static UMLEditor umlEditor;
	
	private UMLEditor() {
			
		menuBar = new MyMenuBar();
		
		btnNum = 0;
		btnList = new ArrayList<FunctionButton>();
		btnList.add( new FunctionButton(btnNum++, new ImageIcon("src/material/select.PNG"),   new SelectMode()) );
		btnList.add( new FunctionButton(btnNum++, new ImageIcon("src/material/assline.PNG"),  new AssociationMode()) );
		btnList.add( new FunctionButton(btnNum++, new ImageIcon("src/material/genline.PNG"),  new GeneralizationMode()) ); 
		btnList.add( new FunctionButton(btnNum++, new ImageIcon("src/material/compline.PNG"), new CompositionMode()) );
		btnList.add( new FunctionButton(btnNum++, new ImageIcon("src/material/class.PNG"),    new ClassMode()) );
		btnList.add( new FunctionButton(btnNum++, new ImageIcon("src/material/usecase.PNG"),  new UseCaseMode()) );
		
		canvas = Canvas.getInstance();
		
		this.add(menuBar);
		for( FunctionButton btn : btnList) this.add(btn);
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
	
	public void changeButtonColor(FunctionButton btnClicked) {
		for( FunctionButton btn : btnList ) {
			if(btn.equals(btnClicked)) btn.setBackground(Color.GRAY);
			else btn.setBackground(null);			
		}	
	}
	
	/*
	public UMLEditor() {		
		
		MainFrameInit();
		MenuBarInit();
		MenuInit();
		MainCanvasInit();
		ChangeNameWindowInit();
		
	}
	
	private void MainFrameInit(){
		main_frame.setSize(main_frame_width, main_frame_height);
		main_frame.setResizable(false);
		main_frame.setLayout(null);
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
        main_frame.setVisible(true);
	}
	
	private void MenuInit() {
		item_group.setText("Group");
		item_ungroup.setText("UnGroup");
		item_changename.setText("Change object name");
		
		menu_edit.add(item_group);
		menu_edit.add(item_ungroup);
		menu_edit.add(item_changename);
	}
		
	private void MainCanvasInit() {
		main_canvas.setLocation(main_canvas_x, main_canvas_y);
		main_canvas.setSize(main_canvas_width, main_canvas_height);
		main_canvas.setBackground(Color.WHITE);
		main_canvas.setOpaque(true);
	}	
	
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
