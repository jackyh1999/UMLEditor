package function.mode;

import function.line.GeneralizationLine;
import function.line.MyLine;
import scene.GUI;

public class MyMode_GeneralizationLine extends MyMode_Line{
	
	@Override
	public void DrawLine(MyLine line) {
		System.out.println("draw genline.");
		MyLine genline  = new GeneralizationLine(line);
		MyLine.line_list.add(genline);
	}
}
