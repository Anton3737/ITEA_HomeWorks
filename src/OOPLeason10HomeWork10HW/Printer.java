package OOPLeason10HomeWork10HW;

import java.util.Scanner;

public class Printer {

    protected static final String ANSI_RESET = "\u001B[0m";
    protected static final String ANSI_BLACK = "\u001B[30m";
    protected static final String ANSI_RED = "\u001B[31m";
    protected static final String ANSI_GREEN = "\u001B[32m";
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_BLUE = "\u001B[34m";
    protected static final String ANSI_PURPLE = "\u001B[35m";
    protected static final String ANSI_CYAN = "\u001B[36m";
    protected static final String ANSI_WHITE = "\u001B[37m";



    public static void main(String[] args) {

        System.out.println("Доступні кольори: red | blue | green | yellow | black | purple | cyan | white");

        Scanner sc = new Scanner(System.in);

        String inputColor = sc.next();

        switch (inputColor) {


            case ("red"):
                System.out.println(ANSI_RED + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + ANSI_RESET);
                break;
            case ("blue"):
                System.out.println(ANSI_BLUE + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + ANSI_RESET);
                break;
            case ("green"):
                System.out.println(ANSI_GREEN + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + ANSI_RESET);
                break;
            case ("yellow"):
                System.out.println(ANSI_YELLOW + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + ANSI_RESET);
                break;
            case ("black"):
                System.out.println(ANSI_BLACK + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + ANSI_RESET);
                break;
            case ("purple"):
                System.out.println(ANSI_PURPLE + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + ANSI_RESET);
                break;
            case ("cyan"):
                System.out.println(ANSI_CYAN + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + ANSI_RESET);
                break;
            case ("white"):
                System.out.println(ANSI_WHITE + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + ANSI_RESET);
                break;
            default:
        }
    }
}
