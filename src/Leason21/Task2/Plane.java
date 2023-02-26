package Leason21.Task2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Plane implements Serializable {
    int wheels;
    int max_height;
    int cruiser_speed;
    int max_speed;
    int crew;
    int passengers;
    Plane_type plane_type;

    public Plane(int wheels, int max_height, int cruiser_speed, int max_speed, int crew, int passengers, Plane_type plane_type) {
        this.wheels = wheels;
        this.max_height = max_height;
        this.cruiser_speed = cruiser_speed;
        this.max_speed = max_speed;
        this.crew = crew;
        this.passengers = passengers;
        this.plane_type = plane_type;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Plane_type implements Serializable {
    String name;
    String manufacture;
    String type;
    String country;
    String engine_type;

    public Plane_type(String name, String manufacture, String type, String country, String engine_type) {
        this.name = name;
        this.manufacture = manufacture;
        this.type = type;
        this.country = country;
        this.engine_type = engine_type;
    }
}
