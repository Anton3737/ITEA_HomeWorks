package Leason16;

import OOPLeason15.Task1.Addition;

import java.util.Scanner;


public class Calculator<GenericType> {

    public GenericType operand1;
    public GenericType operand2;


    public Calculator(GenericType operand1, GenericType operand2) {
        this.operand1 = operand1;

        this.operand2 = operand2;
    }

    public Calculator() {
    }

    public GenericType Addition(GenericType operand1, GenericType operand2) {

        if (operand1.getClass().equals(Integer.class)) {
            return (GenericType) (Object) ((Integer) operand1 + (Integer) operand2);
        }

        if (operand1.getClass().equals(Double.class)) {
            return (GenericType) (Object) ((Double) operand1 + (Double) operand2);
        }
        System.out.println();
        return (GenericType) (Object) 0;
    }

    public GenericType Substract(GenericType operand1, GenericType operand2) {
        if (operand1.getClass().equals(Integer.class)) {
            return (GenericType) (Object) ((Integer) operand1 - (Integer) operand2);
        }

        if (operand1.getClass().equals(Double.class)) {
            return (GenericType) (Object) ((Double) operand1 - (Double) operand2);
        }
        System.out.println();
        return (GenericType) (Object) 0;
    }

    public GenericType Multiple(GenericType operand1, GenericType operand2) {

        if (operand1.getClass().equals(Integer.class)) {
            return (GenericType) (Object) ((Integer) operand1 * (Integer) operand2);
        }

        if (operand1.getClass().equals(Double.class)) {
            return (GenericType) (Object) ((Double) operand1 * (Double) operand2);
        }
        System.out.println();
        return (GenericType) (Object) 0;
    }

    public GenericType Divide(GenericType operand1, GenericType operand2) {

        if (operand1.getClass().equals(Integer.class)) {
            return (GenericType) (Object) ((Integer) operand1 / (Integer) operand2);
        }

        if (operand1.getClass().equals(Double.class)) {
            return (GenericType) (Object) ((Double) operand1 / (Double) operand2);
        }
        System.out.println();
        return (GenericType) (Object) 0;
    }
}

//        УСПАДКОВУЮ КЛАС COLORS ДЛЯ МАЙБУТНЬОГО ВІЗУАЛЬНОГО РОЗПОДІЛЕННЯ

class Main extends Colors {

    public static void main(String[] args) {
//        ПОКИ ЩО ПРАЦЮЄ БЕЗ IF-ELSE

        Scanner sc = new Scanner(System.in);

//        System.out.println("**************************");
//        System.out.println("Введіть 1й операнд: ");
//        int OperandFirstInteger = sc.nextInt();
//        System.out.println("Введіть 2й операнд: ");
//        int OperandSecondInteger = sc.nextInt();

//        Calculator<Integer> IntegerCalculate = new Calculator<>(OperandFirstInteger, OperandSecondInteger);
//
//        System.out.println("Add int " + IntegerCalculate.Addition(IntegerCalculate.operand1, IntegerCalculate.operand2));
//        System.out.println("Sub int " + IntegerCalculate.Substract(IntegerCalculate.operand1, IntegerCalculate.operand2));
//        System.out.println("Div int " + IntegerCalculate.Divide(IntegerCalculate.operand1, IntegerCalculate.operand2));
//        System.out.println("Mul int " + IntegerCalculate.Multiple(IntegerCalculate.operand1, IntegerCalculate.operand2));
//
//        System.out.println("**************************");
//
//        System.out.println("Введіть 1й операнд: ");
//        double OperandFirstDouble = sc.nextDouble();
//        System.out.println("Введіть 2й операнд: ");
//        double OperandSecondDouble = sc.nextDouble();

//        Calculator<Double> DoubleCalculate = new Calculator<>(OperandFirstDouble, OperandSecondDouble);

//        System.out.println("Add double " + DoubleCalculate.Addition(DoubleCalculate.operand1, DoubleCalculate.operand2));
//        System.out.println("Sub double " + DoubleCalculate.Substract(DoubleCalculate.operand1, DoubleCalculate.operand2));
//        System.out.println("Div double " + DoubleCalculate.Divide(DoubleCalculate.operand1, DoubleCalculate.operand2));
//        System.out.println("Mul double " + DoubleCalculate.Multiple(DoubleCalculate.operand1, DoubleCalculate.operand2));

//        System.out.println("**************************");


//        ______________________________________________________________________________________________________________

//        IF-ELSE ПОБУДОВАНО АЛЕ НЕ РОЗУМІЮ ЯК ВИКОНАТИ РОЗДІЛЕННЯ ГІЛОК ПІД ЧАС ВНЕСЕННЯ ЦІЛОГО АБО ДРОБОВОГО ЧИСЛА
//        IntegerCalculate.operand1.getClass().equals(IntegerCalculate НЕ ДАЄ БАЖАНОГО РЕЗУЛЬТАТУ
//
        System.out.println("**************************");
        System.out.println("Введіть 1й операнд: ");
        if (sc.hasNextInt()) {
//            System.out.println("Введіть 1й операнд: ");
            int OperandFirst = sc.nextInt();
            System.out.println("Відпрацювала гілка Integer");
            System.out.println("**************************");
            System.out.println("Введіть оператор : ");
            String OperatorSymbol = sc.next();
            System.out.println("**************************");
            System.out.println("Введіть 2й операнд: ");
            int OperandSecond = sc.nextInt();

            Calculator<Integer> IntegerCalculate = new Calculator<>(OperandFirst, OperandSecond);

            switch (OperatorSymbol) {
                case "+":
                    System.out.println("Add int " + IntegerCalculate.Addition(OperandFirst, OperandSecond));
                    break;
                case "-":
                    System.out.println("Sub int " + IntegerCalculate.Substract(OperandFirst, OperandSecond));
                    break;
                case "*":
                    System.out.println("Mul int " + IntegerCalculate.Multiple(OperandFirst, OperandSecond));
                    break;
                case "/":
                    System.out.println("Div int " + IntegerCalculate.Divide(OperandFirst, OperandSecond));
                    break;
                default:
                    System.out.println("Ви ввели неіснуючий математичний оператор для розрахунку + - * / ");
                    break;
            }
        } else {
            double OperandFirst = sc.nextDouble();
            System.out.println("Відпрацювала гілка Double");
            System.out.println("**************************");
            System.out.println("Введіть оператор : ");
            String OperatorSymbol = sc.next();
            System.out.println("**************************");
            System.out.println("Введіть 2й операнд: ");
            double OperandSecond = sc.nextDouble();
            Calculator<Double> DoubleCalculate = new Calculator<>(OperandFirst, OperandSecond);

            switch (OperatorSymbol) {
                case "+":
                    System.out.println("Add double " + DoubleCalculate.Addition(OperandFirst, OperandSecond));
                    break;
                case "-":
                    System.out.println("Sub double " + DoubleCalculate.Substract(OperandFirst, OperandSecond));
                    break;
                case "*":
                    System.out.println("Mul double " + DoubleCalculate.Multiple(OperandFirst, OperandSecond));
                    break;
                case "/":
                    System.out.println("Div double " + DoubleCalculate.Divide(OperandFirst, OperandSecond));
                    break;
                default:
                    System.out.println("Ви ввели неіснуючий математичний оператор для розрахунку + - * / ");
                    break;
            }
        }
    }
}