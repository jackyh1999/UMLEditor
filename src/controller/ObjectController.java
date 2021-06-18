package controller;

import java.util.ArrayList;
import java.util.List;

import model.object.CompositeObject;
import model.object.MyObject;
import scene.Canvas;
import scene.ChangeNameWindow;

public class ObjectController {
	
	private static ObjectController objectController;
	
	private List<MyObject> selectedList;
	
	private ObjectController() {
		selectedList = new ArrayList<MyObject>();
	}
	
	public static ObjectController getInstance() {
		if(objectController == null) objectController = new ObjectController();
		return objectController;
	}
	
	public List<MyObject> getSelectedList(){
		return selectedList;
	}
	
	public void group() {
		// 選取的物件少於2個
		if(selectedList.size() < 2) {
			System.out.println("Error: Selected objects less than 2");
		}
		// 選取的物件個數大於或等於2個
		else {
			CompositeObject comp = new CompositeObject();
			for(MyObject obj : selectedList) {
				obj.setGroup(comp);
				comp.getMembers().add(obj);
				Canvas.getInstance().getObjectList().remove(obj);
			}
			selectedList.clear();
			selectedList.add(comp);
			Canvas.getInstance().getObjectList().add(comp);
		}	
	}
	
	public void unGroup() {
		// 選取的物件個數不等於1
		if(selectedList.size() != 1) System.out.println("Error: Please select one composite object to ungroup");
		else {
			MyObject selected = selectedList.get(0);
			// 選取的物件是Base object
			if(selected.getMembers() == null) System.out.println("Error: You can only ungroup composite object");
			// 選取的物件是Composite object
			else {
				selectedList.remove(0);
				Canvas.getInstance().getObjectList().remove(selected);
				for(MyObject member : selected.getMembers()) {
					member.setGroup(null);
					selectedList.add(member);
					Canvas.getInstance().getObjectList().add(member);
				}
				
			}
		}
	}
	
	public void openChangeNameWindow() {
		// 選取的物件個數不等於1
		if(selectedList.size() != 1) System.out.println("Error: Please select one object");
		// 選取的物件個數等於1
		else {
			MyObject selected = selectedList.get(0);
			// 選取的物件為Composite object
			if(selected.getMembers() != null) System.out.println("Error: You can only change base object's name");
			// 選取的物件為base object
			else ChangeNameWindow.getInstance().setVisible(true);
		}
	}
	
	public void changeName(String name) {	
		selectedList.get(0).setName(name);
	}
	
}
