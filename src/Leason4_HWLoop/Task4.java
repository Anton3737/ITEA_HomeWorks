package Leason4_HWLoop;

import java.util.Scanner;

public class Task4 {

    static void Figure() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть кількість елементів по Вертикалі");
        int A = sc.nextInt();

        for (int i = 1; i <= A; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Figure();
    }
}
