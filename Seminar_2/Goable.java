/**
 * Goable
 */
@FunctionalInterface
public interface Goable {
    double go();

    default void defaultGo(double speed) {
        System.out.println("The object is moving at speed of " + speed);
    }
}