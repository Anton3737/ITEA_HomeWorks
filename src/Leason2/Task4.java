package Leason2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Вводимо через сканер дані
        System.out.println("Введіть 5ти значне число: ");
        Scanner numbers = new Scanner(System.in);
        // ділимо введене число на окремі цифри
        int inputNumber = numbers.nextInt();
        while (inputNumber != 0) {
            int resault = inputNumber % 10;
            inputNumber /= 10;
            // вивід отриманого результату
            System.out.print(resault + " ");

        }




        System.out.println("Сумою чисел введених являється: " );

//
//
//            int[] arrays = new int[4];
//            for (int i = 0; i <= 4; i++) {
//                arrays[i] = numbers.nextInt();
//            }
//
//            System.out.println("Кількість введених чисер: " + arrays.length);
//
//
//


        }
    }

