package Test;

public class TryTest {
    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println("world");
            System.out.println(8 / 0);
            System.out.println("Hi");

        } catch(Exception e){
            System.out.println("Devision by zero it's an Error ");
            System.err.println("Вай ме ");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
