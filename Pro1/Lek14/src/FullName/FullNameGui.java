package FullName;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FullNameGui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Full Name");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfFirstName = new TextField();
    private final TextField txfLastName = new TextField();
    private final TextField txfFullName = new TextField();

    private void initContent(GridPane pane) {

        pane.setGridLinesVisible(false);


        pane.setPadding(new Insets(20));

        pane.setHgap(10);

        pane.setVgap(10);

        Label lblFirstName = new Label("First Name:");
        pane.add(lblFirstName, 0, 0);

        Label lblLastName = new Label("Last Name:");
        pane.add(lblLastName, 1, 0);

        Label lblFullName = new Label("Full Name:");
        pane.add(lblFullName,0,2);

        pane.add(txfFirstName, 0, 1);

        pane.add(txfLastName, 1,1);

        pane.add(txfFullName, 0,3);

        Button btnFullName = new Button("Combine Names");
        pane.add(btnFullName,1, 3);
        btnFullName.setOnAction(actionEvent -> this.fullNameAction());
    }

    // -------------------------------------------------------------------------

    private void fullNameAction() {
        txfFullName.setText(txfFirstName.getText() + " " + txfLastName.getText());
    }
}