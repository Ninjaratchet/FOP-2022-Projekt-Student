package projekt.food;

import java.util.function.UnaryOperator;

public interface Saucable extends Food{

    /**
     * @return the kind of sauce served with a dish
     */
    String getSauce();

    /**
     * Nested interface that represents the specific variant of sauce.
     */
    interface Variant extends Food.Variant<Saucable, Food.Config>{
        String getBaseSauce();
    }


    /**
     * Nested interface that represents the specific configuration of the sauce
     */
    interface Config extends Food.Config{

        /**
         * @param unaryOperator which method apply takes and returns a string
         */
        void sauce(UnaryOperator<String> unaryOperator);

        /**
         * @return a UnaryOperator which is the concatenated function of all functions given to sauce method
         */
        UnaryOperator<String> getSauceMutator();
    }
}
