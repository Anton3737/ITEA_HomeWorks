package OOPLeason10HomeWork10HW.PrintSecond;

//https://habr.com/ru/post/119436/

import java.util.Scanner;

public class PrinterSecond {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    void Print(String value) {
        System.out.println(value);
    }


    static class Printing_BLACK extends PrinterSecond {
        public void Print(String value) {

            System.out.println(ANSI_BLACK + value + ANSI_RESET);
        }
    }

    static class Printing_RED extends PrinterSecond {
        public void Print(String value) {

            System.out.println(ANSI_RED + value + ANSI_RESET);
        }
    }

    static class Printing_GREEN extends PrinterSecond {
        public void Print(String value) {

            System.out.println(ANSI_GREEN + value + ANSI_RESET);
        }
    }

    static class Printing_YELLOW extends PrinterSecond {
        public void Print(String value) {

            System.out.println(ANSI_YELLOW + value + ANSI_RESET);
        }
    }

    static class Printing_BLUE extends PrinterSecond {
        public void Print(String value) {

            System.out.println(ANSI_BLUE + value + ANSI_RESET);
        }
    }

    static class Printing_PURPLE extends PrinterSecond {
        public void Print(String value) {

            System.out.println(ANSI_PURPLE + value + ANSI_RESET);
        }
    }

    static class Printing_CYAN extends PrinterSecond {
        public void Print(String value) {

            System.out.println(ANSI_CYAN + value + ANSI_RESET);
        }
    }

    static class Printing_WHITE extends PrinterSecond {
        public void Print(String value) {

            System.out.println(ANSI_WHITE + value + ANSI_RESET);
        }

    }

    public static void main(String[] args) {

        System.out.println("Доступні кольори: Red | Blue | Green | Yellow | Black | Purple | Cyan | White");


        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        PrinterSecond Black = new Printing_BLACK();
        PrinterSecond Yellow = new Printing_YELLOW();
        PrinterSecond Blue = new Printing_BLUE();
        PrinterSecond Cyan = new Printing_CYAN();
        PrinterSecond Purple = new Printing_PURPLE();
        PrinterSecond Red = new Printing_RED();
        PrinterSecond Green = new Printing_GREEN();
        PrinterSecond White = new Printing_WHITE();

        switch (input) {

            case ("Red"):
                Red.Print("Red");
                break;
            case ("Blue"):
                Blue.Print("Blue");
                break;
            case ("Green"):
                Green.Print("Green");
                break;
            case ("Yellow"):
                Yellow.Print("Yellow");
                break;
            case ("Black"):
                Black.Print("Black color");
                break;
            case ("Purple"):
                Purple.Print("Purple");
                break;
            case ("Cyan"):
                Cyan.Print("Cyan");
                break;
            case ("White"):
                White.Print("White");
                break;
            default:
                System.out.println("it isn't a color !");
        }
    }
}
