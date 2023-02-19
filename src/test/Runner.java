package test;

import java.util.ArrayList;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Test> strings = new ArrayList<>();
        strings.add(new Test());
        strings.add(new Test());
        strings.add(new Test());
        strings.add(new Test());
        strings.add(new Test());
        strings.add(3, new Test());
        System.out.println(strings.get(5));

    }
}
