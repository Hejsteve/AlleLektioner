package Temperature;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TemperatureGui extends Application {

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
    private final TextField txfFahrenheit = new TextField();
    private final TextField txfCelcius = new TextField();

    private void initContent(GridPane pane) {

        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));

        pane.setHgap(10);

        pane.setVgap(10);

        Label lblCelcius = new Label("Celcius:");
        pane.add(lblCelcius, 0, 0);

        Label lblFahrenheit = new Label("Fahrenheit:");
        pane.add(lblFahrenheit, 1,0);

        pane.add(txfCelcius, 0,1);
        pane.add(txfFahrenheit, 1,1);

        Button btnConvert = new Button("Convert");
        pane.add(btnConvert, 0, 2);
        btnConvert.setOnAction(actionEvent -> this.convertAction());
    }

    // -------------------------------------------------------------------------

    private void convertAction() {

        if (!txfCelcius.getText().isEmpty()) {
            double celcius = Double.parseDouble(txfCelcius.getText());
            double fahrenheit = celcius * 9.0 / 5.0 + 32;
            txfFahrenheit.setText(String.format("%.2f", fahrenheit));

        } else if (!txfFahrenheit.getText().isEmpty()) {
            double fahrenheit = Double.parseDouble(txfFahrenheit.getText());
            double celcius = (fahrenheit - 32) * 5.0 / 9.0;
            txfCelcius.setText(String.format("%.2f", celcius));
        }
    }
}

