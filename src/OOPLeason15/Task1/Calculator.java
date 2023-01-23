package OOPLeason15.Task1;

import java.util.Scanner;

public class Calculator implements Addition, Multiple, Division, Subtraction {

    @Override
    public void Add(double A, double B) {
        double ResAdd = A + B;
        System.out.println(ResAdd);
    }

    @Override
    public void Div(double A, double B) {
        double ResDiv = A / B;
        System.out.println(ResDiv);
    }

    @Override
    public void Mul(double A, double B) {
        double ResMul = A * B;
        System.out.println(ResMul);
    }

    @Override
    public void Sub(double A, double B) {
        double ResSub = A - B;
        System.out.println(ResSub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        String symbol = sc.next();
        double B = sc.nextDouble();

        Calculator calculator = new Calculator();

        switch (symbol){
            case "+":
                calculator.Add(A,B);
                break;
            case "-":
                calculator.Sub(A,B);
                break;
            case "*":
                calculator.Mul(A,B);
                break;
            case "/":
                    calculator.Div(A,B);
                break;
            default:
                System.out.println("Такої математичної операції не додано в дану програму,спробуйте з (+ - * /)!");

        }
    }
}
