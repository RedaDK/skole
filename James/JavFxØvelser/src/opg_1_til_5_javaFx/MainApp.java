package opg_1_til_5_javaFx;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
//import javafx.scene.shape.Polygon;


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
        pane.setPrefSize(1100, 800);
        this.drawShapes(pane);
        return pane;
    }


private void drawShapes(Pane pane) {
	
	//---------------------------------------Firkant med tekst i midten---------------------------------------------------
	
	//Dette er den blå kasse
	Rectangle rectangle = new Rectangle(70,70,300,100);
	pane.getChildren().add(rectangle);
	rectangle.setFill(Color.BLUE);
	
	//Dette er teksten i den blå kasse
	Text text = new Text(100, 130, "Dette er en firkant, hehe!");
	pane.getChildren().add(text);
	text.setFont(new Font(20));
	text.setFill(Color.RED);
	
	//---------------------------------------Hovedet---------------------------------------------------
	
	//Dette er hovedet
	Circle head = new Circle(100,300,100);
	pane.getChildren().add(head);
	head.setFill(null);
	head.setStroke(Color.BLACK);
	
	//Dette er venstre øje 
	Circle leftEye = new Circle(60,270,10);
	pane.getChildren().add(leftEye);
	leftEye.setFill(null);
	leftEye.setStroke(Color.BLACK);
	
	//Dette er højre øje 
	Circle rightEye = new Circle(140,270,10);
	pane.getChildren().add(rightEye);
	rightEye.setFill(null);
	rightEye.setStroke(Color.BLACK);
	
	//Dette er munden 
	Arc mouth =  new Arc(100,300,55,50,198,150);
	pane.getChildren().add(mouth);
	mouth.setType(ArcType.CHORD);
	mouth.setFill(null);
	mouth.setStroke(Color.GREEN);
	
	
	//---------------------------------------Tekst bobbel---------------------------------------------------
	
	//Her er kommentar boble
	Rectangle comment = new Rectangle(220,270,200,100);
	pane.getChildren().add(comment);
	comment.setFill(Color.BEIGE);
	//Her kan man ændre hjørner på firkanten
	comment.setArcWidth(130.0); 
	comment.setArcHeight(130.0);
	
	//Her er tekst til kommentar boksen
	Text textComment = new Text(260, 320, "Yo-Yo, homie!!");
	pane.getChildren().add(textComment);
	textComment.setFont(new Font(20));
	textComment.setFill(Color.RED);
	
	//---------------------------------------Flere cirkler inde i hinanden---------------------------------------------------
	
	//CENTER FOR DEM ALLE ER 400 X 470 der ændres kun på Radius 
	
	Circle cOne = new Circle(600,170,10);
	pane.getChildren().add(cOne);
	cOne.setFill(Color.BLACK);
	cOne.setStroke(Color.BLACK);
	cOne.setStrokeWidth(10);
	
	Circle cTwo = new Circle(600,170,30);
	pane.getChildren().add(cTwo);
	cTwo.setFill(null);
	cTwo.setStroke(Color.BLACK);
	cTwo.setStrokeWidth(10);
		
	Circle cThree = new Circle(600,170,50);
	pane.getChildren().add(cThree);
	cThree.setFill(null);
	cThree.setStroke(Color.BLACK);
	cThree.setStrokeWidth(10);
		
	Circle cFour = new Circle(600,170,70);
	pane.getChildren().add(cFour);
	cFour.setFill(null);
	cFour.setStroke(Color.BLACK);
	cFour.setStrokeWidth(10);
	
	Circle cFive = new Circle(600,170,90);
	pane.getChildren().add(cFive);
	cFive.setFill(null);
	cFive.setStroke(Color.BLACK);
	cFive.setStrokeWidth(10);
	
	Circle cSix = new Circle(600,170,110);
	pane.getChildren().add(cSix);
	cSix.setFill(null);
	cSix.setStroke(Color.BLACK);
	cSix.setStrokeWidth(10);
	
	//---------------------------------------Det olympiske flag---------------------------------------------------
	
	// BLÅ CIRKEL
	Circle fBlue = new Circle(100,570,80);
	pane.getChildren().add(fBlue);
	fBlue.setFill(null);
	fBlue.setStroke(Color.BLUE);
	fBlue.setStrokeWidth(4);
	// SORT CIRKEL
	Circle fBlack = new Circle(260,570,80);
	pane.getChildren().add(fBlack);
	fBlack.setFill(null);
	fBlack.setStroke(Color.BLACK);
	fBlack.setStrokeWidth(4);
	// RØD CIRKEL
	Circle fRed = new Circle(420,570,80);
	pane.getChildren().add(fRed);
	fRed.setFill(null);
	fRed.setStroke(Color.RED);
	fRed.setStrokeWidth(4);
	// GUL CIRKEL
	Circle fYellow = new Circle(180,650,80);
	pane.getChildren().add(fYellow);
	fYellow.setFill(null);
	fYellow.setStroke(Color.YELLOW);
	fYellow.setStrokeWidth(4);
	// GRØN CIRKEL
	Circle fGreen = new Circle(340,650,80);
	pane.getChildren().add(fGreen);
	fGreen.setFill(null);
	fGreen.setStroke(Color.GREEN);
	fGreen.setStrokeWidth(4);
	
	
	//---------------------------------------Huset med solen---------------------------------------------------
	
	//Kasse på huset
	Rectangle rect1 = new Rectangle(550,570,200,200);
	pane.getChildren().add(rect1);
	rect1.setFill(Color.RED);

	//Kasse på vinduet
	Rectangle rect2 = new Rectangle(570,640,50,50);
	pane.getChildren().add(rect2);
	rect2.setFill(Color.BLACK);
	

}


}