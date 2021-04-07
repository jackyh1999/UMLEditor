package function.mode;

import function.line.AssociationLine;
import function.line.MyLine;
import scene.GUI;

public class MyMode_AssociationLine extends MyMode_Line{
	
	@Override
	public void DrawLine(MyLine line) {
		System.out.println("draw assline.");
		MyLine assline  = new AssociationLine(line);
		/*
		assline.begin_port = line.begin_port;
		assline.end_port = line.end_port;
		assline.vec = line.vec;
		*/
		GUI.line_list.add(assline);
	}
}
