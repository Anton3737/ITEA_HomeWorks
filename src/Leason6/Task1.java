package Leason6;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {


        Scanner inputCash = new Scanner(System.in);

        for (int i = 0; i <= 6; i++) {
            double creditCash = inputCash.nextDouble();

            Credit(creditCash);
        }
    }

    public static void Credit(double sum) {

        final double CREDIT = 700;

        if (sum == CREDIT) {
            System.out.println("Кредит виплачено");
        }
        if (sum < CREDIT) {
            double creditVar = CREDIT - sum;
            System.out.println("Кредит не виплачено");
            System.out.println("Сума боргу складає: " + creditVar);
        }
        if (sum > CREDIT) {
            double creditOver = CREDIT - sum;
            System.out.println("Кредит виплачено");
            System.out.println("Сумма передплати складає: " + creditOver);

        }
    }

}

