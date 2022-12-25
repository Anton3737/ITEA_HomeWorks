package OOP.LesInterface;

public class Van extends Car{

    @Override
    public void Vehicles() {
        System.out.println("Кількість коліс: 6");
    }

    @Override
    public void typeCuzov() {
        System.out.println("Тип кузову: Грузова");
    }

    @Override
    public void weight() {
        System.out.println("Вага автомобілю: 15000кг");
    }
}
