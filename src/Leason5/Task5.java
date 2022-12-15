package Leason5;

import java.util.Scanner;

public class Task5 {

    public static int Methood() {
        Scanner inputInt = new Scanner(System.in);
        int numbers = inputInt.nextInt();

        int tmp = numbers % 2;

        return tmp;
    }

    public static void main(String[] args) {

        if (Methood() == 0) {
            System.out.println("Введене Вами число являється парним");


        } else {
            System.out.println("Введене Вами число являється НЕ парним");
        }
    }
}
