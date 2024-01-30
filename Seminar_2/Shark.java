import java.time.LocalDate;

/**
 * Shark
 */
public class Shark extends Animal {
    public Shark(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness);
    }

    @Override
    public void go() {
        System.out.println(getType() + " can't walk!");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " can't fly!");
    }
}