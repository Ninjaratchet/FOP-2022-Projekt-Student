package projekt.food;

public interface Pasta extends Saucable{

    /**
     * @return the thickness of the noodles
     */
    double getThickness();

    /**
     * Nested interface that represents the specific variant of Pasta.
     */
    interface Variant extends Saucable.Variant{
        double getBaseThickness();
    }
}
