package mode;

import java.awt.event.MouseEvent;

import model.line.CompositionLine;
import model.line.Line;
import scene.Canvas;

public class CompositionMode extends LineMode{
	
	@Override
	public void handleCanvasPressed(MouseEvent e) {
		startObject = chooseBaseObject(e.getX(), e.getY());
		// �p�GPress��򥻪���A�h�إߤ@�ӼȮɪ�line�A�ó]�w�_�I��m
		if( startObject != null) {
			startPort = startObject.choosePort(e.getX(), e.getY());
			Line temp = createTempLine(startPort, new CompositionLine());
			Canvas.getInstance().getLineList().add(temp);
		}
	}
}
