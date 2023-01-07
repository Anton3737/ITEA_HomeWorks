package Leason6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate {

    static void calculate() {

        DecimalFormat dF = new DecimalFormat("##00.0000######");
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть 3 числа для їх ділення на 5");
        System.out.println("Введіть перше число:");
        double A = sc.nextInt();
        System.out.println("Введіть перше число:");
        double B = sc.nextInt();
        System.out.println("Введіть перше число:");
        double C = sc.nextInt();

        double ResA = A / 5;

        double ResB = B / 5;

        double ResC = C / 5;

        System.out.println("Результати:");
        System.out.println("Введене число: " + (int) A + " становить: " + dF.format(ResA));
        System.out.println("Введене число: " + (int) B + " становить: " + dF.format(ResB));
        System.out.println("Введене число: " + (int) C + " становить: " + dF.format(ResC));

        System.out.println("-------------------");

        System.out.println(ResA + "\n" + ResB + "\n" + ResC);
    }

    public static void main(String[] args) {
        calculate();
    }
}

