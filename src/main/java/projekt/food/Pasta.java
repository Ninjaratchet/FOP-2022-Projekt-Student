package projekt.food;

import java.util.function.DoubleUnaryOperator;

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

    interface Config extends Food.Config{
        /**
         * @param unaryOperator which method apply takes and returns a Double
         */
        void thickness(DoubleUnaryOperator unaryOperator);

        /**
         * @return a UnaryOperator which is the concatenated function of all functions given to thickness method
         */
        DoubleUnaryOperator getThicknessMutator();
    }
}
