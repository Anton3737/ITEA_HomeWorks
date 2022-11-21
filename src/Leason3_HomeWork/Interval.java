package Leason3_HomeWork;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        final int A_1 = 0;   // Рівень початку інтервалу
        final int B_1 = 14;  // Рівень закінчення інтервалу

        final int A_2 = 15;
        final int B_2 = 35;

        final int A_3 = 36;
        final int B_3 = 50;

        final int A_4 = 50;
        final int B_4 = 100;

        // Сканер для вводу даних
        Scanner number = new Scanner(System.in);
        // Інтове число введене через сканер
        int inputNumb = number.nextInt();

        if (A_1 <= inputNumb && inputNumb <= B_1) {
            System.out.println("Введене вами число " + inputNumb + "входить в діапазон: 0 - 14");
        }
        if (A_2 <= inputNumb && inputNumb <= B_2) {
            System.out.println("Введене вами число " + inputNumb + "входить в діапазон: 15 - 35");
        }
        if (A_3 <= inputNumb && inputNumb <= B_3) {
            System.out.println("Введене вами числовх " + inputNumb + "одить в діапазон: 36 - 50");
        }
        if (A_4 <= inputNumb && inputNumb <= B_4) {
            System.out.println("Введене вами число " + inputNumb + " входить в діапазон: 50 - 100");
        } else if (inputNumb > B_4) {
            System.out.println("Введене вами число " + inputNumb + "не входить в жоден з діапазонів");
        }
    }
}
