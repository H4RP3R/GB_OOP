import java.time.LocalDate;

/**
 * Cat
 */
public class Cat extends Animal implements Huntable, Goable {
    public Cat(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness);
    }

    @Override
    public void fly() {
        System.out.println(getType() + " can't fly!");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " can't swim!");
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats cat food.");
    }

    @Override
    public double go() {
        return 5;
    }
}