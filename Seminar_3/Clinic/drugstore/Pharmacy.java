package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Pharmacy
 */
public class Pharmacy implements Iterable<Component> {
    private List<Component> components;
    private int idx;

    public Pharmacy() {
        components = new ArrayList<>();
        idx = 0;
    }

    public Pharmacy addComponent(Component item) {
        components.add(item);
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    // public int getIdx() {
    // return idx;
    // }

    // public void setIdx(int idx) {
    // this.idx = idx;
    // }

    // public int getSize() {
    // return components.size();
    // }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return idx < components.size();
            }

            @Override
            public Component next() {
                return components.get(idx++);
            }
        };
    }
}