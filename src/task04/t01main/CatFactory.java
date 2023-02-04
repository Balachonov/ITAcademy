package task04.t01main;

public class CatFactory {
    private RandomAgeName randomAgeName = new RandomAgeName();

    public void doFirstCycle() {
        int counter = 0;
        while (counter < 10) {
            Cat cat = new Cat();
            System.out.println(cat);
            counter++;
        }
        System.out.println("Первый цикл окончен.");
        System.out.println();
    }

    private void createCatToSetter() {
        Cat cat = new Cat();
        cat.setAge(randomAgeName.createRandomAge());
        cat.setName(randomAgeName.createRandomName());
        System.out.println(cat);
    }

    public void doSecondCycle() {
        for (int i = 0; i < 10; i++) {
            createCatToSetter();
        }
        System.out.println("Второй цикл окончен.");
        System.out.println();
    }

    private void createCatToConstructor() {
        Cat cat = new Cat(randomAgeName.createRandomName(), randomAgeName.createRandomAge());
        System.out.println(cat);
    }

    public void doThirdCycle() {
        int counter = 0;
        do {
            createCatToConstructor();
            counter++;
        } while (counter < 10);
        System.out.println("Третий цикл окончен.");
        System.out.println();
    }

    public void doFourCycle() {
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(randomAgeName.createRandomName(), randomAgeName.createRandomAge());
        }
        for (Cat cat :
                cats)
            System.out.println(cat.toString());
        System.out.println("Четвертый цикл окончен.");
    }
}

