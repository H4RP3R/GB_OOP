import java.time.LocalDate;

/**
 * Animal
 */
public class Animal {
    protected String name;
    protected LocalDate birDate;
    protected Illness illness;

    public Animal(String name, LocalDate birDate, Illness illness) {
        this.name = name;
        this.birDate = birDate;
        this.illness = illness;
    }

    public Animal() {
        this("Default Name", LocalDate.now(), new Illness("Default Illness"));
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirDate() {
        return birDate;
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

    private void eat() {
        System.out.println(getType() + " is eating...");
    }

    private void sleep() {
        System.out.println(getType() + " is sleeping...");
    }

    public void lifeCycle() {
        wakeUp("07:00");
        hunt();
        eat();
        sleep();
    }

    @Override
    public String toString() {
        return String.format("Type: %s\tName: %s\tBirth date: %s\tIllness: %s", getType(), name, birDate, illness);
    }
}