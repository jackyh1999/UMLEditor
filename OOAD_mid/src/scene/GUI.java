package scene;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import function.button.ChangeNameWindow_Cancel;
import function.button.ChangeNameWindow_OK;
import function.button.MyButton;
import function.button.MyButton_AssociationLine;
import function.button.MyButton_Class;
import function.button.MyButton_CompositionLine;
import function.button.MyButton_GeneralizationLine;
import function.button.MyButton_Select;
import function.button.MyButton_UseCase;
import function.line.MyLine;
import function.menu.MyMenuItem_ChangeName;
import function.menu.MyMenuItem_Group;
import function.menu.MyMenuItem_Ungroup;

 


public class GUI {
	
	public static JFrame main_frame = new JFrame("UMLEditor");
	public static MyCanvas main_canvas = new MyCanvas();
	public static JPanel change_name_window = new JPanel(new FlowLayout());
	public static JTextArea window_textarea = new JTextArea();
	
	private final int main_frame_width = 800;
	private final int main_frame_height = 700;
	
	private JMenuBar bar = new JMenuBar();
	private final int bar_width = 800;
	private final int bar_height = 40;
	
	private JMenu menu_file = new JMenu("File");
	private JMenu menu_edit = new JMenu("Edit"); 
	
	private JMenuItem item_group = new MyMenuItem_Group();
	private JMenuItem item_ungroup = new MyMenuItem_Ungroup();
	private JMenuItem item_changename = new MyMenuItem_ChangeName();
	
	private ImageIcon icon_select = new ImageIcon("src/material/select.PNG");
	private ImageIcon icon_assline = new ImageIcon("src/material/assline.PNG");
	private ImageIcon icon_genline = new ImageIcon("src/material/genline.PNG");
	private ImageIcon icon_compline = new ImageIcon("src/material/compline.PNG");
	private ImageIcon icon_class = new ImageIcon("src/material/class.PNG");
	private ImageIcon icon_usecase = new ImageIcon("src/material/usecase.PNG");	
	
	
	private MyButton btn_select = new MyButton_Select(icon_select);
	private MyButton btn_assline = new MyButton_AssociationLine(icon_assline);
	private MyButton btn_genline = new MyButton_GeneralizationLine(icon_genline); 
	private MyButton btn_compline = new MyButton_CompositionLine(icon_compline);
	private MyButton btn_class = new MyButton_Class(icon_class);
	private MyButton btn_usecase = new MyButton_UseCase(icon_usecase);
	
	private final int button_width = 80;
	private final int button_height = 80;	
	
	private JButton cnw_btn_ok = new ChangeNameWindow_OK();
	private JButton cnw_btn_cancel = new ChangeNameWindow_Cancel();
	
	
	public static ArrayList<MyLine> line_list = new ArrayList<MyLine>();
	
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
		main_frame.setSize(main_frame_width, main_frame_height);
		main_frame.setResizable(false);
		main_frame.setLayout(null);
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
        main_frame.setVisible(true);
	}
	
	private void MenuBarInit() {
		//bar.setLocation(0, 0);
		//bar.setBounds(0, 0, bar_width, bar_height);	
		//bar.setAlignmentY(bar_height);
		bar.setSize(bar_width, bar_height);
		//bar.setSize(bar_height, bar_width);
		bar.add(menu_file);
		bar.add(menu_edit);
		
		main_frame.add(bar);
	}
	
	private void MenuInit() {
		item_group.setText("Group");
		item_ungroup.setText("UnGroup");
		item_changename.setText("Change object name");
		
		menu_edit.add(item_group);
		menu_edit.add(item_ungroup);
		menu_edit.add(item_changename);
	}
	
	private void ButtonSelectInit() {
		btn_select.setBounds(20,60,button_width,button_height);
		//btn_select.setLocation(button_x, button_y);
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
		main_canvas.setOpaque(true);
	}	
	
	private void ChangeNameWindowInit() {
		
		change_name_window.setLocation(150, 250);
		change_name_window.setSize(250, 40);
		change_name_window.setBackground(Color.LIGHT_GRAY);
		window_textarea.setPreferredSize(new Dimension(100, 20));
		cnw_btn_ok.setText("OK");
		cnw_btn_cancel.setText("Cancel");
		change_name_window.add(window_textarea);
		
		change_name_window.add(cnw_btn_ok);
		change_name_window.add(cnw_btn_cancel);
		change_name_window.setVisible(false);
		change_name_window.setEnabled(false);
		main_canvas.add(change_name_window);
	}
		
	public JFrame GetFrame() {
		return this.main_frame;
	}
}
