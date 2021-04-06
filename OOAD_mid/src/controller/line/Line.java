package controller.line;

import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComponent;

import controller.object.MyObject;
import controller.object.Object_port;
import scene.GUI;
import scene.MyCanvas;

public class Line {
	public static Line line = new Line();
	
	public static ArrayList<Line> line_list = new ArrayList<Line>();
	public int begin_x;
	public int begin_y;
	public Point begin;
	public Object_port begin_port;
	
	public int end_x;
	public int end_y;
	public Point end;
	public Object_port end_port;
	
	public void BeginRecord(MyObject mo) {
		begin_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x;
		begin_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y;
		System.out.println(begin_x + " " + begin_y);
		System.out.println(mo.x + " " + mo.y);
		begin = new Point(begin_x, begin_y);
		for(int i=0;i<4;i++) {
			if(mo.range[i].contains(begin)) {
				System.out.println("this is begin object");
				begin_port = mo.port[i];
				break;
			}
		}
	}

	public void EndRecord(MyObject mo, MouseEvent e) {
		end_x = MouseInfo.getPointerInfo().getLocation().x - MyCanvas.canvas_x;
		end_y = MouseInfo.getPointerInfo().getLocation().y - MyCanvas.canvas_y;
		end = new Point(end_x, end_y);
		
		System.out.println(end_x + " " + end_y);
		
		MyObject obj = (MyObject) GUI.main_canvas.getComponentAt(end);
		System.out.println(mo.x + " " + mo.y);
		
		for(int i=0;i<4;i++) {
			
			if(obj.range[i].contains(end)) {
				System.out.println("this is end object");
				end_port = obj.port[i];
				break;
			}
		}
		this.line_list.add(this);
		GUI.main_canvas.repaint();
		//DrawLine();
		
	}
	
	public void DrawLine() {
		System.out.println("Draw Line");
		
	}
}