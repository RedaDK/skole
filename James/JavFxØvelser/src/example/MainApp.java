package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class MainApp extends Application {


    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
    	
    	double xmove = 100;
    	double ymove = 200;
    	
        Circle circle = new Circle(70, 70, 30);
        pane.getChildren().add(circle);
        //Sætter center på cirklen og henter (get) center på cirklen - plusser det med move som er xmove
        circle.setCenterX(circle.getCenterX()+ xmove);
        circle.setCenterY(circle.getCenterY() + ymove);
        circle.setFill(Color.CORNFLOWERBLUE);
        circle.setStroke(Color.BLACK);
        
        Rectangle rectangle = new Rectangle(70, 70, 30, 70);
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.CORNFLOWERBLUE);
        rectangle.setStroke(Color.BLACK);
        
        Line line = new Line(70, 70, 30, 70);
        pane.getChildren().add(line);
        line.setFill(Color.CORNFLOWERBLUE);
        line.setStroke(Color.BLACK);
    }

}
