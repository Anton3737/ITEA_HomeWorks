package Leason5;

import java.util.Scanner;

public class Task4 {

    public void PowInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число яке Ви хочете піднести до степеню: ");
        double inputNum = input.nextDouble();
        System.out.println("Введіть ступінь до якого віднести число: " + inputNum);
        int Pow = input.nextInt();
        System.out.println("Введене Вами число: " + inputNum + " що піднесене до степеню " + Pow + " складатиме: " + Math.pow(inputNum, Pow));
    }


    public static void main(String[] args) {
        Task4 PowInt = new Task4();
        PowInt.PowInt();
    }
}
