package Leason17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MyClassComparator implements Comparable {

    private int id;
    private String Student;

    private int year;


    public MyClassComparator(int id, String student, int year) {
        this.id = id;
        this.Student = student;
        this.year = year;
    }

    public MyClassComparator() {

    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getStudent() {
        return Student;
    }

    @Override
    public String toString() {
        return id + " " + Student + " " + year;
    }

    @Override
    public int compareTo(Object objName) {

        if (this.id > ((MyClassComparator) objName).id) {
            return 1;
        } else if (this.id < ((MyClassComparator) objName).id) {
            return -1;
        } else {
            return 0;
        }
    }


    class comparator1 implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Integer id = ((MyClassComparator) o1).getId();
            Integer id1 = ((MyClassComparator) o2).getId();
            return id.compareTo(id1);
        }
    }

}

class main {
    public static void main(String[] args) {

        MyClassComparator[] NameOfMassObj = {
                new MyClassComparator(123, "Georgy", 1999),
                new MyClassComparator(123, "Georgy", 1992),
                new MyClassComparator(145, "Maria", 890),
                new MyClassComparator(456, "Suzanna", 2052),
                new MyClassComparator(111, "Sergio", 1994),
                new MyClassComparator(234, "Nikolas", 1986),
                new MyClassComparator(32, "Luka", 2000),
        };

        Arrays.sort(NameOfMassObj );

        for (MyClassComparator myArrays : NameOfMassObj) {
            System.out.println(myArrays);
        }
    }
}