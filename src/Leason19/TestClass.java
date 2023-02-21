package Leason19;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//
//        String name = sc.nextLine();
//
//        int age = sc.nextInt();
//
//        System.out.printf("Hi, I am %s, i was bord %d year", name, age);


        File file1 = new File("\\Users\\macintosh\\Desktop\\SoundTeka\\newfile");

        FileReader fileReader = new FileReader(file1);

        BufferedReader br = new BufferedReader(fileReader);

        String temp = null;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();

        FileWriter fileWriter = new FileWriter(file1, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("Hi");
        printWriter.println("Hello");

        br.close();
        printWriter.flush();
        printWriter.close();

    }


}
