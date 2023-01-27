package OOPLeason15.Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTask3 {

    public static void main(String[] args) {

        ArrayList<Integer> DynamicArray = new ArrayList<Integer>();

        DynamicArray.add(4);
        DynamicArray.add(34);
        DynamicArray.add(6);
        DynamicArray.add(9);
        DynamicArray.add(320);
        DynamicArray.add(12);
        DynamicArray.add(7);
        DynamicArray.add(8);
        DynamicArray.add(100);
        DynamicArray.add(91);
        DynamicArray.add(51);

        // виїхідний список
        System.out.println(DynamicArray);

        // множимо першй і останній елемент
        int tmpMultiple = DynamicArray.get(0) * DynamicArray.get(10);

        // виводимо результат
        System.out.println(tmpMultiple);

        // Додаємо результат множення в список на перший індекс

        DynamicArray.add(0, tmpMultiple);

        // виводимо список
        System.out.println(DynamicArray);

        //Сортируємо список
        Collections.sort(DynamicArray);

        // виводимо результат
        System.out.println(DynamicArray);

        // Виводимо кількість елементів
        System.out.println(DynamicArray.size());

        // Видаляємо елементи списку масиву
        DynamicArray.removeAll(DynamicArray);

        // дивимось на результат
        System.out.println(DynamicArray);

        // Перевіряємо чи пустий список
        System.out.println(DynamicArray.isEmpty());

        DynamicArray.listIterator().hasPrevious();
    }
}


//1. Використовуючи Інтерфейсі, або абстракні класи, створіть калькулятор.
//        2. Обробіть декілька помилок задопомогою try
//        3. Створіть динамічний масив цілих чисел також:
//        додайте до нього 5-7 елементі
//        у змінній помножте перший індекс і останні, а цю змінно помістіть до першого індексу
//        відсортуйте цей массив