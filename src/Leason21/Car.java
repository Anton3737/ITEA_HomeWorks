package Leason21;

import java.io.Serializable;

public class Car implements Serializable {

    int wheels;

    int doors;

    String body_type;

    String name;

    String model;


    Engine engine;

    Special_modification modify;

    public Car(int wheels, int doors, String body_type, String name, String model, Engine engine, Special_modification modify) {
        this.wheels = wheels;
        this.doors = doors;
        this.body_type = body_type;
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.modify = modify;
    }
}

class Engine implements Serializable {

    int number_of_cylinders;

    int volume;

    double newton_meters;

    int hp_power;

    String fuel;

    public Engine(int number_of_cylinders, int volume, double newton_meters, int hp_power, String fuel) {
        this.number_of_cylinders = number_of_cylinders;
        this.volume = volume;
        this.newton_meters = newton_meters;
        this.hp_power = hp_power;
        this.fuel = fuel;
    }
}

class Special_modification implements Serializable {

    String spoiler;

    String color;

    String wheels_disk;

    String neon;

    String turbo;


    public Special_modification(String spoiler, String color, String wheels_disk, String neon, String turbo) {
        this.spoiler = spoiler;
        this.color = color;
        this.wheels_disk = wheels_disk;
        this.neon = neon;
        this.turbo = turbo;
    }

}

