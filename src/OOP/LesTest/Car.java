package OOP.LesTest;

public class Car {

    private String name;
    private String model;
    private int power;
    private int maxSpeed;
    private int year;

    public Car(String name, String model, int power, int maxSpeed, int year) {
        this.name = name;
        this.model = model;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
