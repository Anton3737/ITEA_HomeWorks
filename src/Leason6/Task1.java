package Leason6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner DepositInput = new Scanner(System.in);
        double sum = DepositInput.nextDouble();
        double ResCred;
        final double CREDIT = 700;
        int tmp = 0;

        if (sum == CREDIT) {
            System.out.println("Кредит виплачено");
        } else if (sum <= CREDIT) {



            for (int i = 0; i < 6; i++) {

            }




        } else if (sum > CREDIT) {
            double creditOverPay = sum - CREDIT;
            System.out.println("Кредит виплачено");
            System.out.println("Сумма передплати складає: " + creditOverPay);

        }
    }
}
