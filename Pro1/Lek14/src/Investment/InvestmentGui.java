package Investment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvestmentGui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Investment");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    // -------------------------------------------------------------------------
    private final TextField txfInvestment = new TextField();
    private final TextField txfYears = new TextField();
    private final TextField txfInterest = new TextField();
    private final TextField txfFutureValue = new TextField();

    private void initContent(GridPane pane) {

        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));

        pane.setHgap(10);

        pane.setVgap(10);

        Label lblInvestment = new Label("Investment:");
        pane.add(lblInvestment, 0, 0);

        Label lblYears = new Label("Years:");
        pane.add(lblYears, 0,1);

        Label lblNumberOfYears = new Label("Interest (%):");
        pane.add(lblNumberOfYears, 0, 2);

        Label lblFutureValue = new Label("Future Value:");
        pane.add(lblFutureValue,0,4);

        pane.add(txfInvestment, 1,0);
        pane.add(txfYears, 1,1);
        pane.add(txfInterest, 1, 2);
        pane.add(txfFutureValue,1,4);

        Button btnCalculate = new Button("Calculate");
        pane.add(btnCalculate, 1, 3);
        btnCalculate.setOnAction(actionEvent -> this.calculateAction());
    }

    // -------------------------------------------------------------------------

    private void calculateAction() {

        // Double.parseDouble tager en tekst String og laver den om til et double-tal
        double investment = Double.parseDouble(txfInvestment.getText());
        double years = Double.parseDouble(txfYears.getText());
        double interest = Double.parseDouble(txfInterest.getText());

        double value = investment * Math.pow(1 + interest / 100, years);

        txfFutureValue.setText(String.format("%.2f",  value));
    }
}
