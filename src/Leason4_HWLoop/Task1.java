package Leason4_HWLoop;

import java.util.Scanner;

public class Task1 {

    static void SumMin() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Сума чисел в діапазоні " + A + " | " + B);
        int Tmp = 0;
        if (A > B) {
            System.out.println("Перше число менше другого - Умову не виконано");
        } else {
            for (int i = A; i < B; i++) {
                Tmp += i;
            }
            System.out.println(Tmp);
        }
    }


    static void NotDel() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Непарні чиса в діапазоні " + A + " | " + B);

        if (A > B) {
            System.out.println("Перше число менше другого - Умову не виконано");
        } else {
            for (int i = A; i < B; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    static void Del() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Парні чиса в діапазоні " + A + " | " + B);
        if (A > B) {
            System.out.println("Перше число менше другого - Умову не виконано");
        } else {
            for (int i = A; i < B; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("---------------------------");
        SumMin();

        System.out.println("---------------------------");
        NotDel();

        System.out.println("---------------------------");
        Del();
    }
}
