package Leason6;

public class Task3 {


    public static void main(String[] args) {

        double[] array = new double[3];
        array[0] = MyMethood(1, 2, 3);
        array[1] = MyMethood(1, 2, 3, 4);
        array[2] = MyMethood(1, 2, 3, 4, 5);


        System.out.println("Результатом середнього значення \nз перевантажених методів із 3х / 4х / 5х чисел: ");
        for (double resaultArray : array) {
            System.out.println(resaultArray);
        }

        System.out.println("---------------------------------");

        System.out.println("Максимальне значення");
        double MAX = array[0];
        for (int i = 0; i < array.length; i++) {
            MAX = Math.max(MAX, array[i]);
        }
        System.out.println(MAX);

        System.out.println("---------------------------------");

        System.out.println("Мінімальне значення");
        double MIN = array[0];
        for (int i = 0; i < array.length; i++) {
            MIN = Math.min(MIN, array[i]);
        }
        System.out.println(MIN);

        System.out.println("---------------------------------");

        System.out.println("Середнє значення: ");
        double averageVar = (array[0] + array[1] + array[2]) / 3;

        System.out.println(averageVar);

    }

    public static double MyMethood(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static double MyMethood(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }

    public static double MyMethood(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

}
