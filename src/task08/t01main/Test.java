package task08.t01main;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> integers = new MyArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(7, 13);
        System.out.println(integers.get(7));
        System.out.println(integers.contains(4));
    }
}
