import java.time.LocalDate;

/**
 * Duck
 */
public class Duck extends Animal {
    private int wingQuantity;

    public Duck(String name, LocalDate birthDate, Illness illness, int wingQuantity) {
        super(name, birthDate, illness);
        this.wingQuantity = wingQuantity;
    }

    public Duck(String name, LocalDate birthDate, Illness illness) {
        this(name, birthDate, illness, 2);
    }
}
