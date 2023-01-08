package Leason5;

import java.util.Scanner;

public class Task6 {

    public static void MethodPow() {
        System.out.println("введіть число для піднесення його до степеню 2 <Варіант 1>");

        Scanner inputNumbers = new Scanner(System.in);

        double intData = inputNumbers.nextDouble();

        double ResMethodPow = Math.pow(intData, 2);

        System.out.println("Введене число " + intData + " піднесене до ступеню (2) становить " + ResMethodPow);

        System.out.println("Введене число " + intData + " піднесене до ступеню (2)+2 становить " + (ResMethodPow + 2));

    }

    public static void MethodMul() {
        System.out.println("введіть число для піднесення його до степеню 2 <Варіант 2>");

        Scanner inputNumbers = new Scanner(System.in);

        double intData = inputNumbers.nextDouble();

        double ResMethodMul = intData * intData;

        System.out.println("Введене число " + intData + " піднесене до ступеню (2) становить " + ResMethodMul);

        System.out.println("Введене число " + intData + " піднесене до ступеню (2)+2 становить " + (ResMethodMul + 2));

    }

    public static void main(String[] args) {

        Task6 Pow1 = new Task6();
        Pow1.MethodPow();

        System.out.println("------------------------------------------------");

        Pow1.MethodMul();

    }
}
