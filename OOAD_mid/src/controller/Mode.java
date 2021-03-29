package controller;

public class Mode {
	public static Mode mode;
	public static Mode mode_select = new Mode_select();
	public static Mode mode_class = new Mode_class();
	//public static Mode_enum mode;
	public void dosomething() {
		System.out.println("Default Mode.");
	}
}
