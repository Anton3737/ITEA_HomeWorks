package Leason5;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Задані дані першого масиву з ім'ям arrayOne ");
        int[] arrayOne = new int[5];

        arrayOne[0] = 111;
        arrayOne[1] = 222;
        arrayOne[2] = 333;
        arrayOne[3] = 444;
//        arrayOne[4] = 555;
//        arrayOne[5] = 666;
//        arrayOne[6] = 777;
//        arrayOne[7] = 888;
//        arrayOne[8] = 999;
//        arrayOne[9] = 1111;

        System.out.println("Задані дані першого масиву з ім'ям arrayTwo ");
        int[] arrayTwo = new int[5];

        arrayTwo[0] = 95;
        arrayTwo[1] = 113;
        arrayTwo[2] = 72;
        arrayTwo[3] = 1;
        arrayTwo[4] = 98;
//        arrayTwo[5] = 339;
//        arrayTwo[6] = 221;
//        arrayTwo[7] = 522;
//        arrayTwo[8] = 32000;


        for (int tmp_arrayOne : arrayOne) {
            System.out.println(tmp_arrayOne);
        }

        System.out.println("--------------------------------------------------------------");

        for (int tmp_arrayTwo : arrayTwo) {
            System.out.println(tmp_arrayTwo);
        }

        System.out.println("--------------------------------------------------------------");

        System.out.println("Результати розрахунку в новому масиві з ім'ям resaultAdd");
        int[] resaultAdd = new int[5];

        for (int i = 0; i < resaultAdd.length; i++) {
            resaultAdd[i] = arrayOne[i] + arrayTwo[i];
            System.out.println("Результатом додавання елементу масиву " + arrayOne[i] + " до " + arrayTwo[i] + " є " + resaultAdd[i]);
        }
    }
}
