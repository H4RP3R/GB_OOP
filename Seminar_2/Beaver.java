import java.time.LocalDate;

/**
 * Beaver
 */
public class Beaver extends Animal {
    public Beaver(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness);
    }

    @Override
    public void fly() {
        System.out.println(getType() + " can't fly!");
    }
}