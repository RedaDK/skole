package opgave10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class MainApp extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("The Jail");
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

	private void drawRing(GraphicsContext gc, int x, int y)
	{
	int r1 = 45;
	
	gc.strokeOval(x - r1, y - r1, 2 * r1, 2 * r1);

	}
	
	private void drawCrossOne(GraphicsContext gc, int x, int y) {
		
		int z = 150;
		gc.strokeLine(x + z, y*4 , x + z , y*2);
		
	}
	private void drawCrossTwo(GraphicsContext gc, int x, int y) {
		
		int g = 140;
		gc.strokeLine(x * 4, y + g , x * 2 , y + g);
		
	}
	
	private void drawShapes(GraphicsContext gc) {
		//The long way to heaven 
		//int x = 100;
		/*
		this.drawRing(gc, x + 30, 150);
		this.drawRing(gc, x + 60,150);
		this.drawRing(gc, x + 90,150);
		*/
		
		
		//The short way to heaven
		
		for(int i = 0; i < 5; i++) {
		this.drawRing(gc, 100 + i * 30, 150);
	
		this.drawCrossOne(gc, 10, 50);
		this.drawCrossTwo(gc, 50, 10);
		
	}
}	
}
