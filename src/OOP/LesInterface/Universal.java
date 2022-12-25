package OOP.LesInterface;

public class Universal extends Car{

    @Override
    public void Vehicles() {
        System.out.println("Кількість коліс: 4");
    }

    @Override
    public void typeCuzov() {
        System.out.println("Тип кузову: Універсал");
    }

    @Override
    public void weight() {
        System.out.println("Вага автомобілю: 3000кг");
    }
}
