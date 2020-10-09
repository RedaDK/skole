package opg1;

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
        stage.setTitle("Opgave 1 - Fulde navn");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
	
	private final TextField txtLastName = new TextField();
	
	private final TextField txtFullName = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);
///FORNAVN
        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Fornavn:");
        pane.add(lblName, 0, 0);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:
        // TextField txfName = new TextField();
        pane.add(txfName, 1, 0, 2, 1);
///EFTERNAVN        
     // add a label to the pane (at col=0, row=0)
        Label lblLastName = new Label("Efternavn:");
        pane.add(lblLastName, 4, 0);

        // Deleted here is:
        // TextField txfLastName = new TextField();
        pane.add(txtLastName, 5, 0, 2, 1);
///FULDE NAVN
        //TextField for fullName 
        pane.add(txtFullName, 3, 1, 1, 1);
        
        
        // add a button to the pane (at col=2, row=1)
        Button btnSetFullName = new Button("Fulde navn");
        pane.add(btnSetFullName, 3, 4);
        GridPane.setMargin(btnSetFullName, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnSetFullName.setOnAction(event -> this.btnSetFullName());
    }

    // -------------------------------------------------------------------------


    private void btnSetFullName() {
        String name = txfName.getText().trim();
        String lastName = txtLastName.getText().trim();
        
        txtFullName.setText(name + " " + lastName);
    }
}
