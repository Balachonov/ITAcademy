package test;

import java.util.ArrayList;
import java.util.Random;

public class Runner {
    static Random random = new Random();
    public static void main(String[] args) {

        int i = printRandom();


        System.out.println(i);

    }
ArrayList
    public static int printRandom(){

        return ((random.nextInt(2) == 0) ? 2 : 4);
    }
}
