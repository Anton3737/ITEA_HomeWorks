package OOP.Leason8;

public class Fruits {

    String color;

    String taste;

    String density;

    String genus;

    double average_weight;

    double price_per_kilogram;


    public Fruits(String color, String taste, String density, String genus, double average_weight, double price_per_kilogram) {
        this.color = color;
        this.taste = taste;
        this.density = density;
        this.genus = genus;
        this.average_weight = average_weight;
        this.price_per_kilogram = price_per_kilogram;
    }


    public static void main(String[] args) {

        Fruits fruits_lemon = new Fruits("Жовтий", "Кислий", "Твердий", "Цитрусові", 70.0, 35.76);

        Fruits fruits_pomerGranate = new Fruits("Червоний", "Кислий", "Ядристий", "Плакунові", 110.0, 55.90);

        Fruits fruits_apple = new Fruits("Червоний/Зелений", "Солодкий/Кислий", "Твердий", "Трояндові", 40.0, 11.20);

        Fruits fruits_melon = new Fruits("Жовтий", "Солодкий", "М'ягкий", "Гарбузові", 3.4, 17.80);

        Fruits fruits_pear = new Fruits("Червоний/Зелений", "Солодкий/Кислий", "Твердий", "Трояндові", 33.5, 44.80);

        System.out.println("Колір: " + fruits_lemon.color + "\n" + "Смак: " + fruits_lemon.taste + "\n" + "Щільність: " + fruits_lemon.density + "\n" + "Рід: " + fruits_lemon.genus + "\n" + "Середня вага: " + fruits_lemon.average_weight + "\n" + "Ціна за кілограм: " + fruits_lemon.price_per_kilogram + "\n\n");

        System.out.println("Колір: " + fruits_pomerGranate.color + "\n" + "Смак: " + fruits_pomerGranate.taste + "\n" + "Щільність: " + fruits_pomerGranate.density + "\n" + "Рід: " + fruits_pomerGranate.genus + "\n" + "Середня вага: " + fruits_pomerGranate.average_weight + "\n" + "Ціна за кілограм: " + fruits_pomerGranate.price_per_kilogram + "\n\n");

        System.out.println("Колір: " + fruits_apple.color + "\n" + "Смак: " + fruits_apple.taste + "\n" + "Щільність: " + fruits_apple.density + "\n" + "Рід: " + fruits_apple.genus + "\n" + "Середня вага: " + fruits_apple.average_weight + "\n" + "Ціна за кілограм: " + fruits_apple.price_per_kilogram + "\n\n");

        System.out.println("Колір: " + fruits_melon.color + "\n" + "Смак: " + fruits_melon.taste + "\n" + "Щільність: " + fruits_melon.density + "\n" + "Рід: " + fruits_melon.genus + "\n" + "Середня вага: " + fruits_melon.average_weight + "\n" + "Ціна за кілограм: " + fruits_melon.price_per_kilogram + "\n\n");

        System.out.println("Колір: " + fruits_pear.color + "\n" + "Смак: " + fruits_pear.taste + "\n" + "Щільність: " + fruits_pear.density + "\n" + "Рід: " + fruits_pear.genus + "\n" + "Середня вага: " + fruits_pear.average_weight + "\n" + "Ціна за кілограм: " + fruits_pear.price_per_kilogram + "\n\n");


    }

}
