package scene;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.OverlayLayout;

import controller.menu.MyMenuItem_changename;
import controller.menu.MyMenuItem_group;
import controller.menu.MyMenuItem_ungroup;
import controller.mybutton.*;


public class GUI {
	
	public static JFrame main_frame = new JFrame("UMLEditor");

	public static JMenuBar menu_bar = new JMenuBar();
	public static JMenu menu_file = new JMenu("File");
	public static JMenu menu_edit = new JMenu("Edit"); 
	public static JMenuItem mitem_group = new MyMenuItem_group();
	public static JMenuItem mitem_ungroup = new MyMenuItem_ungroup();
	public static JMenuItem mitem_changename = new MyMenuItem_changename();
	
	private static ImageIcon icon_select = new ImageIcon("src/Material/select.PNG");
	private static ImageIcon icon_assline = new ImageIcon("src/Material/assline.PNG");
	private static ImageIcon icon_genline = new ImageIcon("src/Material/genline.PNG");
	private static ImageIcon icon_compline = new ImageIcon("src/Material/compline.PNG");
	private static ImageIcon icon_class = new ImageIcon("src/Material/class.PNG");
	private static ImageIcon icon_usecase = new ImageIcon("src/Material/usecase.PNG");	
	
	public static JButton btn_select = new MyButton_select(icon_select);
	public static JButton btn_assline = new MyButton_assline(icon_assline);
	public static JButton btn_genline = new MyButton_genline(icon_genline); 
	public static JButton btn_compline = new MyButton_compline(icon_compline);
	public static JButton btn_class = new MyButton_class(icon_class);
	public static JButton btn_usecase = new MyButton_usecase(icon_usecase);
	
	public static final int button_width = 80;
	public static final int button_height = 80;
	
	public static MyCanvas main_canvas = new MyCanvas();
	public static final int canvas_xaxis = 120;
	public static final int canvas_yaxis = 60;	
	
	public static JPanel change_name_window = new JPanel(new FlowLayout());
	public static JTextArea cnw_textarea = new JTextArea();
	public static JButton cnw_btn_ok = new MyButton_cnwok();
	public static JButton cnw_btn_cancel = new MyButton_cnwcancel();
	public static int object_layer = 0;
	
	public GUI() {
		
		
		MainFrameInit();
		MenuBarInit();
		MenuInit();
		ButtonSelectInit();
		ButtonAsslineInit();
		ButtonGenlineInit();
		ButtonComplineInit();
		ButtonClassInit();
		ButtonUsecaseInit();
		MainCanvasInit();
		ChangeNameWindowInit();
	}
	
	private void MainFrameInit(){
		main_frame.setSize(800, 700);
		main_frame.setResizable(false);
		main_frame.setLayout(null);
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
        main_frame.setVisible(true);
        //main_frame.add(new MyCanvas());
	}
	
	private void MenuBarInit() {
		menu_bar.setBounds(0, 0, 800, 40);		
		menu_bar.add(menu_file);
		menu_bar.add(menu_edit);
		
		main_frame.add(menu_bar);
	}
	
	private void MenuInit() {
		mitem_group.setText("Group");
		mitem_ungroup.setText("UnGroup");
		mitem_changename.setText("Change object name");
		
		menu_edit.add(mitem_group);
		menu_edit.add(mitem_ungroup);
		menu_edit.add(mitem_changename);
	}
	
	private void ButtonSelectInit() {
		btn_select.setLocation(20, 60);
	}
	
	private void ButtonAsslineInit() {
		btn_assline.setBounds(20,160,button_width,button_height);
	}
	
	private void ButtonGenlineInit() {
		btn_genline.setBounds(20,260,button_width,button_height);
	}
	
	private void ButtonComplineInit() {
		btn_compline.setBounds(20,360,button_width,button_height);
	}
	
	private void ButtonClassInit() {
		btn_class.setBounds(20,460,button_width,button_height);
	}
	
	private void ButtonUsecaseInit() {
		btn_usecase.setBounds(20,560,button_width,button_height);
	}
	
	private void MainCanvasInit() {
		//main_canvas.setLayout(new OverlayLayout(main_canvas));
		main_canvas.setLocation(120, 60);
		main_canvas.setSize(640, 580);
		main_canvas.setBackground(Color.WHITE);
		main_canvas.setOpaque(true);
	}	
	
	private void ChangeNameWindowInit() {
		
		//change_name_window.setBounds(250, 250, 300, 200);
		change_name_window.setLocation(150, 250);
		change_name_window.setSize(250, 40);
		change_name_window.setBackground(Color.LIGHT_GRAY);
		
		/*
		cnw_textarea.setLocation(50, 50);
		cnw_textarea.setSize(200, 50);
		cnw_btn_ok.setLocation(50, 150);
		cnw_btn_ok.setSize(100, 50);
		*/
		cnw_textarea.setPreferredSize(new Dimension(100, 20));
		cnw_btn_ok.setText("OK");
		cnw_btn_cancel.setText("Cancel");
		//cnw_btn_ok.setSize(50, 20);
		//cnw_btn_cancel.setSize(50, 20);
		change_name_window.add(cnw_textarea);
		
		change_name_window.add(cnw_btn_ok);
		change_name_window.add(cnw_btn_cancel);
		change_name_window.setVisible(false);
		change_name_window.setEnabled(false);
		//change_name_window.setOpaque(true);
		main_canvas.add(change_name_window);
	}
		
}
