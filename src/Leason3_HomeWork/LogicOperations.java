package Leason3_HomeWork;

public class LogicOperations {
    public static void main(String[] args) {

        int x = 5, y = 10, z = 15;

        x += y >> x++ * z;    // 5
        z = ++x & y * 5;      // 2
        y /= x + 5 | z;       // 0
        z = x++ & y * 5;      // 0
        x = y << x++ ^ z;     //335

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
