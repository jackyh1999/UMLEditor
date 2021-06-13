package scene.menu;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EditMenu extends JMenu{

	private final String text = "Edit";
	private List<JMenuItem> menuItemList;
	
	public EditMenu() {
		
		this.setText(text);
		
		menuItemList = new ArrayList<JMenuItem>();
		menuItemList.add(new MenuItemGroup());
		menuItemList.add(new MenuItemUnGroup());
		menuItemList.add(new MenuItemChangeName());
		
		for(JMenuItem item : menuItemList) this.add(item);
	}
}
