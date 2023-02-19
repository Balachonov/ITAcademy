package task08.t01main;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> integers = new MyArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        System.out.println(integers.get(4));
        System.out.println(integers.contains(1));
    }
}
