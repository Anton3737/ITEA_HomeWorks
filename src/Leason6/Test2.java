package Leason6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine()), k = 0;
        while (a != -1) {
            k += a;//the calculation of every cycle
            a = Integer.parseInt(r.readLine());
        }
        System.out.println(k - 1);//printing the sum all digits - 1
    }
}

