package Leason5;

import java.util.Scanner;

public class Task8 {

    public static int MathPow(int a, int b) {

        int Tmp = 1;
        for (int i = 1; i <= b; i++) {
            Tmp = Tmp * a;
        }
        return Tmp;
    }

    public static void main(String[] args) {

        Task8 powAddition = new Task8();

        int Resault = powAddition.MathPow(3, 2) + powAddition.MathPow(2, 6);

        System.out.println("*******************************************************************");
        System.out.println("Результатом додавання вихідних даних методів " + powAddition.MathPow(3, 2) + " та " + powAddition.MathPow(2, 6) + " стоановить: " + Resault);
        System.out.println("*******************************************************************");
    }
}

