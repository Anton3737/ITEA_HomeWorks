package Leason14;

public enum Animals {

    LION(12),
    DOG(3),
    CAT(5),
    RHINO(21),
    PIG(1),
    HORSE(4),
    DEER(9),
    ZEBRA(10),
    ELEPHANT(20),
    GIRAFFE(15);

    final int Age;

    Animals(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Animal: " + super.toString() + "," + " Age:" + Age;
    }

    public static void main(String[] args) {
        Animals LION = Animals.LION;
        System.out.println(LION);

        Animals DOG = Animals.DOG;
        System.out.println(DOG);

        Animals CAT = Animals.CAT;
        System.out.println(CAT);

        Animals RHINO = Animals.RHINO;
        System.out.println(RHINO);

        Animals PIG = Animals.PIG;
        System.out.println(PIG);

        Animals HORSE = Animals.HORSE;
        System.out.println(HORSE);

        Animals DEER = Animals.DEER;
        System.out.println(DEER);

        Animals ZEBRA = Animals.ZEBRA;
        System.out.println(ZEBRA);

        Animals ELEPHANT = Animals.ELEPHANT;
        System.out.println(ELEPHANT);

        Animals GIRAFFE = Animals.GIRAFFE;
        System.out.println(GIRAFFE);
    }
}


//
//    Створіть проект за допомогою IntelliJ IDEA. Створіть перерахунковий тип (enum) Animals,
//        що містить конструктор, який повинен набувати цілого числа (вік тварини),
//        і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.
