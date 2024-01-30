import java.time.LocalDate;

/**
 * Dog
 */
public class Dog extends Animal implements Goable {
    public Dog(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness);
    }

    @Override
    public void fly() {
        System.out.println(getType() + " can't fly!");
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats dog food.");
    }

    @Override
    public double go() {
        return 7;
    }
}
