package Leason4_HWLoop;

import java.util.Scanner;

public class Task3 {

    static void LongDel() {

        Scanner sc = new Scanner(System.in);

        long input = sc.nextLong();

        while (input > 0) {

            long tmp = input % 10;
            System.out.print(tmp + ",");
            input /= 10;
        }
    }

    public static void main(String[] args) {
        LongDel();
    }
}

