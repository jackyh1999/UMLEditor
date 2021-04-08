package scene;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

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
	
	private JMenuBar bar = new JMenuBar();
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
	
	private final int main_frame_width = 800;
	private final int main_frame_height = 700;
	
	private final int bar_width = 800;
	private final int bar_height = 40;
	
	private final int main_canvas_x = 120;
	private final int main_canvas_y = 60;
	private final int main_canvas_width = 640;
	private final int main_canvas_height = 580;
	
	private final int change_name_window_x = 150;
	private final int change_name_window_y = 250;
	private final int change_name_window_width = 250;
	private final int change_name_window_height = 40;
	private Dimension window_textarea_size = new Dimension(100, 20);
	
	
	
	public GUI() {		
		
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
	
	private void MenuBarInit() {
		bar.setSize(bar_width, bar_height);
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

}
