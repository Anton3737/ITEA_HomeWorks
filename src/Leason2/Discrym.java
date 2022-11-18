package Leason2;

import java.util.Scanner;

public class Discrym {

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

    // Точка входу в програму
    public static void main(String[] args) {
        // Умова та пояснення
        System.out.println("Дискримінант D квадратного рівняння a * x\u00B2 + bx + c = 0 рівний D = b\u00B2 – 4 * a * c." + "\n"
                + "Дискримінант вирішується ща формулою D = b\u00B2 - 4 * a * c" + "\n"
                + "Корені (розв'язки) квадратного рівняння залежать від знаку дискримінанту (D) :\n" +
                "D > 0 – рівняння має 2 різних дійсних коренів;\n" +
                "D = 0 - рівняння має 1 корінь (2 одинакові корені):" + "\n\n");

        // Введення наних через сканер
        Scanner data = new Scanner(System.in);
        System.out.println("Введіть значення 'а'");
        double a = data.nextDouble();
        System.out.println("Введіть значення 'b'");
        double b = data.nextDouble();
        System.out.println("Введіть значення 'c'");
        double c = data.nextDouble();

        // розрахунок дискримінанту
        double D = b * b - 4 * a * c;

        // Виконання умов при яких Дискримінант є Д > 0 або Д < 0 або Д == 0
        if (D < 0) {
            System.out.println(ANSI_PURPLE + "Виконується умова в якій D < 0" + ANSI_RESET);
            System.out.println(ANSI_RED + "Немає коренів" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Дискримінант рівний числу: " + D + ANSI_RESET);

        } else if (D == 0) {
            System.out.println(ANSI_PURPLE + "Виконується умова в якій D = 0" + ANSI_RESET);
            double x = -b / (2 * a);

            System.out.println("x = " + x);

            System.out.println(ANSI_CYAN + "Дискримінант рівний числу: " + D + ANSI_RESET);

        } else if (D > 0) {
            System.out.println(ANSI_PURPLE + "Виконується умова в якій D > 0" + ANSI_PURPLE);

            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

            System.out.println(ANSI_CYAN + "Дискримінант рівний числу: " + D + ANSI_RESET);
        }
    }
}
