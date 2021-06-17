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
		
		// 隨時更新line的終點位置
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
			
			// 若Release的座標不在物件上，則刪除這個line
			if(obj == null) {
				lineList.remove(top);
			}
			// 若Release的座標在物件上，則建立新的連接
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
