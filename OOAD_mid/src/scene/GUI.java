package scene;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import controller.mybutton.*;


public class GUI {
	
	public static JFrame main_frame = new JFrame("UMLEditor");

	public static JMenuBar menu_bar = new JMenuBar();
	public static JMenu menu_file = new JMenu("File");
	public static JMenu menu_edit = new JMenu("Edit"); 
	
	//private BufferedImage img_select;
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
	
	public static JPanel main_canvas = new MyCanvas();
	public static final int canvas_xaxis = 120;
	public static final int canvas_yaxis = 60;	
	
	
	public GUI() {
		//Image img = icon_select.getImage();
		//Image newimg = img.getScaledInstance( 40, 40,  Image.SCALE_SMOOTH ) ;  
		//icon_select = new ImageIcon( newimg );
		//btn_select.setRolloverIcon(icon_select);
		//icon_select.
		
		
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
		//btn_select.setPreferredSize(new Dimension(20,60));
		btn_select.setLocation(20, 60);
		//btn_select.setBounds(20,60,button_width,button_height);	
		//btn_select.setIcon(icon_select);
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
		main_canvas.setLocation(120, 60);
		main_canvas.setSize(640, 580);
		main_canvas.setBackground(Color.WHITE);
		//main_canvas.setBounds(120, 60, 640, 580);
		//canvas.setBackground(Color.WHITE);	
	}	
	
	
	
}
