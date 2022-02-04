package projekt.food;

import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public interface Pizza extends Saucable{

    /**
     * @return the diameter of the pizza
     */
    double getDiameter();

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
