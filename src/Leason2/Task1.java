package Leason2;

import java.util.Scanner;

public class Task1 {

    // Найти формулу герона. Примечание к заданию квадратный корень находится с помощью Math.sqrt

    //  Палітра кольорів для виділення тексту нагло вкрадена зі Стековерфлоу
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // основиний метод програми (Головний)
    public static void main(String[] args) {

        System.out.println("Визначення площі трикутника за формула 'Герона'");
        // Сканер для вводу даних юзером (Зчитуємо 3 змінних типу DOUBLE для точності)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 'бічне ребро' трикутника " + ANSI_RED + "А" + ANSI_RESET);
        double a = scanner.nextDouble();
        System.out.println("Введіть 'бічне ребро' трикутника " + ANSI_BLUE + "В" + ANSI_RESET);
        double b = scanner.nextDouble();
        System.out.println("Введіть 'бічне ребро' трикутника " + ANSI_CYAN + "C" + ANSI_RESET);
        double c = scanner.nextDouble();

        // Для визначення Площі трикутника за формулою Герона нам необхідно вирахувати значення його півпериметр "p"
        double p = (a + b + c) / 2;
        // Наступним кроком є вирахування площі трикутника де першим чином будуть виконуватися операції в дужках такі як (p - a) (p - b)  (p - c)
        // наступним кроком йде операція множення вирахуваного в попередній формулі числа 'p'- півпериметра
        // Третім кроком йде піднесення до Кореню за допомогою бібліотеки Math.  та методу sqrt
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Півпериметр трикутника , а саме число " + ANSI_PURPLE + "'p'" + ANSI_RESET + " становить: " + ANSI_PURPLE + p + ANSI_RESET);

        System.out.println("Площа трикутника зі сторонами " + a + " | " + b + " | " + c + " за формула 'Герона' становить: " + ANSI_YELLOW + S + ANSI_RESET);

    }

}
