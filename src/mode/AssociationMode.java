package mode;

import java.awt.event.MouseEvent;

import model.line.AssociationLine;
import model.line.Line;
import scene.Canvas;

public class AssociationMode extends LineMode{
	
	@Override
	public void handleCanvasPressed(MouseEvent e) {
		startObject = chooseBaseObject(e.getX(), e.getY());
		// 如果Press到基本物件，則建立一個暫時的line，並設定起點位置
		if( startObject != null) {
			startPort = startObject.choosePort(e.getX(), e.getY());
			Line temp = createTempLine(startPort, new AssociationLine());
			Canvas.getInstance().getLineList().add(temp);
		}
	}
}
