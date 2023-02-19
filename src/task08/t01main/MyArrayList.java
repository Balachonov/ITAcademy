package task08.t01main;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<T> implements MyList<T> {

    private static final int CAPACITY = 10;
    private static int size = 0;
    private Object[] myArrayLists;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }

    @Override
    public boolean contains(Object value) {
        for (Object t : myArrayLists) {
            return t.equals(value);
        }
        return false;
    }

    @Override
    public boolean add(T value) {
        if (size >= myArrayLists.length) {
            increaseMyArrayList();
        }
        myArrayLists[size] = value;
        size++;
        return true;
    }

    @Override
    public void add(int index, T value) {
        if (size >= myArrayLists.length) {
            increaseMyArrayList();
        }
        for (int i = size; i >= index; i--) {
            myArrayLists[i + 1] = myArrayLists[i];
        }
        myArrayLists[index] = value;
        size++;
    }

    @Override
    public boolean remove(Object value) {
        boolean isRemove = false;
        for (int i = 0; i < myArrayLists.length; i++) {
            if (myArrayLists[i].equals(value)) {
                myArrayLists[i] = null;
                isRemove = true;
            }
        }
        if (isRemove) {
            decreaseMyArrayList();
        }
        return isRemove;
    }

    @Override
    public boolean addAll(MyList<? extends T> value) {
        Object[] newMyArrayList = new Object[size + value.size()];
        for (int i = 0; i < size; i++) {
            newMyArrayList[i] = myArrayLists[i];
        }
        for (int i = 0; i < value.size(); i++) {
            newMyArrayList[i + size] = value.get(i);
        }
        size = size + value.size();
        return true;
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
        this.myArrayLists = (T[]) new Object[CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.myArrayLists = (T[]) new Object[capacity];
    }

    MyArrayList(MyList<? extends T> col) {

    }

    private void increaseMyArrayList() {
        Object[] newMyArrayList = new Object[(int) Math.floor(CAPACITY * 1.5)];
        for (int i = 0; i < myArrayLists.length; i++) {
            newMyArrayList[i] = myArrayLists[i];
        }
        myArrayLists = newMyArrayList;
    }

    private void decreaseMyArrayList() {
        for (Object myArrayList : myArrayLists) {
            if (myArrayList == null) {
                size--;
            }
        }
        Object[] newMyArrayList = new Object[size];
        int countNewMyArrayList = 0;
        for (int i = 0; i < myArrayLists.length; i++) {
            if (myArrayLists[i] != null) {
                newMyArrayList[countNewMyArrayList] = myArrayLists[i];
                countNewMyArrayList++;
            }
        }
        myArrayLists = newMyArrayList;
    }
}
