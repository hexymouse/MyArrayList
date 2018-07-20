package MyArrayList;

import java.util.AbstractList;

public class MyArrayList<T> extends AbstractList {

    private int size;
    private static final int defaultSize = 10;
    private int cap;
    private T[] list;

    public MyArrayList() {

    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
