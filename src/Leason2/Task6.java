package Leason2;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        // діалогове вікно
        System.out.println("Будь-ласка введіть 3 числа:");
        // Для введення значень використовуємо сканер
        Scanner inputNumbers = new Scanner(System.in);

        // Створюємо список який будемо наповнювати нашими значеннями що ми ввели через сканер
        List<Integer> array = new ArrayList<>();
        // через цикл for ітеруючись від індекса 0 по індек 2 тобто 0 | 1 | 2 - вводячи 3 символи
        // та за рахунок 3х ітерацій з методом add ми добавляємо 3 значення в список
        for (int i = 0; i <= 2; i++) {
            array.add(inputNumbers.nextInt());
        }
        // виводимо розмір списку
        System.out.println("Сумарно введено чисел: " + array.size());
        // виводио середнє арифметичне 3х чисел
        System.out.println("Середнім арифметичним 3х введених чисел являється: " + (array.get(1) + array.get(1) + array.get(2)) / 3);
        // виводимо максимальне та мінімальне значенння списку
        System.out.println("Мінімальним значеннмя із введених чисел являється: " + Collections.min(array));
        System.out.println("Максимальним значеннмя із введених чисел являється: " + Collections.max(array));

    }
}
