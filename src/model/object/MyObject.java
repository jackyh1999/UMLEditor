package model.object;

import java.awt.Rectangle;
import java.util.List;

public abstract class MyObject{
	
	protected boolean isSelect;
	
	protected CompositeObject group;
	protected List<MyObject> members;	

	public MyObject() {
		isSelect = false;
		group = null;
		members = null;
	}
	
	public void setName(String name) {
		
	}
	
	public List<MyObject> getMembers(){
		return members;
	}
	
	public void setGroup(CompositeObject comp) {
		group = comp;
	}
	
	public Object getGroup() {
		return group;
	}
	
	// check if a point is inside this object
	public abstract boolean isContain(int x, int y);
	
	// check if this object is inside the select range
	public abstract boolean isInside(Rectangle r);
	
	public abstract void move(int x, int y);
	
	public abstract void setSelect(boolean b);

}
