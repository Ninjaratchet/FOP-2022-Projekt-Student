package projekt.food;

public interface Pizza extends Saucable {

    /**
     * @return the diameter of the pizza
     */
    double getDiameter();

    /**
     * Nested interface that represents the specific variant of Pizza.
     */
    interface Variant extends Saucable.Variant{
        double getBaseDiameter();
    }

}
