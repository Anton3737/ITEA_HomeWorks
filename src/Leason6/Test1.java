package Leason6;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {



        int [] array = new int[11];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        array[10] = 11;

        System.out.println(array.length);
        System.out.println(array[1]);
        System.out.println(Arrays.stream(array).sum());
        System.out.println(Arrays.stream(array).average());
        System.out.println(Arrays.stream(array).min());
        System.out.println(Arrays.stream(array).max());


    }
}