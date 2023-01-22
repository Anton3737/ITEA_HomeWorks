package Test;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayTest {
    public static void main(String[] args) {

        ArrayList<Integer> IntArray = new ArrayList<>();

        ArrayList<String> StrArray = new ArrayList<>();

        IntArray.add(99);
        IntArray.add(62);
        IntArray.add(88);
        IntArray.add(77);
        IntArray.add(69);


//        StrArray.add(" Hi ");
//        StrArray.add(" i ");
//        StrArray.add(" am ");
//        StrArray.add(" Vasiliy ");
//
//        for (int i = 0; i < IntArray.size(); i++) {
//            System.out.println(IntArray.get(i));
//        }
//        System.out.println("----------------------------");
//
//        for (String str: StrArray) {
//            System.out.println(str);
//        }
//        System.out.println("----------------------------");
//
//
//        StrArray.ensureCapacity(10);
//
//        System.out.println(StrArray.indexOf(" Hi "));

        ListIterator<Integer> listIterator = IntArray.listIterator();

        while (listIterator.hasPrevious()){

        }

    }
}
