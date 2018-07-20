package MyArrayList;

import java.util.AbstractList;
import java.util.Arrays;

public class MyArrayList<T> extends AbstractList {

    private final int DEFAULT_SIZE = 3;
    private int coef = 2;
    private Object[] array = new Object[DEFAULT_SIZE];
    private int index = 0;

    @Override
    public Object get(int i) {
        return array[i];
    }

    public void put(T item) {
        if (index == array.length) {
            Object[] newArray = new Object[array.length * coef];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[index++] = item;
    }

    @Override
    public int size() { // Todo переделать чтобы возвращал размер без null элементов
        return array.length;
    }

    public String showAll() { // Todo переделать
        return Arrays.toString(array);
    }
}
