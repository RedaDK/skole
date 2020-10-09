package opgave4_3;

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

	private void drawShapes(GraphicsContext gc) {
		// Replace the statement here with your code.
	
	gc.setStroke(Color.BLACK);
	int r = 20;
	int x = 0;
	
	while(r <= 300 && x <=400) {
		gc.strokeOval(160 + x, 160 , 20 + r , 120 );
		 r = r + 40;
		 x = x - 20;
		} 
	}
}
/*
while(r <= 300 && y <= 300 && x <=300) {
	gc.strokeOval(150 + x , 150 - y, 10 + r , 80 );
	 r = r + 40;
	 y = y - 0; 
	 x = x - 20;
*/