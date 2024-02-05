package customarray;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] arr;
    private int index;

    public ArrayIterator(T[] arr) {
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }

    @Override
    public T next() {
        return arr[index++];
    }

}
