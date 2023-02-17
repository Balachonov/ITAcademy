package task08.t01main;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<T> implements MyList<T> {

    private static int capacity = 10;
    private static int size = 0;
    private Object[] myArrayLists;

    @Override
    public int size() {
        for (Object t : myArrayLists) {
            if (t != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() > 0;
    }

    @Override
    public boolean contains(Object value) {
        for (Object t : myArrayLists) {
            return t.equals(value);
        }
        return false;
    }

    @Override
    public void add(T value) {
        size();

    }

    @Override
    public void add(int index, T value) {

    }

    @Override
    public void remove(Object value) {

    }

    @Override
    public boolean addAll(MyList<? extends T> value) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T set(int index, T value) {
        return null;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        MyList.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return MyList.super.spliterator();
    }

    public MyArrayList() {
        this.myArrayLists = (T[]) new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.myArrayLists = (T[]) new Object[capacity];
    }

    MyArrayList(MyList<? extends T> col){

    }

    private void increaseMyArrayList(){
        Object[] newMyArrayList = new Object[(int) (capacity * 1.5) + 1];
        for (int i = 0; i < size; i++) {
            newMyArrayList[i] = myArrayLists[i];
            myArrayLists[i] = null;
        }
        myArrayLists = newMyArrayList;
    }
}
