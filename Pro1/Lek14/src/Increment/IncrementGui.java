package Increment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class IncrementGui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Increment & Decrement");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

    }

    // -------------------------------------------------------------------------

    private final TextField txfNumber = new TextField();

    private void initContent(GridPane pane) {

        pane.setGridLinesVisible(false);


        pane.setPadding(new Insets(20));

        pane.setHgap(10);

        pane.setVgap(10);

        Label lblNumber = new Label("Number:");
        pane.add(lblNumber, 0, 0);


        pane.add(txfNumber, 0, 1);

        Button btnIncrement = new Button("Increment");
        pane.add(btnIncrement, 1, 0);
        btnIncrement.setOnAction(actionEvent -> this.incrementAction());

        Button btnDecrement = new Button("Decrement");
        pane.add(btnDecrement, 1, 1);
        btnDecrement.setOnAction(actionEvent -> this.decrementAction());
    }

    // -------------------------------------------------------------------------

    private void incrementAction() {
        int number = Integer.parseInt(txfNumber.getText());
        number++;
        txfNumber.setText("" + number);
    }

    private void decrementAction() {
        int number = Integer.parseInt(txfNumber.getText());
        number--;
        txfNumber.setText("" + number);
    }
}