package scene.menu;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MyMenuBar extends JMenuBar{
		
	private final int x = 0;
	private final int y = 0;
	private final int width = 800;
	private final int height = 40;
	
	private List<JMenu> menuList;
	
	public MyMenuBar() {
		
		this.setSize(width, height);
		this.setLocation(x, y);
		
		menuList = new ArrayList<JMenu>();	
		menuList.add(new FileMenu());
		menuList.add(new EditMenu());
		
		for(JMenu menu : menuList) this.add(menu);
	}
}
