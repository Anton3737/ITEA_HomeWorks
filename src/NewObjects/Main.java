package NewObjects;

public class Main {

    public static void main(String[] args) {

        car Ferrari = new car("Scuderia" ,300, 2002, 200 );

        Ferrari.setModel("Scuderia GT");
        Ferrari.setMaxSpeed(340);
        Ferrari.setYear(2022);
        Ferrari.setSpeed(290);

        System.out.println(Ferrari.getModel() +" "+ Ferrari.getMaxSpeed()+" "+ Ferrari.getYear()+" "+Ferrari.getSpeed());
    }

}
