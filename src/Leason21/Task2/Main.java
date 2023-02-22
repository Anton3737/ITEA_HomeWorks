package Leason21.Task2;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File PlaneFile = new File("/Users/macintosh/Desktop/JDBC/001JDBCandHib/ITEA_HomeWorks/src/Leason21/Task2/PlaneWrite.txt");

        Plane Boeing737 = new Plane(12, 4000, 300, 410, 5, 220, new Plane_type("Boeing", "Boeing company", "Пасажирський літак", "USA", "2 Турбовані двигуни"));

        Plane LockheadMartinSR71 = new Plane(6, 6000, 600, 3300, 2, 0, new Plane_type("Lockheed", "Lockheed company", "Розвідувальний літак", "USA", "2 Реактивні двигуни"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PlaneFile));

        oos.writeObject(Boeing737);
        oos.writeObject(LockheadMartinSR71);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PlaneFile));

        Plane NewBoeing737 = (Plane) ois.readObject();
        Plane NewLockheadMartinSR71 = (Plane) ois.readObject();

        ois.close();

        System.out.println("Кількість колес в шассі: " + NewBoeing737.wheels + "\n"
                + "Максимальний ешелон: " + NewBoeing737.max_height + "\n"
                + "Крейсерна швидкість: " + NewBoeing737.cruiser_speed + "\n"
                + "Максимальна швидкість: " + NewBoeing737.max_speed + "\n"
                + "Екіпаж борту: " + NewBoeing737.crew + "\n"
                + "Ємність салону" + NewBoeing737.passengers + "\n"
                + "Назва борту: " + NewBoeing737.plane_type.name + "\n"
                + "Виробник: " + NewBoeing737.plane_type.manufacture + "\n"
                + "Тип борту: " + NewBoeing737.plane_type.type + "\n"
                + "Країна походження: " + NewBoeing737.plane_type.country + "\n"
                + "Тип тягової установки: " + NewBoeing737.plane_type.engine_type);

        System.out.println("--------------------------------------------------");

        System.out.println("Кількість колес в шассі: " + NewLockheadMartinSR71.wheels + "\n"
                + "Максимальний ешелон: " + NewLockheadMartinSR71.max_height + "\n"
                + "Крейсерна швидкість: " + NewLockheadMartinSR71.cruiser_speed + "\n"
                + "Максимальна швидкість: " + NewLockheadMartinSR71.max_speed + "\n"
                + "Екіпаж борту: " + NewLockheadMartinSR71.crew + "\n"
                + "Ємність салону" + NewLockheadMartinSR71.passengers + "\n"
                + "Назва борту: " + NewLockheadMartinSR71.plane_type.name + "\n"
                + "Виробник: " + NewLockheadMartinSR71.plane_type.manufacture + "\n"
                + "Тип борту: " + NewLockheadMartinSR71.plane_type.type + "\n"
                + "Країна походження: " + NewLockheadMartinSR71.plane_type.country + "\n"
                + "Тип тягової установки: " + NewLockheadMartinSR71.plane_type.engine_type);
    }

}


