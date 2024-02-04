package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Pharmacy
 */
public class PharmacyIterator implements Iterator<Component> {
    private List<Component> components;
    private int idx;

    public PharmacyIterator() {
        components = new ArrayList<>();
        idx = 0;
    }

    public PharmacyIterator addComponent(Component item) {
        components.add(item);
        return this;
    }

    @Override
    public boolean hasNext() {
        return idx < components.size();
    }

    @Override
    public Component next() {
        return components.get(idx++);
    }
}