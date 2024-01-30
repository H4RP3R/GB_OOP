import java.time.LocalDate;

/**
 * Penguin
 */
public class Penguin extends Animal {
    public Penguin(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness);
    }

    @Override
    public void fly() {
        System.out.println(getType() + " can't fly!");
    }
}