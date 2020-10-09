package opgave12;

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

	private void drawTriangle(GraphicsContext gc, int x, int y)
	{

		int z = 150;
		gc.strokeLine(x *2, y*4 , x + z,  y);
		gc.strokeLine(x + z,  y, x *2, y*4 );
	}

	
	private void drawShapes(GraphicsContext gc) {
	  
		this.drawTriangle(gc, 20, 50);
		this.drawTriangle(gc, 160,20);
	}
}	

