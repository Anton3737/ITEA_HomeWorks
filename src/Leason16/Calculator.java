package Leason16;

import OOPLeason15.Task1.Addition;

import java.util.Scanner;

// Оголошуємо клас з "Замінником"
public class Calculator<GenericType> {

    // Оголошуємо поля з "Замінником"
    public GenericType operand1;
    public GenericType operand2;

    // Конструктор з параметрами

    public Calculator(GenericType operand1, GenericType operand2) {
        this.operand1 = operand1;

        this.operand2 = operand2;
    }

    // Порожні й за замовчуванням

    public Calculator() {
    }

    // Методи додавання / віднімання / множення / ділення

    public GenericType Addition(GenericType operand1, GenericType operand2) {

        // якщо першой операнд.витягуємо його клас Int порівнюємо його з класом обгорткою Integer і умова є вірною виконується перша гілка якщо ні то порівнюємо з Double
        // у випадку хибного Integer-у та Double-у повертаємо нуль.

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

// Створюємо основний клас що наслідує палітру
class Main extends Colors {

    // Старт програми
    public static void main(String[] args) {

        // Сканер для вводу даних
        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println(ANSI_YELLOW + "Введіть 1й операнд: " + ANSI_RESET);

        // Порівняння в умові if і якщо введене число є int відпрацьовуємо умову калькуляції по цілому числу
        // якщо умова false відпрацьовуємо Double.
        try {

            if (sc.hasNextInt()) {

                int OperandFirst = sc.nextInt();
                System.out.println(ANSI_BLUE + "Відпрацювала гілка Integer" + ANSI_RESET);
                System.out.println("**************************");
                System.out.println(ANSI_PURPLE + "Введіть оператор : " + ANSI_RESET);
                String OperatorSymbol = sc.next();
                System.out.println("**************************");
                System.out.println(ANSI_YELLOW + "Введіть 2й операнд: " + ANSI_RESET);
                int OperandSecond = sc.nextInt();

                // Створюємо об'єкт з класом обгорткою Integer та двома операндами.
                Calculator<Integer> IntegerCalculate = new Calculator<>(OperandFirst, OperandSecond);

                // Калькуляційна конструкція для відпрацювання методів при виборі оператору
                switch (OperatorSymbol) {
                    case "+":
                        System.out.println(ANSI_CYAN + "Add int " + IntegerCalculate.Addition(OperandFirst, OperandSecond) + ANSI_RESET);
                        break;
                    case "-":
                        System.out.println(ANSI_CYAN + "Sub int " + IntegerCalculate.Substract(OperandFirst, OperandSecond) + ANSI_RESET);
                        break;
                    case "*":
                        System.out.println(ANSI_CYAN + "Mul int " + IntegerCalculate.Multiple(OperandFirst, OperandSecond) + ANSI_RESET);
                        break;
                    case "/":
                        // Відпрацювання виключення при виникненні умови ділення на 0
                        try {
                            System.out.println(ANSI_CYAN + "Div int " + IntegerCalculate.Divide(OperandFirst, OperandSecond) + ANSI_RESET);
                        } catch (Exception exception) {
                            System.err.println("What are you doing dude ? Do you divide on Zero ?");
                        }
                        break;
                    default:
                        // умова при якій немає збігу з жодним з операторів
                        System.out.println(ANSI_RED + "Ви ввели неіснуючий математичний оператор для розрахунку + - * / " + ANSI_RESET);
                        break;
                }
            } else {
                double OperandFirst = sc.nextDouble();
                System.out.println(ANSI_BLUE + "Відпрацювала гілка Double" + ANSI_RESET);
                System.out.println("**************************");
                System.out.println(ANSI_PURPLE + "Введіть оператор : " + ANSI_RESET);
                String OperatorSymbol = sc.next();
                System.out.println("**************************");
                System.out.println(ANSI_YELLOW + "Введіть 2й операнд: " + ANSI_RESET);
                double OperandSecond = sc.nextDouble();
                Calculator<Double> DoubleCalculate = new Calculator<>(OperandFirst, OperandSecond);

                switch (OperatorSymbol) {
                    case "+":
                        System.out.println(ANSI_CYAN + "Add double " + DoubleCalculate.Addition(OperandFirst, OperandSecond) + ANSI_RESET);
                        break;
                    case "-":
                        System.out.println(ANSI_CYAN + "Sub double " + DoubleCalculate.Substract(OperandFirst, OperandSecond) + ANSI_RESET);
                        break;
                    case "*":
                        System.out.println(ANSI_CYAN + "Mul double " + DoubleCalculate.Multiple(OperandFirst, OperandSecond) + ANSI_RESET);
                        break;
                    case "/":
                        try {
                            System.out.println(ANSI_CYAN + "Div double " + DoubleCalculate.Divide(OperandFirst, OperandSecond) + ANSI_RESET);
                        } catch (Exception exception) {
                            System.err.println("What are you doing dude ? Do you divide on Zero ?");
                        }
                        break;
                    default:
                        System.out.println(ANSI_RED + "Ви ввели неіснуючий математичний оператор для розрахунку + - * / " + ANSI_RESET);
                        break;
                }
            }
        } catch (Exception exception) {
            System.err.println("!*!*!*!*!*!*!*!* ПОМИЛКА ВЕДЕННЯ ЧИСЛОВИХ ЗНАЧЕНЬ , ВВЕДЕНІ ДАНІ НЕ ЯВЛЯЮТЬСЯ ЧИСЛОВИМИ ДЛЯ ОБРАХУНКУ ОПЕРАЦІЙ ;!*!*!*!*!*!*!*!");
        }
    }
}

// 06/02/23

// ПРАЦЮЮЧИЙ АЛЕ НЕ СИСТЕМАТИЗОВАНИЙ КОД ЗАКОМЕНТОВАНО
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