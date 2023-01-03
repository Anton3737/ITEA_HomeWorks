package Leason4_HWLoop;

import java.util.Scanner;

public class Task2_1 {

    static void Multiple() {
        System.out.println("Введіть число для формування таблиці множення");

        Scanner inputNumb = new Scanner(System.in);

        int count = inputNumb.nextInt();
        int Res;
        System.out.println("Таблиця моноження на: " + count);
        for (int i = 1; i <= 10; i++) {
            Res = count * i;
            System.out.println(count + " * " + i + " = " + Res);
        }
    }

    public static void main(String[] args) {
        System.out.println("___________________________________________");
        Multiple();
        System.out.println("___________________________________________");
    }
}
