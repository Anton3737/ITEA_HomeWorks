package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test1 {


    public static void main(String[] args) {


        ArrayList<String> Array = new ArrayList<String>();

        Array.add("Mazda");
        Array.add("Honda");
        Array.add("Mercedes");
        Array.add("Nissan");
        Array.add("BMW");


        System.out.println(Array.size());
        System.out.println(Array);
        System.out.println(Array.toString());
        System.out.println(Array.clone());

        System.out.println("---------------------------------");

        for (int i = 0; i < Array.size(); i++) {
            System.out.println(Array.get(i));
        }
        System.out.println(Array.size());

        Array.add("ZAZ");


        System.out.println("---------------------------------");

        for (String i : Array) {
            System.out.println(i);
        }

        System.out.println("---------------------------------");

        System.out.println(Array);
        System.out.println("---------------------------------");

        System.out.println(Array.get(2));

        Array.set(5,"Ferrari");
        System.out.println(Array);

        Array.set(1,"Arabic Car");


//        Array.remove(2);
//        System.out.println(Array);


        Collections.sort(Array);
        System.out.println(Array);
    }
}
