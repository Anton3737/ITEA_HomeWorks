package ObjNew;

public class Fruits {

    String color;

    double weight;


    public static void main(String[] args) {

        Fruits apple = new Fruits();

        apple.color = "green";
        apple.weight = 0.30;

        Fruits pomerGranate = new Fruits();

        pomerGranate.color = "red";
        pomerGranate.weight = 0.40;


        System.out.println(apple.color + " " + apple.weight);
        System.out.println(pomerGranate.color + " " + pomerGranate.weight);

    }


}
