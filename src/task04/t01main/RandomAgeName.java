package task04.t01main;

import java.util.Random;

public class RandomAgeName {

    private Random random = new Random();

    public int createRandomAge() {
        return random.nextInt(1, 29);
    }

    public String createRandomName() {
        char[] consonantLetters = {'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р',
                'с', 'т'};
        char[] vowelLetters = {'а', 'е', 'ё', 'и', 'о', 'у', 'я'};
        char[] name = new char[random.nextInt(2, 8)];
        for (int i = 0; i < name.length; i = i + 2) {
            name[i] = consonantLetters[random.nextInt(0, consonantLetters.length)];
        }
        for (int i = 1; i < name.length; i = i + 2) {
            name[i] = vowelLetters[random.nextInt(0, vowelLetters.length)];
        }
        name[0] = Character.toUpperCase(name[0]);
        return String.valueOf(name);
    }
}
