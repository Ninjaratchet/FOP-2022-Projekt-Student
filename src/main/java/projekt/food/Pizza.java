package projekt.food;

import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

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


    interface Config extends Saucable.Config{

        /**
         * @param unaryOperator which method apply takes and returns a Double
         */
        void diameter(DoubleUnaryOperator unaryOperator);

        /**
         * @return a UnaryOperator which is the concatenated function of all functions given to diameter method
         */
        DoubleUnaryOperator getDiameterMutator();
    }
}
