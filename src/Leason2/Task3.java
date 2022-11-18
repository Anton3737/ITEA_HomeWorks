package Leason2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Вводимо ПІБ та мову програмування
        System.out.println("Введіть свої дані: ");
        Scanner myData = new Scanner(System.in);
        System.out.println("Ваше прізвище: ");
        String lastName = myData.nextLine();
        System.out.println("Ваше імя: ");
        String firstName = myData.nextLine();
        System.out.println("По батькові: ");
        String secondName = myData.nextLine();
        System.out.println("Мова програмування що Вам подобається: ");
        String progLanguage = myData.nextLine();

        // Вивід введених даних першого етапу
        System.out.println("Ви ввели наступні дані: ");
        System.out.println(lastName + "\n" + firstName + "\n" + secondName + "\n" + progLanguage + "\n");

        // Конкатенація строки в одну змінну
        String fullName = (lastName + " " + firstName + " " + secondName);

        // другий етап введення Віку та Заробітної плати
        System.out.println("Введіть свій вік: ");
        byte age = myData.nextByte();
        System.out.println("Введіть бажану заробітню плату: ");
        double salary = myData.nextDouble();

        // Виведення результату
        System.out.print("Вас звати: " + fullName + "," + " мова програмування що Вам подобається: " + progLanguage + "," + " Вам " + age + " років " + "," + "та бажаєте отримувати: " + salary + "$");

    }
}
