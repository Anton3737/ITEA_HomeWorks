package Leason3_HomeWork;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {

        // Сканер для вводу даних
        Scanner number = new Scanner(System.in);

        // Інтове значення введене через сканер
        int inputNum = number.nextInt();


        // Варіант рішенн №1
        if (inputNum != 0) {
            if ((inputNum % 2) == 0) {
                System.out.println("Введене Вами число " + inputNum + " - являється парним");
            } else {
                System.out.println("Введене Вами число " + inputNum + " - являється НЕ парним");
            }
        } else {
            System.out.println("Ви ввели нульове значення");
        }

        System.out.println("-------------------------------------------------------------------");

        // Варіант рашення №2
        System.out.println(((inputNum % 2) == 0) ? "Введене Вами число " + inputNum + " - являється парним" : "Введене Вами число " + inputNum + " - являється НЕ парним");
    }
}
