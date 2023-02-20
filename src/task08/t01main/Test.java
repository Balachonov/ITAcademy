package task08.t01main;

public class Test {
    public void test() {
        System.out.println("Тест");
        System.out.println("Создали, добавили 5 элементов (метод add() и конструктор MyArrayList())");
        MyArrayList<Integer> integersOne = new MyArrayList<>();
        integersOne.add(0);
        integersOne.add(1);
        integersOne.add(2);
        integersOne.add(3);
        integersOne.add(4);

        System.out.println("Проверяем isEmpty(). Выводим на экран (метод size() и get())");
        System.out.println(integersOne.isEmpty());
        for (int i = 0; i < integersOne.size(); i++) {
            System.out.print(integersOne.get(i) + " ");
        }

        System.out.println("\nПроверяем наличие элемента contains(Object value). Удаляеем его remove(Object value) и " +
                "удаляем другой элемент T remove (int index)");
        System.out.println(integersOne.contains(2));
        integersOne.remove((Integer) 2);
        for (int i = 0; i < integersOne.size(); i++) {
            System.out.print(integersOne.get(i) + " ");
        }

        System.out.println("\nСейчас удалим - " + integersOne.remove(2));
        for (int i = 0; i < integersOne.size(); i++) {
            System.out.print(integersOne.get(i) + " ");
        }

        System.out.println("\nСоздадим еще один, добавим 5 элементов (конструктор MyArrayList(int capacity))");
        MyArrayList<Integer> integersTwo = new MyArrayList<>(5);
        integersTwo.add(0, 5);
        integersTwo.add(1, 6);
        integersTwo.add(2, 7);
        integersTwo.add(3, 8);
        integersTwo.add(4, 9);
        for (int i = 0; i < integersTwo.size(); i++) {
            System.out.print(integersTwo.get(i) + " ");
        }

        System.out.println("\nОбъединим оба (addAll(MyList<? extends T> value))");
        integersOne.addAll(integersTwo);
        for (int i = 0; i < integersOne.size(); i++) {
            System.out.print(integersOne.get(i) + " ");
        }

        System.out.println("\nПроверяем метод T set(int index, T value)");
        integersOne.set(0, 2);
        integersOne.set(1, 3);
        for (int i = 0; i < integersOne.size(); i++) {
            System.out.print(integersOne.get(i) + " ");
        }

        System.out.println("\nПроверяем третий конструктор MyArrayList(MyList<? extends T> col)");
        MyArrayList<Integer> integersThree = new MyArrayList<>(integersOne);
        for (int i = 0; i < integersThree.size(); i++) {
            System.out.print(integersThree.get(i) + " ");
        }

        System.out.println("\nТест закончен \n\nНо в последний список добавим пару null");
        integersThree.add(2, null);
        integersThree.add(4, null);
        integersThree.add(6, null);
        for (int i = 0; i < integersThree.size(); i++) {
            System.out.print(integersThree.get(i) + " ");
        }

        System.out.println("\nТеперь удалим их специальным авторским методом removeAllNull(MyList<? extends T> col). " +
                "Зря что-ли я его делал?");
        integersThree.removeAllNull(integersThree);
        for (int i = 0; i < integersThree.size(); i++) {
            System.out.print(integersThree.get(i) + " ");
        }

        System.out.println("\nЗнаю про медод System.arraycopy(), но решил обойтись только циклами. Тест окончен vol 2.0");
    }
}
