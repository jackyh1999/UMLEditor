package function.object;

public class MyObject_CompositeObject extends MyObject{	
	
	public MyObject_CompositeObject() {
		this.addMouseListener(this);
		MyObject.object_list.add(this);
	}
	
}
