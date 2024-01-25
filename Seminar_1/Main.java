import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Tom", LocalDate.of(2020, 11, 26), new Illness("lichen"));
        System.out.println(cat.getName());
        // cat.setIllness(null);
        System.out.println(cat.getIllness());
        System.out.println(cat.getType());

        Animal dog = new Dog("Sharik", LocalDate.of(2021, 05, 06), new Illness("Distemper"));
        System.out.println(dog);
        System.out.println(dog.getType());

        List<Animal> aminalsList = new ArrayList<>(List.of(cat, dog));
        aminalsList.add(new Duck("Igor", LocalDate.of(2022, 07, 16), new Illness("lichen"), 2));

        System.out.println();
        for (Animal animal : aminalsList) {
            System.out.println(animal);
        }

        System.out.println();
        dog.lifeCycle();
    }
}