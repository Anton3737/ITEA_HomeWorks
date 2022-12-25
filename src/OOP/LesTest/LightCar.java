package OOP.LesTest;

public class LightCar extends Car {


    public int doors;
    public int tank;


    public LightCar(String name, String model, int power, int maxSpeed, int year, int doors, int tank) {
        super(name, model, power, maxSpeed, year);
        this.doors = doors;
        this.tank = tank;
    }


}
