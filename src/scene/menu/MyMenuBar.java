package scene.menu;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MyMenuBar extends JMenuBar{
	
	private final int width = 800;
	private final int height = 40;
	
	private List<JMenu> menuList;
	//private MyMenu file;
	//private MyMenu edit;
	
	public MyMenuBar() {
		
		menuList = new ArrayList<JMenu>();
		
		JMenu file = new FileMenu();
		JMenu edit = new EditMenu();
		
		menuList.add(file);
		menuList.add(edit);
	}
}
