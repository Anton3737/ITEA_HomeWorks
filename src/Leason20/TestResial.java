package Leason20;

import java.io.Serializable;

public class TestResial  implements Serializable {

    int wheels;

    String model;

    int power;

    int fuelTank;

    int doors;

    Sub_Details details;

    public TestResial(int wheels, String model, int power, int fuelTank, int doors, Sub_Details details) {
        this.wheels = wheels;
        this.model = model;
        this.power = power;
        this.fuelTank = fuelTank;
        this.doors = doors;
        this.details = details;
    }
}


class Sub_Details implements Serializable {
    String spoiler;

    String neon;

    String color;

    public Sub_Details(String spoiler, String neon, String color) {
        this.spoiler = spoiler;
        this.neon = neon;
        this.color = color;
    }


}

