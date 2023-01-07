package Leason6;

import java.util.Scanner;

public class Task2 {

    static int Factorial(int Delivery) {
        int start = 1;
        for (int i = 1; i <= Delivery; i++) {
            start = start * i;
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println("Введіть кількість адрес яким необхідно курьєру доставити товар!");

        Scanner inputDelivery = new Scanner(System.in);

        System.out.println("Число можливих варіантів доставки товару становить: " + Factorial(inputDelivery.nextInt()) + " маршрути.");
    }


}
