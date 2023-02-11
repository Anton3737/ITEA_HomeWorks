package Leason17;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorAndComparable implements Comparator, Comparable {

    private int id;
    private int Max_speed;
    private int Max_power_Engene;
    private String TypeBody;
    private String NameCar;
    private String ModelCar;
    private double Price;

    public ComparatorAndComparable(int id, int max_speed, int max_power_Engene, String typeBody, String nameCar, String modelCar, double Price) {
        this.id = id;
        this.Max_speed = max_speed;
        this.Max_power_Engene = max_power_Engene;
        this.TypeBody = typeBody;
        this.NameCar = nameCar;
        this.ModelCar = modelCar;
        this.Price = Price;
    }

    public int getId() {
        return id;
    }

    public int getMax_speed() {
        return Max_speed;
    }

    public int getMax_power_Engene() {
        return Max_power_Engene;
    }

    public String getTypeBody() {
        return TypeBody;
    }

    public String getNameCar() {
        return NameCar;
    }

    public String getModelCar() {
        return ModelCar;
    }

    public double getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return id + " " + TypeBody + " " + NameCar + " " + ModelCar + " " + Max_power_Engene + " Hp " + Max_speed + " Km/h " + Price + " $";
    }

    @Override
    public int compareTo(Object o) {
        if (this.id > ((ComparatorAndComparable) o).id) {
            return 1;
        } else if (this.id < ((ComparatorAndComparable) o).id) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object o1, Object o2) {
        Integer id = ((ComparatorAndComparable) o1).getId();
        Integer id1 = ((ComparatorAndComparable) o2).getId();
        return id.compareTo(id1);
    }

    public static void main(String[] args) {

        ComparatorAndComparable[] Array_ComparatorAndComparable = {
                new ComparatorAndComparable(1, 320, 400, "Coup", "BMW", "650", 68888.2),
                new ComparatorAndComparable(5, 120, 150, "Cabriolet", "Mercedes", "SL500", 33139.55),
                new ComparatorAndComparable(12, 195, 360, "Sedan", "BMW", "758", 52330.12),
                new ComparatorAndComparable(9, 235, 300, "Hatchback", "Mitsubishi", "Lancer RallyArt", 12124.55),
                new ComparatorAndComparable(123, 521, 1100, "Coup", "Bugatti", "110", 345000.99),
                new ComparatorAndComparable(91, 240, 210, "Coup", "BMW", "320", 15000.99),
                new ComparatorAndComparable(55, 155, 110, "Coup", "Zaz", "484", 500),
                new ComparatorAndComparable(71, 180, 155, "SUV", "Porsche", "Cayenne", 120000.10),
                new ComparatorAndComparable(8, 290, 310, "Sedan", "BMW", "650", 68888.2),
                new ComparatorAndComparable(332, 310, 415, "SUV", "Mercedes", "GWagen", 190000),
                new ComparatorAndComparable(22, 450, 750, "Sedan", "Subaru", "Impreza WRX STI ", 51200),
        };

        Arrays.sort(Array_ComparatorAndComparable);

        for (ComparatorAndComparable ArrayResault : Array_ComparatorAndComparable) {
            System.out.println(ArrayResault);
        }
    }
}
