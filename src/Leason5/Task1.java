package Leason5;

public class Task1 {
    public static void main(String[] args) {

        // ініціалізація Інтового масиву та його вивід через Foreach
        int[] intArray = new int[10];

        intArray[0] = 111;
        intArray[1] = 222;
        intArray[2] = 333;
        intArray[3] = 444;
        intArray[4] = 555;
        intArray[5] = 666;
        intArray[6] = 777;
        intArray[7] = 888;
        intArray[8] = 999;
        intArray[9] = 1000;

        System.out.println("Масив intArray має : " + intArray.length + " елементів масиву зі значеннями :");
        for (int tmpIntArray : intArray) {
            System.out.println("intArray: " + tmpIntArray);
        }
        System.out.println("-------------------------------------------------------------------------------");


        // ініціалізація Байтового масиву та його вивід через Foreach
        byte[] byteArray = new byte[10];

        byteArray[0] = -128;
        byteArray[1] = -100;
        byteArray[2] = -70;
        byteArray[3] = -30;
        byteArray[4] = -10;
        byteArray[5] = 0;
        byteArray[6] = 40;
        byteArray[7] = 70;
        byteArray[8] = 90;
        byteArray[9] = 127;

        System.out.println("Масив byteArray має : " + byteArray.length + " елементів масиву зі значеннями :");
        for (byte tmpbyteArray : byteArray) {
            System.out.println("byteArray: " + tmpbyteArray);
        }
        System.out.println("-------------------------------------------------------------------------------");


        // ініціалізація масиву з типами даних Short та його вивід через Foreach
        short[] shortArray = new short[10];

        shortArray[0] = -32768;
        shortArray[1] = -15000;
        shortArray[2] = -5345;
        shortArray[3] = -2345;
        shortArray[4] = 0;
        shortArray[5] = 1234;
        shortArray[6] = 3563;
        shortArray[7] = 19000;
        shortArray[8] = 21678;
        shortArray[9] = 32767;
        System.out.println("Масив shortArray має : " + shortArray.length + " елементів масиву зі значеннями :");
        for (short tmpshortArray : shortArray) {
            System.out.println("shortArray: " + tmpshortArray);
        }
        System.out.println("-------------------------------------------------------------------------------");


        // ініціалізація масиву з типами даних Long та його вивід через Foreach
        long[] longArray = new long[10];
        longArray[0] = -9223372036854775808L;
        longArray[1] = -6223372036854775808L;
        longArray[2] = -1223372036854775808L;
        longArray[3] = -1223300000000000000L;
        longArray[4] = 00000000000000000001L;
        longArray[5] = 100000000000000000L;
        longArray[6] = 1223372036854775807L;
        longArray[7] = 6223372036854775807L;
        longArray[8] = 8223372036854775807L;
        longArray[9] = 9223372036854775807L;

        System.out.println("Масив longArray має : " + longArray.length + " елементів масиву зі значеннями :");
        for (long tmplongArray : longArray) {
            System.out.println("longArray: " + tmplongArray);
        }
        System.out.println("-------------------------------------------------------------------------------");


        // ініціалізація масиву з типами даних double та його вивід через Foreach
        double[] doubleArray = new double[10];
        doubleArray[0] = 1.123456789;
        doubleArray[1] = 2.123456789;
        doubleArray[2] = 3.123456789;
        doubleArray[3] = 4.123456789;
        doubleArray[4] = 5.123456789;
        doubleArray[5] = 6.123456789;
        doubleArray[6] = 7.123456789;
        doubleArray[7] = 8.123456789;
        doubleArray[8] = 9.123456789;
        doubleArray[9] = 10.123456789;
        System.out.println("Масив doubleArray має : " + doubleArray.length + " елементів масиву зі значеннями :");
        for (double tmpdoubleArray : doubleArray) {
            System.out.println("longArray: " + tmpdoubleArray);
        }
        System.out.println("-------------------------------------------------------------------------------");


        // ініціалізація масиву з типами даних float та його вивід через Foreach
        float[] floatArray = new float[10];

        floatArray[0] = 1.1111111F;
        floatArray[1] = 2.2222222F;
        floatArray[2] = 3.3333333F;
        floatArray[3] = 4.4444444F;
        floatArray[4] = 5.5555555F;
        floatArray[5] = 6.6666666F;
        floatArray[6] = 7.7777777F;
        floatArray[7] = 8.8888888F;
        floatArray[8] = 9.9999999F;
        floatArray[9] = 10.123456789F;
        System.out.println("Масив floatArray має : " + floatArray.length + " елементів масиву зі значеннями :");
        for (float tmpfloatArray : floatArray) {
            System.out.println(tmpfloatArray);
        }
        System.out.println("-------------------------------------------------------------------------------");


        // ініціалізація масиву з типами даних char та його вивід через Foreach
        char[] charArray = new char[12];

        charArray[0] = 'H';
        charArray[1] = 'a';
        charArray[2] = 'l';
        charArray[3] = 'l';
        charArray[4] = 'o';
        charArray[5] = ' ';
        charArray[6] = 'W';
        charArray[7] = 'o';
        charArray[8] = 'r';
        charArray[9] = 'l';
        charArray[10] = 'd';
        charArray[11] = '!';
        System.out.println("Масив charArray має : " + charArray.length + " елементів масиву зі значеннями :");
        for (char tmpcharArray : charArray) {
            System.out.print(tmpcharArray);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");


        // ініціалізація масиву з типами даних String та його вивід через Foreach
        String[] stringArray = new String[10];

        stringArray[0] = "Індекс 0";
        stringArray[1] = "Індекс 1";
        stringArray[2] = "Індекс 2";
        stringArray[3] = "Індекс 3";
        stringArray[4] = "Індекс 4";
        stringArray[5] = "Індекс 5";
        stringArray[6] = "Індекс 6";
        stringArray[7] = "Індекс 7";
        stringArray[8] = "Індекс 8";
        stringArray[9] = "Індекс 9";

        System.out.println("Масив stringArray має : " + stringArray.length + " елементів масиву зі значеннями :");
        for (String tmpstringArray : stringArray) {
            System.out.println(tmpstringArray);
        }
        System.out.println("-------------------------------------------------------------------------------");


        // ініціалізація масиву з типами даних boolean та його вивід через Foreach
        boolean[] booleanArray = new boolean[10];
        booleanArray[0] = true;
        booleanArray[1] = false;
        booleanArray[2] = true;
        booleanArray[3] = false;
        booleanArray[4] = true;
        booleanArray[5] = false;
        booleanArray[6] = true;
        booleanArray[7] = false;
        booleanArray[8] = true;
        booleanArray[9] = false;

        System.out.println("Масив booleanArray має : " + booleanArray.length + " елементів масиву зі значеннями :");
        for (boolean tmpbooleanArray : booleanArray) {
            System.out.println(tmpbooleanArray);
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}

