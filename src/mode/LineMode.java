package mode;

import java.awt.event.MouseEvent;
import java.util.List;

import model.Port;
import model.line.Line;
import model.line.LineType;
import model.object.BaseObject;
import scene.Canvas;

public class LineMode extends Mode{
	
	protected BaseObject startObject;
	protected Port startPort;
	
	@Override
	public void handleCanvasPressed(MouseEvent e) {
		
	}
	
	@Override 
	public void handleCanvasDragged(MouseEvent e) {
		
		// �H�ɧ�sline�����I��m
		if(startObject != null) {
			List<Line> lineList = Canvas.getInstance().getLineList();
			int top = lineList.size()-1;
			lineList.get(top).setEndPoint(e.getX(), e.getY());
		}
	}
	
	@Override
	public void handleCanvasReleased(MouseEvent e) {
		
		if(startObject != null) {
			
			BaseObject obj = chooseBaseObject(e.getX(), e.getY());
			List<Line> lineList = Canvas.getInstance().getLineList();
			int top = lineList.size()-1;
			
			// �YRelease���y�Ф��b����W�A�h�R���o��line
			if(obj == null) {
				lineList.remove(top);
			}
			// �YRelease���y�Цb����W�A�h�إ߷s���s��
			else {
				Line line = lineList.get(top);
				Port endPort = obj.choosePort(e.getX(), e.getY());
				
				line.setEndPoint(endPort.getConnectionX(), endPort.getConnectionY());
				line.setStartPort(startPort);
				line.setEndPort(endPort);
				
				startPort.getLineList().add(line);
				endPort.getLineList().add(line);
			}
			startObject = null;
		}	
	}
	
	protected Line createTempLine(Port startPort, LineType lineType) {
		
		int startX = startPort.getConnectionX();
		int startY = startPort.getConnectionY();
		int endX = startX;
		int endY = startY;
		Line temp = new Line(startX, startY, endX, endY, lineType);
		
		return temp;
	}
	
}
