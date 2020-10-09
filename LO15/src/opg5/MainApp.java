package opg5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("opg 5 - Skyldner");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextArea txaDescription = new TextArea();
    
    TextField nameField = new TextField();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Skylder penge");
        pane.add(lblName, 0, 0);
        
        pane.add(nameField, 1, 0);

        pane.add(txaDescription, 0, 1);
        txaDescription.setPrefRowCount(7);
        txaDescription.setPrefWidth(270);
        txaDescription.setEditable(false);

        Button btnFill = new Button("Tilføj person");
        pane.add(btnFill, 1, 1);
        btnFill.setOnAction(event -> this.fillAction());
//      GridPane.setMargin(btnFill, 2);
    }

    // -------------------------------------------------------------------------

    public void fillAction() {
        txaDescription.setText(this.getDescription());
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("P");
        
        return sb.toString();
    }
}
