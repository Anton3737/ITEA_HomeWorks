package Leason5;

import java.util.Scanner;

public class Task6 {

    public static int MethoodPow() {

        Scanner inputNumbers = new Scanner(System.in);

        double inptData = inputNumbers.nextDouble();

        double resMethoodPow = Math.pow(inptData, 2);

        return (int) resMethoodPow;
    }


    public static int MethoodMul() {

        Scanner inputNumbers = new Scanner(System.in);

        double inptData = inputNumbers.nextDouble();

        double resMethoodMul = inptData * inptData;

        return (int) resMethoodMul;
    }


    public static void main(String[] args) {
        System.out.println("Через Math.pow");
        System.out.println(MethoodPow() + 2);
        System.out.println(MethoodPow() == 0);

        System.out.println("-----------------------");
        System.out.println("Через множення як в Умові до задачі");
        System.out.println(MethoodMul() + 2);
    }
}
