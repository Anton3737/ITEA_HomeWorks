package Leason2;

import java.util.Scanner;

public class Task2 {

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

    public static void main(String[] args) {

        // невелике діалогове вікно для ведення розрахунку
        System.out.println("розрахунок площі " + ANSI_BLUE + " S " + ANSI_RESET + " та об'єму " + ANSI_YELLOW + " V " + ANSI_RESET + "куба ");
        System.out.println("Площа " + ANSI_BLUE + "S" + ANSI_RESET + " куба розраховується за формулою : S = 6 * a\u00B2");
        System.out.println("Об'єм " + ANSI_YELLOW + "V" + ANSI_RESET + " куба розраховується за формулою : V = a\u00B3");

        // Сканер для зчитування
        Scanner scanner = new Scanner(System.in);

        // Запит на введення данних
        System.out.println("Введіть число 'a' яке рівняється ребру рівностороннього куба:");
        double a = scanner.nextDouble();

        // Розрахунок Площі
        double S = 6 * (a * a);

        // Розрахунок об'єму
        double V = a * a * a;

        // Виведення результату
        System.out.println("Введене число ребра: " + ANSI_PURPLE + a + ANSI_RESET);
        System.out.println("Площа куба" + ANSI_BLUE + " S " + ANSI_RESET + "становить: " + ANSI_BLUE + S + ANSI_RESET);
        System.out.println("Об'єм куба" + ANSI_YELLOW + " V " + ANSI_RESET + "становить: " + ANSI_YELLOW + V + ANSI_RESET);


    }
}
