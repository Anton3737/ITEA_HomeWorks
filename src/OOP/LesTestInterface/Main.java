package OOP.LesTestInterface;

public class Main implements Add,Dev,Div,Mul{


    @Override
    public void MetAdd() {
        System.out.println(2+2);
    }

    @Override
    public  void MetDiv() {
        System.out.println(2/8);
    }

    @Override
    public void MetMul() {
        System.out.println(3*3);
    }

    @Override
    public void MetDev() {
        System.out.println(6-2);
    }

    public static void main(String[] args) {

        Main add = new Main();
        add.MetAdd();







    }

}
