package scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import controller.*;


public class GUI {
	
	public static JFrame main_frame = new JFrame("UMLEditor");

	public static JMenuBar menu_bar = new JMenuBar();
	public static JMenu menu_file = new JMenu("File");
	public static JMenu menu_edit = new JMenu("Edit"); 
	
	public static JButton btn_select = new MyButton_select();
	public static JButton btn_assline = new MyButton_assline();
	public static JButton btn_genline = new MyButton_genline(); 
	public static JButton btn_compline = new MyButton_compline();
	public static JButton btn_class = new MyButton_class();
	public static JButton btn_usecase = new MyButton_usecase();
	
	private final int button_width = 80;
	private final int button_height = 80;
	
	public static JPanel main_canvas = new MyCanvas();
	public static final int canvas_xaxis = 120;
	public static final int canvas_yaxis = 60;
	
	public GUI() {
		
		MainFrameInit();
		MenuBarInit();
		ButtonSelectInit();
		ButtonAsslineInit();
		ButtonGenlineInit();
		ButtonComplineInit();
		ButtonClassInit();
		ButtonUsecaseInit();
		MainCanvasInit();
	}
	
	private void MainFrameInit(){
		main_frame.setSize(800, 700);
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
	
	private void ButtonSelectInit() {
		btn_select.setBounds(20,60,button_width,button_height);	
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
		main_canvas.setBounds(120, 60, 640, 580);
		//canvas.setBackground(Color.WHITE);	
	}
}
