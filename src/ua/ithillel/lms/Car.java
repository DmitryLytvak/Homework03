package ua.ithillel.lms;

public class Car {

    private String brand;
    private String model;
    private int doors;
    private String color;

    public Car(String brand, String model, int doors, String color) {
        this.brand = brand;
        this.model = model;
        this.doors = doors;
        this.color = color;
    }

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Motor start.");
    }

    private void startElectricity() {
        System.out.println("Electricity supply.");
    }

    private void startCommand() {
        System.out.println("System start.");
    }

    private void startFuelSystem() {
        System.out.println("Fuel supply.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
