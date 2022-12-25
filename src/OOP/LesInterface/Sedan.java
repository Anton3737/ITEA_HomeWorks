package OOP.LesInterface;

public class Sedan extends Car{

    @Override
    public void Vehicles() {
        System.out.println("Кількість коліс: 4");
    }

    @Override
    public void typeCuzov() {
        System.out.println("Тип кузову: Седан");
    }

    @Override
    public void weight() {
        System.out.println("Вага автомобілю: 2200кг");
    }
}
