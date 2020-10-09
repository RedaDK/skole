package hus;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class MainApp extends Application {

	
	
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);
        
        stage.setTitle("Shape Øvelser");
        stage.setScene(scene);
        stage.show();
    }
    
   

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(700, 700);
        this.drawShapes(pane);
        return pane;
    }


private void drawShapes(Pane pane) {
	
	//Kasse på huset
		Rectangle rect1 = new Rectangle(250,270,200,200);
		pane.getChildren().add(rect1);
		rect1.setFill(Color.RED);

		
		//Kasse på vinduet
		Rectangle rect2 = new Rectangle(370,340,50,50);
		pane.getChildren().add(rect2);
		rect2.setFill(Color.BLACK);
		
		//Kasse på døren
		Rectangle rect3 = new Rectangle(270,370,50,100);
		pane.getChildren().add(rect3);		
		rect3.setFill(Color.DARKBLUE);				
	
		
		//Taget
		Polygon polygon = new Polygon(450,270,350,100,250,270);
        pane.getChildren().add(polygon);
        polygon.setStroke(Color.GREEN);
        polygon.setFill(Color.DARKBLUE);
        
        //Træet
        Rectangle tree = new Rectangle(570,370,20,100);
        pane.getChildren().add(tree);
        tree.setFill(Color.BROWN);
        
        //Blade
        
        Circle cOne = new Circle (570,370,20);
        pane.getChildren().add(cOne);
        cOne.setFill(Color.GREEN);
       
        Circle cTwo = new Circle (580,365,20);
        pane.getChildren().add(cTwo);
        cTwo.setFill(Color.GREEN);
        
        Circle cThree = new Circle (590,375,20);
        pane.getChildren().add(cThree);
        cThree.setFill(Color.GREEN);
        
        
        //Manden
        
        Circle hoved = new Circle (170,400,10);
        pane.getChildren().add(hoved);
        hoved.setFill(null);
        hoved.setStroke(Color.BLACK);
       
        Circle mave = new Circle (170,430,20);
        pane.getChildren().add(mave);
        mave.setFill(null);
        mave.setStroke(Color.BLACK);
        
        //Venstre ben
        Line benOne = new Line (155,440,145,470);
        pane.getChildren().add(benOne);
        benOne.setStroke(Color.AQUA);
        benOne.setStrokeWidth(3);
        
        //Højre ben
        Line benTwo = new Line (155,440,145,470);
        pane.getChildren().add(benTwo);
        benTwo.setStroke(Color.AQUA);
        
        
        //Solen
        
       Circle solCircle = new Circle (600,100,50);
       pane.getChildren().add(solCircle);
       solCircle.setFill(Color.YELLOW);
       
       
     //Jord
       
       Line grund = new Line(0,470,700,470);
       pane.getChildren().add(grund);
       grund.setFill(Color.BLACK);
       
	
	}
}