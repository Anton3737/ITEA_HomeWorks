package OOPLeason12_13.Task1;

public class Horse extends Animal {
    @Override
    void Voice() {
        System.out.println("Регоче");
    }

    @Override
    void Food() {
        System.out.println("Їсть травичку");
    }

    @Override
    void Kind() {
        System.out.println("Ссавці");
    }

    @Override
    void Breed() {
        System.out.println("Американський верховий");
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
        System.out.println("Кінь дружній до людини");
    }
}
