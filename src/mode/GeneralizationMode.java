package mode;

import java.awt.event.MouseEvent;

import model.line.GeneralizationLine;
import model.line.Line;
import scene.Canvas;

public class GeneralizationMode extends LineMode{
	
	@Override
	public void handleCanvasPressed(MouseEvent e) {
		startObject = chooseBaseObject(e.getX(), e.getY());
		// 如果Press到基本物件，則建立一個暫時的line，並設定起點位置
		if( startObject != null) {
			startPort = startObject.choosePort(e.getX(), e.getY());
			Line temp = createTempLine(startPort, new GeneralizationLine());
			Canvas.getInstance().getLineList().add(temp);
		}
	}
}
