package Leason17;

import java.util.*;

public class ListIterator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ArrIntList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int tmp = sc.nextInt();
            ArrIntList.add(tmp);
            System.out.println(ArrIntList);
        }
        System.out.println(ArrIntList);
        System.out.println(ArrIntList.size() + " Кількість елементів");

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Сортування через інтерфейс Ітератор ");
        Iterator<Integer> integerIterator = ArrIntList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());

        }


        Collection<Integer> lising1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int tmp1 = sc.nextInt();
            lising1.add(tmp1);
            System.out.println(lising1);
        }
        System.out.println(lising1);

        System.out.println(lising1.size());

        lising1.addAll(ArrIntList);
        System.out.println(lising1 + " " + lising1.size());

        System.out.println("---------------------------------------------------------------------------");


        Object[] arr = lising1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("масив " + arr.length);
    }


}
