/**
 * Illness
 */
public class Illness {
    private String name;

    public Illness(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}