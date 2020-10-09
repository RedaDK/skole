package opgave1.loopstemplate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MainApp extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Loops");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane initContent() {
		GridPane pane = new GridPane();
		Canvas canvas = new Canvas(400, 400);
		pane.add(canvas, 0, 0);
		this.drawShapes(canvas.getGraphicsContext2D());
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawShapes(GraphicsContext gc) {
		// Replace the statement here with your code.
	
		
			// draw an arrowhead at (100,75)
		// 1A
			
		    int x = 100;
			int y = 75;
			int  len = 200;  //Ex C
			int high = 40; // EX D
			gc.setStroke(Color.GREEN);
			gc.strokeLine(x, y, x + len, y - high);
			gc.strokeLine(x, y, x + len, y + high);
			// draw an arrowhead at (25,140)
		// 1A	
			x = 100;
			y = 125;
			
			gc.strokeLine(x, y, x + len, y - high);
			gc.strokeLine(x, y, x + len, y + high);
	  //1B
			x = 20;
			y = 50;
			
			gc.strokeLine(x, y, x + len, y - high);
			gc.strokeLine(x, y, x + len, y + high);
	 //C
			x = 150;
			y = 170;
			
			gc.strokeLine(x, y, x + len, y - high);
			gc.strokeLine(x, y, x + len, y + high);
	
	
//	int x = 6;
//	gc.setStroke(Color.BLUEVIOLET);
//	while (x <= 140) {
//		gc.strokeLine(20, x, 280, x);	
//		x = x + 10;
//	}
		
	}

}
