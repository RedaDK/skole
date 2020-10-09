package opg2;


import javafx.application.Application;
import javafx.geometry.Insets;
//import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Opgave 2 - Plus/Minus");
        GridPane pane = new GridPane();
        this.initContent(pane);
        pane.setPrefSize(300, 180);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    TextField count = new TextField(Integer.toString(0));
    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);



        //Tekst felt for count
        
        pane.add(count, 2, 1);
        
        //Minus knap
        Button plusButton = new Button("Plus");
        pane.add(plusButton, 3, 0);
        plusButton.setOnAction(event -> this.plusButton());
        plusButton.setPrefWidth(100);
        //Minus knap
        Button minusButton = new Button("Minus");
        pane.add(minusButton, 3, 2);
        minusButton.setPrefWidth(100);
        // connect a method to the button
        minusButton.setOnAction(event -> this.minusButton());
    }

    // -------------------------------------------------------------------------


    private void plusButton() {
    	int plus = Integer.parseInt((count.getText().trim()));
		plus++;
		count.setText(String.valueOf(plus));
    }
    
    private void minusButton() {
    	int minus = Integer.parseInt((count.getText().trim()));
		minus--;
		count.setText(String.valueOf(minus));
    }
}
