package function.mode;

import function.line.AssociationLine;
import function.line.MyLine;
import scene.GUI;

public class MyMode_AssociationLine extends MyMode_Line{
	
	@Override
	public void DrawLine(MyLine line) {
		System.out.println("draw assline.");
		MyLine assline  = new AssociationLine(line);
		MyLine.line_list.add(assline);
	}
}
