package customarray.impl;

import java.util.Iterator;

import customarray.ArrayIterator;
import customarray.MyList;

/**
 * MyArrayList
 */
public class MyArrayList<T> implements MyList<T> {
    private T[] array;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.capacity = 2;
        this.size = 0;
        this.array = (T[]) new Object[capacity];
    }

    private void addCapacity() {
        this.capacity *= 2;
        T[] temp = (T[]) new Object[this.capacity];
        System.arraycopy(this.array, 0, temp, 0, this.array.length);
        this.array = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int index = 0;
        while (index != size) {
            sb.append(array[index]).append(",");
            index++;
        }

        if (sb.length() == 1) {
            return "{}";
        }

        sb.deleteCharAt(sb.length() - 1).append("}");

        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(this.array);
    }

    @Override
    public void add(T elem) {
        if (this.size == this.capacity) {
            addCapacity();
        }
        this.array[size++] = elem;
    }

    @Override
    public void remove(int index) {
        this.capacity = capacity - 1;
        T[] temp = (T[]) new Object[capacity];
        System.arraycopy(this.array, 0, temp, 0, index);
        int amountElemAfterIndex = array.length - index - 1;
        System.arraycopy(this.array, index + 1, temp, index, amountElemAfterIndex);
        this.array = temp;
        size--;
    }

    @Override
    public T get(int index) {
        return this.array[index];
    }

    @Override
    public int size() {
        return this.size;
    }
}