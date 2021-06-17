package model.object;

import java.awt.Rectangle;
import java.util.ArrayList;

public class CompositeObject extends MyObject{	
	
	public CompositeObject() {
		super();
		members = new ArrayList<MyObject>();
	}
	
	@Override
	public void setSelect(boolean b) {
		for(MyObject member : members) {
			member.setSelect(b);
		}
		isSelect = b;
	}
	
	public boolean isInside(Rectangle r) {
		for(MyObject member : members) {
			if(!member.isInside(r)) return false;
		}
		return true;
	}
	
	public boolean isContain(int x, int y) {
		for(MyObject member : members) {
			if(member.isContain(x,y)) return true;
		}
		return false;
	}
	
	@Override
	public void move(int translateX, int translateY) {
		for(MyObject member : members) {
			member.move(translateX, translateY);
		}
	}
	
}
