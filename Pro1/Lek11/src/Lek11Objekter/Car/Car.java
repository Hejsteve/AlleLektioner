package Lek11Objekter.Car;

import javafx.scene.paint.Color;

public class Car {
    private int wheels;
    private int doors;
    private Color color;

    public Car(int wheels, int doors, Color color) {
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
    }
    public Car(int doors, Color color) {
        this(4, doors, color);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
