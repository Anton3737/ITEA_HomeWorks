package OOPLeason11;


import java.util.Scanner;

public class BaseClass {


    static void MinMethod() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double MinNumber = Math.min(a, b);
        System.out.println("Min: " + MinNumber);

    }

    public static void MaxMethod() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double MaxNumber = Math.max(a, b);
        System.out.println("Max: " + MaxNumber);
    }

    public static void AverageMethod() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double AverageNumber = (a + b) / 2;
        System.out.println("Average: " + AverageNumber);
    }

    // Повідомлення

    public static void MessageMethodMin() {
        System.out.println("Повідомлення для методу Min");
        System.out.println("Введіть 2 числа аби дізнатись яке з них мінімальне!");
    }

    public static void MessageMethodMax() {
        System.out.println("Повідомлення для методу Max");
        System.out.println("Введіть 2 числа аби дізнатись яке з них максимальне!");
    }

    public static void MessageMethodAverage() {
        System.out.println("Повідомлення для методу Average");
        System.out.println("Введіть 2 числа аби дізнатись їх середнє значення!");

    }

    class InsideDerived extends BaseClass{







    }

}
