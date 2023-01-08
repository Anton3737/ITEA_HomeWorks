package Leason5;

public class Task7 {
    // Арифметична прогресія
    static void ArphProgresivWhile() {
        int startNumber = 1;
        int multiplier = 2;
        int quantity = 12;
        int Tmp = 0;

        while (Tmp <= quantity) {
            Tmp = startNumber + (quantity - 1) * multiplier;
            System.out.println(Tmp);
        }
    }

    public static void ArphProgresivDoWhile() {
        int startNumber = 1;
        int multiplier = 2;
        int quantity = 12;
        int Tmp = 0;
        do {
            Tmp = startNumber + (quantity - 1) * multiplier;
            System.out.println(Tmp);
        } while (Tmp <= quantity);
    }

    static void ArphProgresivFor() {
        int startNumber = 1;
        int multiplier = 2;
        int quantity = 12;

        for (var i = 0; i <= quantity; i++) {
            startNumber = startNumber + (quantity - 1) * multiplier;
            System.out.print(startNumber + " " + "з ітерація: " + i + " | ");
        }
    }

//Геометрична прогресія

    static void GeoProgresivWhile() {
        int startNumber = 1;
        int multiplier = 2;
        int quantity = 4000;

        while (startNumber <= quantity) {
            startNumber *= multiplier;
            System.out.print(startNumber + " | ");
        }
    }

    public static void GeoProgresivDoWhile() {
        int startNumber = 1;
        int multiplier = 2;
        int quantity = 4000;

        do {
            startNumber *= multiplier;
            System.out.print(startNumber + " | ");
        } while (startNumber <= quantity);
    }

    static void GeoProgresivFor() {
        int startNumber = 1;
        int multiplier = 2;
        int quantity = 12;

        for (var i = 0; i <= quantity - 1; i++) {
            startNumber *= multiplier;
            System.out.print(startNumber + " | ");
        }
    }


    public static void main(String[] args) {
        System.out.println("Арифметична прогресія:");

        ArphProgresivWhile();

        ArphProgresivDoWhile();

        ArphProgresivFor();

        System.out.println("\n");

        System.out.println("Геометрична прогресія:");


        GeoProgresivFor();

        System.out.println("\n");

        GeoProgresivWhile();

        System.out.println("\n");

        GeoProgresivDoWhile();


    }
}


