package Leason2;

import java.util.Scanner;

public class Task5 {
    // Вказуємо контрольні точки Години як константи так-як вони будуть незмінними
    static final int MORNING = 1;
    static final int NOON = 12;
    static final int DAY = 20;
    static final int NIGHT = 24;

    // Точка входу в програму або головний метод
    public static void main(String[] args) {
        // Діалогове вікно
        System.out.println("Введіть час аби дізнатись відрізок доби: " + "\n");
        // Сканер для вводу даних
        Scanner timeOfDay = new Scanner(System.in);

        // Присвоєне значення на основі веденого юзером
        int inpitTime = timeOfDay.nextInt();

        // Конструкція if else для опрацювання відпрацювання умови описаної в дужках () тобто чи є введене юзером число в рамках 1го із 3х діапазонів
        if (MORNING <= inpitTime && inpitTime < NOON) {

            // вивід результату введеного юзером числа
            System.out.println("Good morning Vietnaaaaam !!!");
            System.out.println("Доброго ранку");
        }
        if (NOON <= inpitTime && inpitTime < DAY) {
            System.out.println("Good day sir !");
            System.out.println("Доброго дня");
        }
        else if (DAY <= inpitTime && inpitTime <= NIGHT) {
            System.out.println("Good night !");
            System.out.println("Доброї ночі");
        }
    }
}
