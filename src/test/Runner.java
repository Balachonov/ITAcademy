package test;

import java.util.ArrayList;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> strings = new ArrayList<>();
        strings.add(0);
        strings.add(13);
        strings.add(13);
        strings.add(12);
        strings.remove((Integer) 13);
        System.out.println(strings.get(1));

    }
}
