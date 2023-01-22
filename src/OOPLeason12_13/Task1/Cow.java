package OOPLeason12_13.Task1;

public class Cow extends Animal {

    @Override
    void Voice() {
        System.out.println("Корівка каже Мууууу");
    }

    @Override
    void Food() {
        System.out.println("Їсть травичку");
    }

    @Override
    void Kind() {
        System.out.println("Бик свійський");
    }

    @Override
    void Breed() {
        System.out.println("Мілка");
    }

    @Override
    void HaveTail() {
        System.out.println("Має хвіст");
    }

    @Override
    void HaveTeeth() {
        System.out.println("має зуби для пережовування рослинної їжі");
    }

    @Override
    void NumberOfPaws() {
        System.out.println("Має чотири ноги");
    }

    @Override
    void FriendshipToPeople() {
        System.out.println("Дружня для людей");
    }
}
