package Leason17.Ex_004_Rebuild;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car[] c = {c1, c2, c3};

        Arrays.sort(c);
        for (Car arrays : c) {
            System.out.println(arrays);
        }


    }

}
