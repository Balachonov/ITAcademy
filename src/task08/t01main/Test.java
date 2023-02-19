package task08.t01main;

public class Test {
    public void test() {
        System.out.println("Тест.");
        System.out.println("Создали, добавили 5 элементов (метод add() и конструктор MyArrayList()).");
        MyArrayList<Integer> integers = new MyArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        System.out.println("Проверяем isEmpty(). Выводим на экран (метод size() и get()).");
        System.out.println(integers.isEmpty());
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
        }
        System.out.println("\nПроверяем наличие элемента contains(Object value). Удаляеем его remove(Object value) и " +
                " удаляем другой элемент E remove (int index)");
        System.out.println(integers.contains(2));
        integers.remove((Integer) 2);
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
        }
        System.out.println("\nСейчас удалим - " + integers.remove(2));
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
        }
        System.out.println("\nСоздадим еще, добавим 5 элементов (конструктор MyArrayList(int capacity)).");
        MyArrayList<Integer> integersTwo = new MyArrayList<>(5);
        integersTwo.set(0, 5);
        integersTwo.set(1, 6);
        integersTwo.set(2, 7);
        integersTwo.set(3, 8);
        integersTwo.set(4, 9);
        for (int i = 0; i < integersTwo.size(); i++) {
            System.out.print(integersTwo.get(i) + " ");
        }
    }
}
