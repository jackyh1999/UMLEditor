package mode;

import java.awt.event.MouseEvent;

import model.line.GeneralizationLine;
import model.line.Line;
import scene.Canvas;

public class GeneralizationMode extends LineMode{
	
	@Override
	public void handleCanvasPressed(MouseEvent e) {
		startObject = chooseBaseObject(e.getX(), e.getY());
		// �p�GPress��򥻪���A�h�إߤ@�ӼȮɪ�line�A�ó]�w�_�I��m
		if( startObject != null) {
			startPort = startObject.choosePort(e.getX(), e.getY());
			Line temp = createTempLine(startPort, new GeneralizationLine());
			Canvas.getInstance().getLineList().add(temp);
		}
	}
}
