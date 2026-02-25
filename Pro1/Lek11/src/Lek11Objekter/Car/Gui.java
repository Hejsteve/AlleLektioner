package Lek11Objekter.Car;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);
        stage.setTitle("Car");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        // PARAMETRE
        int paneWidth = 1000; // Justerer størrelsen på canvas. Alt er bundet op på den her.
        int wheels = 2;
        int doors = 2;
        Color color = Color.CRIMSON;
        boolean baggrund = true;
        boolean udstødning = true;
        boolean forlygter = true;

        int paneHeight = paneWidth / 3 * 2;
        pane.setPrefSize(paneWidth, paneHeight);
        Car car1 = new Car(wheels, doors, color);
        this.drawCar(pane, car1, paneHeight, paneWidth, baggrund, udstødning, forlygter);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawCar(Pane pane, Car car, int paneHeight, int paneWidth, boolean baggrund, boolean udstødning, boolean forlygter) {
        int wheels = car.getWheels();
        int doors = car.getDoors();
        Color carColor = car.getColor();
        double wheelGap;
        if (wheels == 1) {wheelGap = 0.4 / wheels;} else {wheelGap = 0.4 / (wheels - 1);}

        if(baggrund) {
            // HIMMEL
            Rectangle background = new Rectangle();
            background.setX(0);
            background.setY(0);
            background.setWidth(paneWidth);
            background.setHeight(paneHeight);
            background.setFill(Color.DEEPSKYBLUE);
            background.setStroke(Color.DEEPSKYBLUE);
            pane.getChildren().add(background);

            // Jord
            Rectangle ground = new Rectangle();
            ground.setX(0);
            ground.setY(paneHeight * 0.5);
            ground.setWidth(paneWidth);
            ground.setHeight(paneHeight);
            ground.setFill(Color.FORESTGREEN);
            ground.setStroke(Color.FORESTGREEN);
            pane.getChildren().add(ground);
        }

        if(udstødning) {
            // Udstødning
            Rectangle udstng = new Rectangle();
            udstng.setX(paneWidth * 0.18);
            udstng.setY(paneHeight * 0.52);
            udstng.setWidth(paneWidth * 0.04);
            udstng.setHeight(paneHeight * 0.045);
            udstng.setArcWidth(paneWidth * 0.005);
            udstng.setArcHeight(paneWidth * 0.005);
            udstng.setFill(Color.DIMGRAY);
            udstng.setStroke(Color.BLACK);
            pane.getChildren().add(udstng);

            Line line = new Line(paneWidth*0.12, paneHeight*0.54, paneWidth*0.16,paneHeight*0.54);
            pane.getChildren().add(line);
        }

        // Main car component 1: top part
        Rectangle carTopPart = new Rectangle();
        carTopPart.setX(paneWidth*0.25);
        carTopPart.setY(paneHeight*0.19);
        carTopPart.setWidth(paneWidth*0.4);
        carTopPart.setHeight(paneWidth*0.25);
        carTopPart.setArcWidth(paneWidth*0.32);
        carTopPart.setArcHeight(paneWidth*0.32);
        carTopPart.setFill(carColor);
        carTopPart.setStroke(carColor);
        pane.getChildren().add(carTopPart);

        // Main car component 2: bottom part
        Rectangle carBottomPart = new Rectangle();
        carBottomPart.setX(paneWidth*0.2);
        carBottomPart.setY(paneHeight*0.35);
        carBottomPart.setWidth(paneWidth * 0.6);
        carBottomPart.setHeight(paneHeight*0.3);
        carBottomPart.setArcWidth(paneWidth*0.2);
        carBottomPart.setArcHeight(paneWidth*0.1);
        carBottomPart.setFill(carColor);
        carBottomPart.setStroke(carColor);
        pane.getChildren().add(carBottomPart);

        if(forlygter) {
            // Forlygte
            Rectangle frontlights = new Rectangle();
            frontlights.setX(paneWidth * 0.75);
            frontlights.setY(paneHeight * 0.4);
            frontlights.setWidth(paneWidth * 0.035);
            frontlights.setHeight(paneHeight * 0.045);
            frontlights.setArcWidth(paneWidth * 0.1);
            frontlights.setArcHeight(paneWidth * 0.1);
            frontlights.setFill(Color.GOLD);
            frontlights.setStroke(Color.BLACK);
            pane.getChildren().add(frontlights);
        }

        // wheels
        for (int i = 0; i < wheels; i++) {
            Circle circle1 = new Circle(paneWidth * (0.3 + i * wheelGap), paneHeight*0.65, paneWidth*0.055); // paneWidth * 0.3 MIN, paneWidth * 0.7 MAX
            pane.getChildren().add(circle1);
            Circle circle2 = new Circle(paneWidth * (0.3 + i * wheelGap), paneHeight*0.65, paneWidth*0.025); // paneWidth * 0.3 MIN, paneWidth * 0.7 MAX
            circle2.setFill(Color.DARKGREY);
            pane.getChildren().add(circle2);
        }

        double doorWidth = 0.3 / doors;

        // Doors
        for (int i = 0; i < doors; i++) {
            Rectangle mainDoor = new Rectangle();
            mainDoor.setX(paneWidth * (0.3 + (i*doorWidth))); // 0.3 minimum, 0.52 max
            mainDoor.setY(paneHeight*0.27);
            mainDoor.setWidth(paneWidth * doorWidth);
            mainDoor.setHeight(paneHeight*0.24);
            mainDoor.setArcWidth(paneWidth*0.01);
            mainDoor.setArcHeight(paneWidth*0.01);
            mainDoor.setFill(carColor);
            mainDoor.setStroke(Color.BLACK);
            pane.getChildren().add(mainDoor);

            Rectangle window = new Rectangle();
            window.setX(paneWidth  * (0.3 + (i*doorWidth))); // 0.3 minimum, 0.52 max
            window.setY(paneHeight*0.27);
            window.setWidth(paneWidth * doorWidth);
            window.setHeight(paneHeight*0.08);
            window.setFill(Color.DEEPSKYBLUE);
            window.setStroke(Color.BLACK);
            pane.getChildren().add(window);

            Rectangle handle = new Rectangle();
            handle.setX(paneWidth * (0.31 + (i*doorWidth))); // 0.3 minimum, 0.52 max
            handle.setY(paneHeight*0.44);
            handle.setWidth(paneWidth * (doorWidth * 0.15));
            handle.setHeight(paneHeight*0.007);
            handle.setArcWidth(paneWidth*0.001);
            handle.setArcHeight(paneWidth*0.001);
            handle.setFill(carColor);
            handle.setStroke(Color.BLACK);
            pane.getChildren().add(handle);
        }
    }
}
