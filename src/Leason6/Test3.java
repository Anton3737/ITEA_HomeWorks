package Leason6;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int resault = 0;
        int tmp = 0;
        int Credit = 700;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 6; i++) {

            tmp = sc.nextInt();
            resault += tmp;
            System.out.println(resault);
        }

    }
}


