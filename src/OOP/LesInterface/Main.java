package OOP.LesInterface;

public class Main {

    public static void main(String[] args) {

        Van van = new Van();
        van.weight();
        van.typeCuzov();
        van.Vehicles();

        System.out.println();

        Universal universal = new Universal();
        universal.weight();
        universal.typeCuzov();
        universal.Vehicles();

        System.out.println();

        Sedan Sedan = new Sedan();
        Sedan.weight();
        Sedan.typeCuzov();
        Sedan.Vehicles();


    }


}
