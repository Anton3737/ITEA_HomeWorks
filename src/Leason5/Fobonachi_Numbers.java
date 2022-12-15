package Leason5;

import java.util.Scanner;

public class Fobonachi_Numbers {

    public static void main(String[] args) {

        Scanner inputNumbers = new Scanner(System.in);
        int numbersFibonachi = inputNumbers.nextInt();
//        a
        int tmpVariable = 0;
//        b
        int startItteration = 1;

        for (int i = 2; i <= numbersFibonachi; ++i) {
//           c = a + b
            int newVariable = tmpVariable + startItteration;
//            a = b
            tmpVariable = startItteration;
//            b = c
            startItteration = newVariable;
            System.out.print(" > " + startItteration);
        }
        System.out.println();
        System.out.println("Число Фібоначі від введено числа " + numbersFibonachi + " складає " + startItteration);

    }
}
