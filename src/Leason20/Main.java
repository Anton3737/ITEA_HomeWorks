package Leason20;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fileSave = new File("/Users/macintosh/Desktop/JDBC/001JDBCandHib/ITEA_HomeWorks/src/TextSaveSeriasable.txt");
        TestResial newObject = new TestResial(4, "BMW", 300, 120, 2, new Sub_Details("roket", "Blue Neon", "Red"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileSave));
        oos.writeObject(newObject);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileSave));
        TestResial NewStream = (TestResial) ois.readObject();
        ois.close();
        System.out.println(NewStream.wheels + " " + NewStream.model + " " + NewStream.power + " " + NewStream.fuelTank + " " + NewStream.doors + " " + NewStream.details.spoiler + " " + NewStream.details.color+ " " + NewStream.details.neon);


    }
}
