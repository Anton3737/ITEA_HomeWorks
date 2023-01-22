package OOPLeason12_13.Task1;

abstract class Animal {

    // абстрактні методи

    abstract void Voice();

    abstract void Food();

    abstract void Kind();

    abstract void Breed();

    abstract void HaveTail();

    abstract void HaveTeeth();

    abstract void NumberOfPaws();

    abstract void FriendshipToPeople();


    // Конкретні методи

    public void Blood(){
        System.out.println("Є теплокровною твариною");
    }

    public void NeedHuman(){
        System.out.println("Потребуде в постійному догляді від людини");
    }

    public void HaveChild(){
        System.out.println("Дає потомство");
    }

    public void DangerousForChildren(){
        System.out.println("Може причинити шкоду дитині");
    }

}
