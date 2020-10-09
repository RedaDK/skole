package opgave6;

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

	private void drawShapes(GraphicsContext gc) {

		int y1 = 380; //Sætter start for hver streg 
		int y2 = 399; //Sætter slut for hver streg
		gc.strokeLine(20,390,360,390);//Den lange streg bro!
		gc.strokeLine(340,380,360,390);//Ene side af pilen
		gc.strokeLine(340,400,360,390);//Anden side af pilen
		for (int i = 0; i <=10; i++) { // For-loop gentager streger 11 gange
		int x = 30 + i * 30;
		gc.strokeLine(x, y1, x, y2);
			}
	
		} 
	}
	

