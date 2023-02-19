package task08.t01main;

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
        return indexOf(value) > 0;
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
    public boolean add(int index, T value) {
        if (size >= myArrayLists.length) {
            increaseMyArrayList();
        }
        for (int i = size; i >= index; i--) {
            myArrayLists[i + 1] = myArrayLists[i];
        }
        myArrayLists[index] = value;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object value) {
        boolean isRemove = false;
        for (int i = 0; i < myArrayLists.length; i++) {
            if (myArrayLists[i].equals(value)) {
                myArrayLists[i] = myArrayLists[i + 1];
                isRemove = true;
                break;
            }
        }
        size--;
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
        myArrayLists = newMyArrayList;
        return true;
    }

    @Override
    public T get(int index) {
        return (T) myArrayLists[index];
    }

    @Override
    public T remove(int index) {
        T temp = (T) myArrayLists[index];
        for (int i = index; i < size; i++) {
            myArrayLists[i] = myArrayLists[i + 1];
        }
        size --;
        return temp;
    }

    @Override
    public T set(int index, T value) {
        if (size >= myArrayLists.length) {
            increaseMyArrayList();
        }
        for (int i = size; i >= index; i--) {
            myArrayLists[i + 1] = myArrayLists[i];
        }
        myArrayLists[index] = value;
        size++;
        return (T) myArrayLists[index];
    }

    @Override
    public int indexOf(Object value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (myArrayLists[i].equals(value)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void removeAllNull() {
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

    public MyArrayList() {
        this.myArrayLists = (T[]) new Object[CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            this.myArrayLists = (T[]) new Object[CAPACITY];
        } else {
            this.myArrayLists = (T[]) new Object[capacity];
        }
    }

    MyArrayList(MyList<? extends T> col) {
        Object[] newMyArrayList = new Object[col.size()];
        for (int i = 0; i < newMyArrayList.length; i++) {
            newMyArrayList[i] = col.get(i);
        }
        myArrayLists = newMyArrayList;
    }

    private void increaseMyArrayList() {
        Object[] newMyArrayList = new Object[(int) Math.floor(CAPACITY * 1.5)];
        for (int i = 0; i < myArrayLists.length; i++) {
            newMyArrayList[i] = myArrayLists[i];
        }
        myArrayLists = newMyArrayList;
    }
}
