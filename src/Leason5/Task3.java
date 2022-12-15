package Leason5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner inputNumbers = new Scanner(System.in);

        double inputNum = inputNumbers.nextDouble();
        int MathPow3 = 3;

        System.out.println("Піднесення до Кубу введеного Вами числа "+ inputNum + " складає " +Math.pow(inputNum, MathPow3));
    }
}
