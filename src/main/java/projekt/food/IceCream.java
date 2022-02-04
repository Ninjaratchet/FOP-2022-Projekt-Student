package projekt.food;

import java.util.function.UnaryOperator;

public interface IceCream extends Food{

    /**
     * @return the flavor of the specific ice cream, depends on the specific implementation
     */
    String getFlavor();

    interface Config extends Food.Config{
        /**
         * @param unaryOperator which method apply takes and returns a string
         */
        void flavor(UnaryOperator<Double> unaryOperator);

        /**
         * @return a UnaryOperator which is the concatenated function of all functions given to flavor method
         */
        UnaryOperator<Double> getFlavorMutator();
    }
}
