package task08.t01main;

public interface MyList <T> extends Iterable {
    int size();
    boolean isEmpty();
    boolean contains(Object value);
    boolean add(T value);
    void add(int index, T value);
    void remove(Object value);
    boolean addAll(MyList<? extends T> value);
    T get (int index);
    T remove (int index);
    T set (int index, T value);
    int indexOf (Object value);

}
