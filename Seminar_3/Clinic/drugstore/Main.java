package drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import drugstore.components.Penicillin;
import drugstore.components.Salt;
import drugstore.components.Water;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy();
        p1
                .addComponent(new Penicillin("Component1", 2, 10))
                .addComponent(new Water("Water", 2, 3));

        Pharmacy p2 = new Pharmacy();
        p2
                .addComponent(new Penicillin("Penicillin", 4, 12))
                .addComponent(new Salt("Salt", 16, 58))
                .addComponent(new Water("Water", 8, 20));

        Pharmacy p3 = new Pharmacy();
        p3
                .addComponent(new Penicillin("Bla", 4.5, 26))
                .addComponent(new Salt("Wowowow", 92, 13))
                .addComponent(new Water("Ururu", 81, 200));

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(p1);
        pharmacies.add(p2);
        pharmacies.add(p3);

        // while (p1.hasNext()) {
        // System.out.println(p1.next());
        // }
        // System.out.println();

        for (Component component : p2) {
            System.out.println(component);
        }

        System.out.println();

        Component c1 = new Penicillin("Penicillin", 4, 12);
        Component c2 = new Water("Water", 2, 3);
        Component c3 = new Salt("Salt", 16, 58);

        List<Component> componentsList = new ArrayList<>();
        componentsList.add(c1);
        componentsList.add(c2);
        componentsList.add(c3);
        System.out.println(componentsList);
        Collections.sort(componentsList, Comparator.reverseOrder());
        System.out.println(componentsList);
    }
}