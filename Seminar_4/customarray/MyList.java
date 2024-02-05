package customarray;

/**
 * MyList
 */
public interface MyList<T> extends Iterable<T> {
    void add(T elem);

    void remove(int index);

    T get(int index);

    int size();
}
