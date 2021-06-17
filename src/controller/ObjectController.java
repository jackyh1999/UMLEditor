package controller;

import java.util.ArrayList;
import java.util.List;

import model.object.CompositeObject;
import model.object.MyObject;
import scene.Canvas;

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
		if(selectedList.size() < 2) {
			System.out.println("Error: Selected objects less than 2");
		}
		else {
			//List<MyObject> members = new ArrayList<MyObject>();
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
		if(selectedList.size() != 1) {
			System.out.println("Error: Please select one composite object to ungroup");
		}
		else {
			MyObject selected = selectedList.get(0);
			if(selected.getMembers() == null) {
				System.out.println("Error: You can only ungroup composite object");
			}
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
	
	public void changeName(String name) {
		if(selectedList.size() != 1) {
			System.out.println("Error: Please select one object");
		}
		else {
			MyObject selected = selectedList.get(0);
			if(selected.getMembers() != null) {
				System.out.println("Error: You can only change base object's name");
			}
			else {
				selected.setName(name);
			}
		}
	}
	
}
