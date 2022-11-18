package Leason2;

import java.util.Scanner;

public class Task7 {

    // Точка входу в програму
    public static void main(String[] args) {
        // Сканер для вводу даних
        Scanner inputNumbers = new Scanner(System.in);

        double firstNumb = inputNumbers.nextDouble();

        double secondNumb = inputNumbers.nextDouble();

        // Вивід в консоль результатів
        System.out.println("Максимальне значеннмя із введених чисел являється: " + Math.max(firstNumb, secondNumb));

        System.out.println("Мінімальним значеннмя із введених чисел являється: " + Math.min(firstNumb, secondNumb));

    }
}
