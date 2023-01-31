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

//        УСПАДКОВУЮ КЛАС COLORS ДЛЯ МАЙБУТНЬОГО ВІЗУАЛЬНОГО РОЗПОДІЛЕННЯ 

class Main extends Colors {

    public static void main(String[] args) {
//        ПОКИ ЩО ПРАЦЮЄ БЕЗ IF-ELSE

        Scanner sc = new Scanner(System.in);
        System.out.println("**************************");

        System.out.println("Введіть 1й операнд: ");
        int OperandFirstInteger = sc.nextInt();
        System.out.println("Введіть 2й операнд: ");
        int OperandSecondInteger = sc.nextInt();

        Calculator<Integer> IntegerCalculate = new Calculator<>();

        System.out.println("Add int " + IntegerCalculate.Addition(OperandFirstInteger, OperandSecondInteger));
        System.out.println("Sub int " + IntegerCalculate.Substract(OperandFirstInteger, OperandSecondInteger));
        System.out.println("Div int " + IntegerCalculate.Divide(OperandFirstInteger, OperandSecondInteger));
        System.out.println("Mul int " + IntegerCalculate.Multiple(OperandFirstInteger, OperandSecondInteger));

        System.out.println("**************************");

        Calculator<Double> DoubleCalculate = new Calculator<>();

        System.out.println("Введіть 1й операнд: ");
        double OperandFirstDouble = sc.nextDouble();
        System.out.println("Введіть 2й операнд: ");
        double OperandSecondDouble = sc.nextDouble();

        System.out.println("Add double " + DoubleCalculate.Addition(OperandFirstDouble, OperandSecondDouble));
        System.out.println("Sub double " + DoubleCalculate.Substract(OperandFirstDouble, OperandSecondDouble));
        System.out.println("Div double " + DoubleCalculate.Divide(OperandFirstDouble, OperandSecondDouble));
        System.out.println("Mul double " + DoubleCalculate.Multiple(OperandFirstDouble, OperandSecondDouble));

        System.out.println("**************************");
//        ______________________________________________________________________________________________________________

//        IF-ELSE ПОБУДОВАНО АЛЕ НЕ РОЗУМІЮ ЯК ВИКОНАТИ РОЗДІЛЕННЯ ГІЛОК ПІД ЧАС ВНЕСЕННЯ ЦІЛОГО АБО ДРОБОВОГО ЧИСЛА
//        IntegerCalculate.operand1.getClass().equals(IntegerCalculate НЕ ДАЄ БАЖАНОГО РЕЗУЛЬТАТУ

//        if (IntegerCalculate.operand1.getClass().equals(IntegerCalculate)) {
//            System.out.println("Введіть 1й операнд: ");
//            int OperandFirstInteger = sc.nextInt();
//            System.out.println("Введіть оператор : ");
//            String OperatorSymbol = sc.next();
//            System.out.println("Введіть 2й операнд: ");
//            int OperandSecondInteger = sc.nextInt();
//
//            switch (OperatorSymbol) {
//                case "+":
//                    System.out.println("Add int " + IntegerCalculate.Addition(OperandFirstInteger, OperandSecondInteger));
//                    break;
//                case "-":
//                    System.out.println("Sub int " + IntegerCalculate.Substract(OperandFirstInteger, OperandSecondInteger));
//                    break;
//                case "*":
//                    System.out.println("Mul int " + IntegerCalculate.Multiple(OperandFirstInteger, OperandSecondInteger));
//                    break;
//                case "/":
//                    System.out.println("Div int " + IntegerCalculate.Divide(OperandFirstInteger, OperandSecondInteger));
//                    break;
//                default:
//                    System.out.println("Ви ввели неіснуючий математичний оператор для розрахунку + - * / ");
//                    break;
//            }
//        } else {
//            System.out.println("Введіть 1й операнд: ");
//            double OperandFirstDouble = sc.nextDouble();
//            System.out.println("Введіть оператор : ");
//            String OperatorSymbol = sc.next();
//            System.out.println("Введіть 2й операнд: ");
//            double OperandSecondDouble = sc.nextDouble();
//
//            switch (OperatorSymbol) {
//                case "+":
//                    System.out.println("Add double " + DoubleCalculate.Addition(OperandFirstDouble, OperandSecondDouble));
//                    break;
//                case "-":
//                    System.out.println("Sub double" + DoubleCalculate.Substract(OperandFirstDouble, OperandSecondDouble));
//                    break;
//                case "*":
//                    System.out.println("Mul double" + DoubleCalculate.Multiple(OperandFirstDouble, OperandSecondDouble));
//                    break;
//                case "/":
//                    System.out.println("Div double" + DoubleCalculate.Divide(OperandFirstDouble, OperandSecondDouble));
//                    break;
//                default:
//                    System.out.println("Ви ввели неіснуючий математичний оператор для розрахунку + - * / ");
//                    break;
//            }
//        }
    }
}