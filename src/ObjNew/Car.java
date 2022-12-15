package ObjNew;

public class Car {

    double weight;

    int speed;

    int price;


    public Car(double weight, int speed, int price) {
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public Car(double weight, int speed) {
        this.weight = weight;
        this.speed = speed;
    }


    public Car() {

    }


    public void Main1(){
        System.out.println("Hallo");
    }

    static void Main2(){
        System.out.println("World");
    }


    public static void main(String[] args) {


        Car Mercedes = new Car(0.20,200,12000);
        Car Volvo = new Car(0.300,190);
        Volvo.price = 20000;

        Car ZAZ = new Car();
        ZAZ.weight = 1.22;
        ZAZ.speed = 399;
        ZAZ.price = 1000000;


        System.out.println(Mercedes.weight+ " " + Mercedes.speed + " " + Mercedes.price);

        System.out.println(Volvo.weight+ " " + Volvo.speed + " " + Volvo.price);

        System.out.println(ZAZ.weight+ " " + ZAZ.speed + " " + ZAZ.price);


        Main2();

        Car car1 = new Car();

        car1.Main1();



    }


}
