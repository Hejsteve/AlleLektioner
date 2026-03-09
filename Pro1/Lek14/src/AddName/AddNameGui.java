package AddName;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddNameGui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Name List");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    // -------------------------------------------------------------------------
    private final TextField txfNameInput = new TextField();
    private final TextArea txfNamesAdded = new TextArea();

    private void initContent(GridPane pane) {

        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));

        pane.setHgap(10);

        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        pane.add(txfNameInput, 0,1,3,1);
        pane.add(txfNamesAdded, 0,3,3,3);

        Button btnAddName = new Button("Add");
        pane.add(btnAddName, 1, 2);
        btnAddName.setOnAction(actionEvent -> this.addNameAction());
    }

    // -------------------------------------------------------------------------

    private void addNameAction() {
        String name = txfNameInput.getText();
        String added = txfNamesAdded.getText();

        // "\n" laver linje skift
        txfNamesAdded.setText(added + name + "\n");
        txfNameInput.clear();
    }
}

