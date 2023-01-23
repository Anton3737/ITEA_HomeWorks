package Test16;

public class SomeClass<SomeGen, SomeGen1, SomeGen2, SomeGen3, SomeGen4> {

    public SomeGen wheels;
    public SomeGen1 doors;
    public SomeGen2 color;
    public SomeGen3 model;
    public SomeGen4 aaaaa;

    public SomeClass(SomeGen wheels, SomeGen1 doors, SomeGen2 color, SomeGen3 model , SomeGen4 aaaaa) {
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
        this.model = model;
        this.aaaaa = aaaaa;
    }
}

class Main {

    public static void main(String[] args) {

//        SomeClass<Integer, Integer, Integer, Integer> someClass = new SomeClass<>(4, 2, 1, 7);

//        SomeClass<String, String, String, String> someClass1 = new SomeClass<>("8", "4" , "Blue", "Kraz");

//        System.out.println(someClass.wheels +1 + " "+ someClass.doors+ 1+ " "+someClass.color+ 1 +" "+someClass.model + 12);


        SomeClass<Integer, Integer, Integer, Integer ,Integer> Obj1 = new SomeClass<>(4, 5, 6, 7, 1111);
        int d = Obj1.doors + 9;

        System.out.println(Obj1.wheels + " " + d + " " + Obj1.color + " " + Obj1.model + " "+ Obj1.aaaaa+9);
//        System.out.println(Obj1.wheels + 1 + " " + Obj1.doors + 1 + " " + Obj1.color + 1 + " " + Obj1.model + 1 );



    }


}
