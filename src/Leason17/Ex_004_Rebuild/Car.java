package Leason17.Ex_004_Rebuild;

import java.util.Comparator;
import java.util.Set;

import static java.util.Arrays.sort;

public class Car implements Comparable {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Object o) {
        int Tmp = this.speed - ((Car) o).speed;

        if (Tmp == 0) {

            return this.price - ((Car) o).price;
        } else {
            return Tmp;
        }
    }
}


//    У папці з прикладами ex_004_comparable.
//    Дописати логіку, щоб метод compareTo() здійснив пошук за швидкістю
//    (якщо ж швидкість у 2-х об'єктів дорівнює, то шукаємо за ціною) -> ціною -> моделі -> кольору машини.
