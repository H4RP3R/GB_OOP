import java.time.LocalDate;

/**
 * Animal
 */
public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String name, LocalDate birthDate, Illness illness) {
        this.name = name;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Default Name", LocalDate.now(), new Illness());
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    private void wakeUp() {
        System.out.println(getType() + " awoke");
    }

    private void wakeUp(String time) {
        System.out.println(getType() + " woke up  at " + time);
    }

    private void hunt() {
        System.out.println(getType() + " is hunting...");
    }

    public abstract void eat();

    private void sleep() {
        System.out.println(getType() + " is sleeping...");
    }

    public void lifeCycle() {
        wakeUp("07:00");
        hunt();
        eat();
        sleep();
    }

    // public void go() {
    // System.out.println(getType() + " is walking...");
    // }

    public void fly() {
        System.out.println(getType() + " is flying...");
    }

    public void swim() {
        System.out.println(getType() + " is swimming...");
    }

    @Override
    public String toString() {
        return String.format("Type: %s\tName: %s\tBirth date: %s\tIllness: %s", getType(), name, birthDate, illness);
    }
}
