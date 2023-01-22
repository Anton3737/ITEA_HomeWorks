package OOPLeason12_13.Task1;

public class Main {

    public static void main(String[] args) {

        Cow Milka = new Cow();

        Horse Pony = new Horse();

        Lion Simba = new Lion();

        Raccoon Rocket = new Raccoon();

        System.out.println("Конкретна корівка з класу Cow що успдкувала абстрактні методи з абстрактного класу Animal:");
        Milka.Voice();
        Milka.Food();
        Milka.Kind();
        Milka.Breed();
        Milka.HaveTail();
        Milka.HaveTeeth();
        Milka.NumberOfPaws();
        Milka.FriendshipToPeople();
        Milka.Blood();
        Milka.NeedHuman();
        Milka.HaveChild();
        Milka.DangerousForChildren();

        System.out.println("---------------------------------------");

        System.out.println("Конкретний коник з класу Hors що успдкував абстрактні методи з абстрактного класу Animal:");
        Pony.Voice();
        Pony.Food();
        Pony.Kind();
        Pony.Breed();
        Pony.HaveTail();
        Pony.HaveTeeth();
        Pony.NumberOfPaws();
        Pony.FriendshipToPeople();
        Pony.Blood();
        Pony.NeedHuman();
        Pony.HaveChild();
        Pony.DangerousForChildren();

        System.out.println("---------------------------------------");

        System.out.println("Конкретний Лев з класу Lion що успдкував абстрактні методи з абстрактного класу Animal:");
        Simba.Voice();
        Simba.Food();
        Simba.Kind();
        Simba.Breed();
        Simba.HaveTail();
        Simba.HaveTeeth();
        Simba.NumberOfPaws();
        Simba.FriendshipToPeople();
        Simba.Blood();
        Simba.NeedHuman();
        Simba.HaveChild();
        Simba.DangerousForChildren();

        System.out.println("---------------------------------------");

        System.out.println("Конкретний Єнот з класу Raccoon що успдкував абстрактні методи з абстрактного класу Animal:");
        Rocket.Voice();
        Rocket.Food();
        Rocket.Kind();
        Rocket.Breed();
        Rocket.HaveTail();
        Rocket.HaveTeeth();
        Rocket.NumberOfPaws();
        Rocket.FriendshipToPeople();
        Rocket.Blood();
        Rocket.NeedHuman();
        Rocket.HaveChild();
        Rocket.DangerousForChildren();

    }
}
