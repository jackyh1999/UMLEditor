package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

class Btn_select extends Button{
	
}

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane pane = new Pane();
			Scene scene = new Scene(pane);
			
			Rectangle menu = new Rectangle(0, 0, 1000, 40);
			menu.setFill(Color.GRAY);
						
			Text t_file = new Text("File");
			t_file.setLayoutX(10);
			t_file.setLayoutY(30);
			t_file.setStyle("-fx-font: normal bold 30px 'serif' "); 
			
			Text t_edit = new Text("Edit");
			t_edit.setLayoutX(80);
			t_edit.setLayoutY(30);
			t_edit.setStyle("-fx-font: normal bold 30px 'serif' ");
			
			pane.getChildren().addAll(menu,t_file,t_edit);
			
			Button btn_select = new Button("a"); 
			btn_select.setLayoutX(40);
			btn_select.setLayoutY(80);
			btn_select.setPrefSize(80, 80);
			EventHandler<MouseEvent> btn_select_event = new EventHandler<MouseEvent>() { 
		        @Override 
		        public void handle(MouseEvent e) { 
		        	btn_select.setStyle("-fx-background-color: black; -fx-text-fill: white;");
		        	
		        } 
		    };
			
			Button btn_assline = new Button("b");
			btn_assline.setLayoutX(40);
			btn_assline.setLayoutY(200);
			btn_assline.setPrefSize(80, 80);
			
			Button btn_genline = new Button("c");
			btn_genline.setLayoutX(40);
			btn_genline.setLayoutY(320);
			btn_genline.setPrefSize(80, 80);
			
			Button btn_comline = new Button("d");
			btn_comline.setLayoutX(40);
			btn_comline.setLayoutY(440);
			btn_comline.setPrefSize(80, 80);
			
			Button btn_class = new Button("e");
			btn_class.setLayoutX(40);
			btn_class.setLayoutY(560);
			btn_class.setPrefSize(80, 80);
			EventHandler<MouseEvent> eventHandler_1 = new EventHandler<MouseEvent>() { 
		        @Override 
		        public void handle(MouseEvent e) { 
		        	btn_class.setStyle("-fx-background-color: black; -fx-text-fill: white;");
		        	System.out.println("Mode Class.");
		        } 
		    };
		    btn_class.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler_1);
			
			Button btn_usecase = new Button("f");
			btn_usecase.setLayoutX(40);
			btn_usecase.setLayoutY(680);
			btn_usecase.setPrefSize(80, 80);
			
			pane.getChildren().addAll(btn_select,btn_assline,btn_genline,btn_comline,btn_class,btn_usecase);
			
			Image img = new Image(getClass().getResource("material/a.jpg").toExternalForm());
			ImageView iv = new ImageView(img);
			
			
					
			Rectangle canvas = new Rectangle(160,80,780,680);
			canvas.setFill(Color.WHITE);		
			EventHandler<MouseEvent> eventHandler_2 = new EventHandler<MouseEvent>() { 
		        @Override 
		        public void handle(MouseEvent e) { 
		        	double x = e.getX();
		        	double y = e.getY();
		        	System.out.println(x + " " + y);
		        	/*
		        	Text t = new Text("Class!");
		        	t.setX(x);
		        	t.setY(y);
		        	pane.getChildren().add(t);
		        	*/
		        	
		        	iv.setX(x);
		        	iv.setY(y);
		        	pane.getChildren().add(iv);
		        } 
		    };
			canvas.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler_2);
			
			
			pane.getChildren().add(canvas);
			
			primaryStage.setWidth(1000);
			primaryStage.setHeight(840);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
