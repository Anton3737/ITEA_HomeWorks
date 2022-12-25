package OOPLeason10HomeWork.Task2;


public class Computer {

    String name;
    int RAM;
    int SSD;
    int inc;

    public Computer(String name, int RAM, int SSD, int inc) {
        this.name = name;
        this.RAM = RAM;
        this.SSD = SSD;
        this.inc = inc;
    }

    public static void main(String[] args) {


        Computer[] Computers = new Computer[5];

        Computers[0] = new Computer("Lenovo", 8, 256, 15);
        Computers[1] = new Computer("Apple", 16, 1024, 17);
        Computers[2] = new Computer("Dell", 4, 64, 14);
        Computers[3] = new Computer("IBM", 2, 64, 14);
        Computers[4] = new Computer("Huawei", 64, 1024, 13);


        for (Computer arrays : Computers
        ) {
            System.out.println("Виробник: "+ arrays.name + " | "+ "Оперативної пам'яті: " + arrays.RAM + "Гб." + " | "+ "Накопичувач: " + arrays.SSD + " | "+ "Дюймів: " + arrays.inc);
        }
    }

}
