package OOPLeason11;

import java.util.Arrays;
import java.util.Scanner;

class DerivedClass  {

    class ThirdClass extends BaseClass {

        public static void main(String[] args) {

            System.out.println("----------------------max-------------------------");
            MessageMethodMax();
            MaxMethod();

            System.out.println("----------------------min-------------------------");
            MessageMethodMin();
            MinMethod();

            System.out.println("---------------------average----------------------");
            MessageMethodAverage();
            AverageMethod();
        }


    }
}
//
//        1. Створити клас, им"я класу будь яке. в класі створити три методи, наприклад (мин, макс, середнє)
//        Створіть другий клас у якому буде внутрішній клас. Внутрішній клас наслідує перший клас викликає три методи та передає параметри.