package Leason19;

import java.util.StringTokenizer;

public class Test1 {
    public static void main(String[] args) {


        StringTokenizer stringTokenizer = new StringTokenizer("new|wen|ewn|", "|", true);
            while (stringTokenizer.hasMoreTokens()){
                System.out.println(stringTokenizer.nextToken());
            }





    }
}
