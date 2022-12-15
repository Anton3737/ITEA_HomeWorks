package OOP.Leason8;

public class Car {

    double engineCapacity;

    int enginePower;

    int maxSpeed;

    int year;

    int doors;

    String brand;

    String model;

    String fuel;

    int price;

    public Car(double engineCapacity, int enginePower, int maxSpeed, int year, int doors, String brand, String model, String fuel, int price) {
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.doors = doors;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.price = price;
    }

    public static void main(String[] args) {


        Car car_Ferrari = new Car(3.2, 340, 327, 2002, 2, "Ferrari", "Modena", "gasoline", 25000);

        Car car_BMW = new Car(2.0, 190, 140, 1994, 4, "BMW", "320", "gasoline", 2400);

        Car Car_Mercedes = new Car(5.5, 400, 350, 2022, 4, "Mercedes", "G-Wagen AMG", "disel", 55000);

        Car Car_Nissan = new Car(0.9, 55, 110, 2005, 2, "Nissan", "Micra", "gasoline", 4000);

        Car Car_Tesla = new Car(0, 1000, 250, 2022, 4, "Tesla", "Model 3", "electryci", 22000);


        System.out.println("Об'єм двигуна: " + car_Ferrari.engineCapacity + "\n" + "Потужність двигуна: " + car_Ferrari.enginePower + "\n" + "Максимальна швидкість: " + car_Ferrari.maxSpeed + "\n" + "Рік випуску: " + car_Ferrari.year + "\n" + "Кількість дверей: " + car_Ferrari.doors + "\n" + "Бренд: " + car_Ferrari.brand + "\n" + "Модель: " + car_Ferrari.model + "\n" + "Паливо: " + car_Ferrari.fuel + "\n" + "Ціна: " + car_Ferrari.price + "\n\n");

        System.out.println("Об'єм двигуна: " + car_BMW.engineCapacity + "\n" + "Потужність двигуна: " + car_BMW.enginePower + "\n" + "Максимальна швидкість: " + car_BMW.maxSpeed + "\n" + "Рік випуску: " + car_BMW.year + "\n" + "Кількість дверей: " + car_BMW.doors + "\n" + "Бренд: " + car_BMW.brand + "\n" + "Модель: " + car_BMW.model + "\n" + "Паливо: " + car_BMW.fuel + "\n" + "Ціна: " + car_BMW.price + "\n\n");

        System.out.println("Об'єм двигуна: " + Car_Mercedes.engineCapacity + "\n" + "Потужність двигуна: " + Car_Mercedes.enginePower + "\n" + "Максимальна швидкість: " + Car_Mercedes.maxSpeed + "\n" + "Рік випуску: " + Car_Mercedes.year + "\n" + "Кількість дверей: " + Car_Mercedes.doors + "\n" + "Бренд: " + Car_Mercedes.brand + "\n" + "Модель: " + Car_Mercedes.model + "\n" + "Паливо: " + Car_Mercedes.fuel + "\n" + "Ціна: " + Car_Mercedes.price + "\n\n");

        System.out.println("Об'єм двигуна: " + Car_Nissan.engineCapacity + "\n" + "Потужність двигуна: " + Car_Nissan.enginePower + "\n" + "Максимальна швидкість: " + Car_Nissan.maxSpeed + "\n" + "Рік випуску: " + Car_Nissan.year + "\n" + "Кількість дверей: " + Car_Nissan.doors + "\n" + "Бренд: " + Car_Nissan.brand + "\n" + "Модель: " + Car_Nissan.model + "\n" + "Паливо: " + Car_Nissan.fuel + "\n" + "Ціна: " + Car_Nissan.price + "\n\n");

        System.out.println("Об'єм двигуна: " + Car_Tesla.engineCapacity + "\n" + "Потужність двигуна: " + Car_Tesla.enginePower + "\n" + "Максимальна швидкість: " + Car_Tesla.maxSpeed + "\n" + "Рік випуску: " + Car_Tesla.year + "\n" + "Кількість дверей: " + Car_Tesla.doors + "\n" + "Бренд: " + Car_Tesla.brand + "\n" + "Модель: " + Car_Tesla.model + "\n" + "Паливо: " + Car_Tesla.fuel + "\n" + "Ціна: " + Car_Tesla.price + "\n\n");

    }
}
