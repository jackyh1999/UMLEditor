package controller.object;

public class Object_member extends MyObject{

	public Object_composite group;
	
	public void Select() {	
		for(int i=0;i<4;i++) {
			this.port[i].setEnabled(true);
			//mo.port[i].setVisible(true);
			Object_port.port_list.add(this.port[i]);
		}				
	}
}
