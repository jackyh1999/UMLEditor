package function.mode;

import function.line.CompositionLine;
import function.line.MyLine;
import scene.GUI;

public class MyMode_CompositionLine extends MyMode_Line{
	
	@Override
	public void DrawLine(MyLine line) {
		System.out.println("draw compline.");
		System.out.println(line.end_port);
		MyLine compline  = new CompositionLine(line);
		MyLine.line_list.add(compline);
	}
}
