package Leason17;

import java.util.*;

public class ListIterator {

    public static void main(String[] args) {
        int tmpI = 1;

        System.out.println("Відпрацювання через цикл For");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ArrIntList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int tmp = sc.nextInt();
            ArrIntList.add(tmp);
            System.out.println(ArrIntList + " {" + tmpI++ + "}");
        }
        System.out.println("Результат остаточно " + ArrIntList);
        System.out.println(ArrIntList.size() + " Кількість елементів");

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Сортування через інтерфейс Ітератор \n");

        System.out.println("Цикл while та інтерфейс Iterator відпрацьовує наш список ArrIntList");
        Iterator<Integer> integerIterator = ArrIntList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
        System.out.println("Відпрацювання ітератору завершено\n");

        System.out.println("Cтворюємо колекцію за допомогою інтерфейсу Collection<Generic> name = new ArrayList<>(); - конструктор списку");

        Collection<Integer> lising1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int tmp1 = sc.nextInt();
            lising1.add(tmp1);
            System.out.println(lising1 + " {" + tmpI++ + "}");
        }
        System.out.println("Результат після 5ти ітерацій" + lising1);

        System.out.println("Кількість елементів" + lising1.size());

        System.out.println("---------------------------------------------------------------------------\n");

        System.out.println("Додаємо ArrIntList - що приймає значення в кількості 5 од. з конструктором = new ArrayList<>(); " +
                "до нового lising1 ");

        lising1.addAll(ArrIntList);
        System.out.println("Результатом lising1  + Кількість елементів= " + lising1 + " " + lising1.size());

        System.out.println("---------------------------------------------------------------------------\n");

        System.out.println("Масив об'єктів виводимо на всю його довжину " + lising1.size());

        Object[] arr = lising1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Кількість елементів масиву виводимо за допомогою методу .length =(" + arr.length + ")\n");
        System.out.println("Сортуємо");
        Arrays.sort(arr);

        for (Object arraysObj : arr) {
            System.out.println(arraysObj);
        }


    }


}
