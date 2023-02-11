package Leason17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

public class Car implements Comparable , Comparator { //<Car>{
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

    public int compareTo(Object o) {

        if (this.speed > ((Car) o).speed) {
            return 1;
        } else if (this.speed < ((Car) o).speed) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public int compare(Object o1, Object o2) {
        if (o1 != o2) {
            Integer speed = ((Car) o1).speed;
            Integer speed1 = ((Car) o1).speed;
            return speed.compareTo(speed1);
        } else if (o1 != o1){
            Integer price = ((Car) o1).price;
            Integer price1 = ((Car) o1).price;
            return price.compareTo(price1);
        } else if (o1 != o1){
            String model = ((Car) o1).model;
            String model1 = ((Car) o1).model;

            return model.compareTo(model1);
        }else {
            String color = ((Car) o1).color;
            String color1 = ((Car) o1).color;
            return color.compareTo(color1);
        }

    }


    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car[] c = {c1, c2, c3};

        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }


    }

}

//    У папці з прикладами ex_004_comparable.
//    Дописати логіку, щоб метод compareTo() здійснив пошук за швидкістю
//    (якщо ж швидкість у 2-х об'єктів дорівнює, то шукаємо за ціною) -> ціною -> моделі -> кольору машини.
