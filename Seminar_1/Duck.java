import java.time.LocalDate;

/**
 * Duck
 */
public class Duck extends Animal {
    private int wingQuantity;

    public Duck(String name, LocalDate birDate, Illness illness, int wingQuantity) {
        super(name, birDate, illness);
        this.wingQuantity = wingQuantity;
    }
}