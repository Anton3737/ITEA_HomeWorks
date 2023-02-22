package Leason21.Task1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        File SaveFile = new File("/Users/macintosh/Desktop/JDBC/001JDBCandHib/ITEA_HomeWorks/src/Leason21/Task1/SaveFile.txt");

        Car ToyotaSupra = new Car(4, 2, "Coupe", "Toyota", "Supra", new Engine(6, 3200, 6000, 450, "Benzine"), new Special_modification("have carbon Spoiler", "Orange", "Gold chrome", "have red neon light", "Have turbo injector"));

        Car MercedesBenzGWagen = new Car(4, 5, "SUV", "Mercedes-Benz", "G-Class", new Engine(12, 5500, 8000, 600, "Benzine"), new Special_modification("Don't have carbon Spoiler", "Black", "Black mate", "Don't have neon light", "Have turbo injector"));


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SaveFile));
        oos.writeObject(ToyotaSupra);
        oos.writeObject(MercedesBenzGWagen);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SaveFile));
        Car NewToyota = (Car) ois.readObject();
        Car NewMercedesBenzGWagen = (Car) ois.readObject();

        System.out.println("Назва автомобілю: " + NewToyota.name + "\n"
                + "Модель автомобілю: " + NewToyota.model + "\n"
                + "кількість дверей: " + NewToyota.doors + "\n"
                + "Тип кузову: " + NewToyota.body_type + "\n"
                + "Кількість колiс у комплекті: " + NewToyota.wheels + "\n"
                + "Кількість циліндрів: " + NewToyota.engine.number_of_cylinders + "\n"
                + "Об'єм двигуна: " + NewToyota.engine.volume + "\n"
                + "Ньютон-метрів: " + NewToyota.engine.newton_meters + "\n"
                + "Кінських сил: " + NewToyota.engine.hp_power + "\n"
                + "Тип пального: " + NewToyota.engine.fuel + "\n"
                + "Аеродинаміка: " + NewToyota.modify.spoiler + "\n"
                + "Колір: " + NewToyota.modify.color + "\n"
                + "Неонова підсвітка: " + NewToyota.modify.neon + "\n"
                + "Збільшує потужність: " + NewToyota.modify.turbo + "\n"
                + "Шо по дискам: " + NewToyota.modify.wheels_disk);

        System.out.println("---------------------------------------");

        System.out.println("Назва автомобілю: " + NewMercedesBenzGWagen.name + "\n"
                + "Модель автомобілю: " + NewMercedesBenzGWagen.model + "\n"
                + "кількість дверей: " + NewMercedesBenzGWagen.doors + "\n"
                + "Тип кузову: " + NewMercedesBenzGWagen.body_type + "\n"
                + "Кількість колiс у комплекті: " + NewMercedesBenzGWagen.wheels + "\n"
                + "Кількість циліндрів: " + NewMercedesBenzGWagen.engine.number_of_cylinders + "\n"
                + "Об'єм двигуна: " + NewMercedesBenzGWagen.engine.volume + "\n"
                + "Ньютон-метрів: " + NewMercedesBenzGWagen.engine.newton_meters + "\n"
                + "Кінських сил: " + NewMercedesBenzGWagen.engine.hp_power + "\n"
                + "Тип пального: " + NewMercedesBenzGWagen.engine.fuel + "\n"
                + "Аеродинаміка: " + NewMercedesBenzGWagen.modify.spoiler + "\n"
                + "Колір: " + NewMercedesBenzGWagen.modify.color + "\n"
                + "Неонова підсвітка: " + NewMercedesBenzGWagen.modify.neon + "\n"
                + "Збільшує потужність: " + NewMercedesBenzGWagen.modify.turbo + "\n"
                + "Шо по дискам: " + NewMercedesBenzGWagen.modify.wheels_disk);

    }


}
