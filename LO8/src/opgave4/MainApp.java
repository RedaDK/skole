package opgave4;





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
	
	//Start punkt ( 

	
	gc.setStroke(Color.BLACK);
	int r = 40;
	int x = 10;
	int y = 20;
			
	while(r <= 200 && x <= 200 && y <= 200) {
		gc.strokeOval(200 - x, 200 - y , 1 + r , 1 + r );
		 r = r + 40;
		 x  = x + 20;
		 y = y + 20;
		} 
	}
}
