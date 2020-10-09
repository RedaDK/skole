package opg3;






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
        stage.setTitle("Opgave 3 - Investment");
        GridPane pane = new GridPane();
        this.initContent(pane);
        pane.setPrefSize(400, 180);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    TextField investment = new TextField(Integer.toString(0));
    TextField years = new TextField(Integer.toString(0));
    TextField interest = new TextField(Integer.toString(0));
    TextField value = new TextField(Integer.toString(0));
    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);



        //Tekst felt og label for investment
        Label lblinvest = new Label("Investment");
        pane.add(lblinvest, 2, 0);
        pane.add(investment, 2, 1);
        //Tekst felt og label for years
        Label lblyears = new Label("Years");
        pane.add(lblyears, 3, 0);
        pane.add(years, 3, 1);
        //Tekst felt og label for interest
        Label lblinterest = new Label("Interest (%)");
        pane.add(lblinterest, 4, 0);
        pane.add(interest, 4, 1);
        //Tekst felt og label for future value
        Label lblvalue = new Label("Future value");
        pane.add(lblvalue, 5, 0);
        pane.add(value, 5, 1);
        
        //Udregn/Calculate knap
        Button calculateBtn = new Button("Calculate");
        pane.add(calculateBtn, 3, 3);
        calculateBtn.setOnAction(event -> this.calculateBtn());
        calculateBtn.setPrefWidth(200);
        GridPane.setColumnSpan(calculateBtn, 2);
    }

    // -------------------------------------------------------------------------

    //Metoder der regner investement ud
    private void calculateBtn() {
    	double invest = Double.parseDouble((investment.getText().trim()));
    	int year = Integer.parseInt((years.getText().trim()));
    	double inter = Double.parseDouble((interest.getText().trim()));
    
    	double val = invest * Math.pow((1+inter/100),year);
    	//S�tter teksten i Future Value og �ndrer double til 2 decimaler
		value.setText(String.format("%.2f", val));
    }
   
}
