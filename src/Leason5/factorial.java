package Leason5;

import java.util.Scanner;

public class factorial {

    static int FacrorialResault(int inputNumberScan) {

        int resault = 1;

        for (int i = 1; i <= inputNumberScan; i++) {
            resault = resault * i;
        }
        return resault;
    }

    public static void main(String[] args) {
        System.out.println("Внесіть число для розрахунку Факторіалу: ");
        Scanner inputNumbers = new Scanner(System.in);
        int factorialNumber = inputNumbers.nextInt();

        System.out.println("Факториал числа: " + factorialNumber + " складає: " + FacrorialResault(factorialNumber));
    }
}
