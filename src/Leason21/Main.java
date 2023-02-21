package Leason21;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        File SaveFile = new File("/Users/macintosh/Desktop/JDBC/001JDBCandHib/ITEA_HomeWorks/src/Leason21/SaveFile.txt");

        Car ToyotaSupra = new Car(4, 2, "Coupe", "Toyota", "Supra", new Engine(6, 3200, 6000, 450, "Benzine"), new Special_modification("have carbon Spoiler", "Orange", "Gold chrome", "have red neon light", "Have turbo injector"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SaveFile));
        oos.writeObject(ToyotaSupra);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SaveFile));
        Car NewToyota = (Car) ois.readObject();

        System.out.println("Назва автомобілю: " + NewToyota.name + "\n" + NewToyota.model + "кількість дверей: " + NewToyota.doors + "\n" + "Тип кузову: " + NewToyota.body_type + "\n" + "Кількість колес у комплекті: " + NewToyota.wheels + "\n" +
                "Кількість циліндрів: " + NewToyota.engine.number_of_cylinders + "\n" + "Об'єм двигуна: " + NewToyota.engine.volume + "\n" + "Ньютон-метрів: " + NewToyota.engine.newton_meters + "\n" + "Кінських сил: " + NewToyota.engine.hp_power + "\n" + "Тип пального: " + NewToyota.engine.fuel + "\n" + "Аеродинаміка: " + NewToyota.modify.spoiler + "\n" + "Колір: " + NewToyota.modify.color + "\n" + "Неонова підсвітка: " + NewToyota.modify.neon + "\n" + "Збільшує потужність: " + NewToyota.modify.turbo + "\n" + "Шо по дискам: " + NewToyota.modify.wheels_disk);


    }


}
