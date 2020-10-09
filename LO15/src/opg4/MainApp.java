package opg4;

import javafx.application.Application;
import javafx.geometry.Insets;
//import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Opgave 4 - Farenheit/Celcius");
        GridPane pane = new GridPane();
        this.initContent(pane);
        pane.setPrefSize(400, 180);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    TextField farenheit = new TextField();
    TextField celcius = new TextField();
    TextField result = new TextField();
    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);



        //Tekst felt og label for farenheit
        Label lblfahrenheit = new Label("Farenheit");
        pane.add(lblfahrenheit, 2, 0);
        pane.add(farenheit, 2, 1);
        
        //Tekst felt og label for celcius
        Label lblcelcius = new Label("Celcius");
        pane.add(lblcelcius, 2, 2);
        pane.add(celcius, 2, 3);
            
        
        //Udregn/Calculate knap
        Button calculateFar = new Button("Convert to Farenheit");
        pane.add(calculateFar, 3, 3);
        calculateFar.setOnAction(event -> this.calculateFarenheit());
        calculateFar.setPrefWidth(200);
        GridPane.setColumnSpan(calculateFar, 2);
        
        //Udregn/Calculate knap
        Button calculateCel = new Button("Convert to Celcius");
        pane.add(calculateCel, 3, 1);
        calculateCel.setOnAction(event -> this.calculateCelcius());
        calculateCel.setPrefWidth(200);
        GridPane.setColumnSpan(calculateCel, 2);
    }

    // -------------------------------------------------------------------------

    //Metoder der regner investement ud
    private void calculateFarenheit() {
    	
    	double cel = Double.parseDouble(celcius.getText().trim());
  
    	double res =  9/5*cel + 32;
 
    	farenheit.setText(String.valueOf(res));
    }
   
    private void calculateCelcius() {
    	
    	double far = Double.parseDouble(farenheit.getText().trim());
  
    	double res =  (far - 32) / 1.8;
 
    	celcius.setText(String.valueOf(res));
    }
}

//double far = Double.parseDouble((farenheit.getText().trim()));