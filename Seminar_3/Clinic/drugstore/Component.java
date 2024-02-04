package drugstore;

/**
 * Component
 */
public abstract class Component implements Comparable<Component> {
    private String title;
    private double weight;
    private int power;

    public Component(String title, double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Power: %s", title, power);
    }

    @Override
    public int compareTo(Component c) {
        // if (power > c.power) {
        // return 1;
        // } else if (power < c.power) {
        // return -1;
        // } else {
        // return 0;
        // }

        return Integer.compare(power, c.power);
    }
}