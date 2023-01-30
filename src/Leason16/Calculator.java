package Leason16;

import java.util.Scanner;


public class Calculator<T> {

    public T operand1;
    public T operand2;


    public Calculator(int operandInt1, int operandInt2) {
        this.operand1 = operand1;

        this.operand2 = operand2;
    }

    public Calculator() {
    }

    public T Addition(T operand1, T operand2) {


        if (operand1.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) operand1 + (Integer) operand2);
        }

        if (operand1.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) operand1 + (Double) operand2);
        }
        System.out.println();
        return (T) (Object) 0;
    }

    public T Substract(T operand1, T operand2) {
        if (operand1.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) operand1 - (Integer) operand2);
        }

        if (operand1.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) operand1 - (Double) operand2);
        }
        System.out.println();
        return (T) (Object) 0;
    }

    public T Multiple(T operand1, T operand2) {

        if (operand1.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) operand1 * (Integer) operand2);
        }

        if (operand1.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) operand1 * (Double) operand2);
        }
        System.out.println();
        return (T) (Object) 0;
    }

    public T Divide(T operand1, T operand2) {

        if (operand1.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) operand1 / (Integer) operand2);
        }

        if (operand1.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) operand1 / (Double) operand2);
        }
        System.out.println();
        return (T) (Object) 0;
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator<Integer> IntegerCalculate = new Calculator<>();

        Calculator<Double> DoubleCalculate = new Calculator<>();

        if (IntegerCalculate.operand1 instanceof Integer) {
            System.out.println("Введіть 1й операнд: ");
            int OperandInt1 = sc.nextInt();
            System.out.println("Віпрацювала гілка Integer ");

            System.out.println("Введіть оператор : ");
            String symbol = sc.next();

            System.out.println("Введіть 2й операнд: ");
            int OperandInt2 = sc.nextInt();

            switch (symbol) {
                case "+":
                    int ResAddInt = IntegerCalculate.Addition(OperandInt1, OperandInt2);
                    System.out.println(ResAddInt);
                    break;
                case "-":
                    int ResSubInt = IntegerCalculate.Substract(OperandInt1, OperandInt2);
                    System.out.println(ResSubInt);
                    break;
                case "*":
                    int ResMulInt = IntegerCalculate.Multiple(OperandInt1, OperandInt2);
                    System.out.println(ResMulInt);
                    break;
                case "/":
                    int ResDivInt = IntegerCalculate.Divide(OperandInt1, OperandInt2);
                    System.out.println(ResDivInt);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Введіть 1й операнд: ");
            double OperandDouble1 = sc.nextDouble();
            System.out.println("Віпрацювала гілка Double ");


            System.out.println("Введіть оператор : ");
            String symbol = sc.next();

            System.out.println("Введіть 2й операнд: ");
            double OperandDouble2 = sc.nextDouble();

            switch (symbol) {
                case "+":
                    double ResAddDouble = DoubleCalculate.Addition(OperandDouble1, OperandDouble2);
                    System.out.println(ResAddDouble);
                    break;
                case "-":
                    double ResSubDouble = DoubleCalculate.Substract(OperandDouble1, OperandDouble2);
                    System.out.println(ResSubDouble);
                    break;
                case "*":
                    double ResMulDouble = DoubleCalculate.Multiple(OperandDouble1, OperandDouble2);
                    System.out.println(ResMulDouble);
                    break;
                case "/":
                    double ResDivDouble = DoubleCalculate.Divide(OperandDouble1, OperandDouble2);
                    System.out.println(ResDivDouble);
                    break;
                default:
                    break;
            }
        }
    }
}