import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Dog dog = new Dog("Sharik", LocalDate.of(2019, 10, 24), new Illness("Distemper"));
        animals.add(dog);

        Cat cat = new Cat("Barsik", LocalDate.of(2017, 05, 01), new Illness("Lichen"));
        animals.add(cat);

        // Animal duck = new Duck("Donald", LocalDate.of(2021, 05, 06), new Illness());
        // animals.add(duck);

        // Animal penguin = new Penguin("Lolo", LocalDate.of(2018, 01, 01), new
        // Illness());
        // animals.add(penguin);

        // Animal beaver = new Beaver("Justin", LocalDate.of(2015, 02, 07), new
        // Illness());
        // animals.add(beaver);

        // Shark shark = new Shark("Sharp", LocalDate.of(2012, 11, 20), new Illness());
        // animals.add(shark);

        // for (Animal animal : animals) {
        // System.out.println("------ " + animal.getType() + " ------");
        // animal.go();
        // animal.fly();
        // animal.swim();
        // System.out.println();
        // }

        List<Goable> goableList = new ArrayList<>();
        goableList.add(new Cat("Barsik", LocalDate.of(2017, 05, 01), new Illness("Lichen")));
        goableList.add(new Dog("Sharik", LocalDate.of(2019, 10, 24), new Illness("Distemper")));
        for (Goable goable : goableList) {
            goable.defaultGo(10);
        }

        Goable g = new Goable() {
            @Override
            public double go() {
                return 0;
            }
        };

        Goable g2 = () -> 8.2;

        Mathable m1 = (x, y) -> x + y;
    }
}