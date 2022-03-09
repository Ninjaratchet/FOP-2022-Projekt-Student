package projekt.food;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class IceCreamImpl implements IceCream{

    private final BigDecimal price;
    private final double weight;
    //Generic unsure : "Food.Config" might be "IceCream.Config" or even "?"
    private final Food.Variant<IceCream,Food.Config> variant;
    //Generic unsure : see above but might even extend
    private final List<Extra<Food.Config>> extras;
    private final String flavor;

    public IceCreamImpl(BigDecimal price, double weight, Food.Variant<IceCream, Food.Config> variant, List<Extra<Food.Config>> extras, String flavor) {
        this.price = price;
        this.weight = weight;
        this.variant = variant;
        this.extras = extras;
        this.flavor = flavor;
    }

    private static class Config implements Food.Config {


        /**
         *{@inheritDoc}
         * @param priceMutator A {@link UnaryOperator} which determines a new price based on the previous value
         */
        @Override
        public void price(UnaryOperator<BigDecimal> priceMutator) {

        }

        /** //TODO add return type, once method is clear
         * {@inheritDoc}
         * @return
         */
        @Override
        public UnaryOperator<BigDecimal> getPriceMutator() {
            return null;
        }

        /**
         * {@inheritDoc}
         * @param weightMutator A {@link DoubleUnaryOperator} which determines a new weight based on the previous value
         */
        @Override
        public void weight(DoubleUnaryOperator weightMutator) {

        }

        /** //TODO add return type, once method is clear
         * {@inheritDoc}
         * @return
         */
        @Override
        public DoubleUnaryOperator getWeightMutator() {
            return null;
        }
    }


    /**
     * The price of this food.
     * @return The price of this food
     */
    @Override
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * The weight of this food.
     * @return The weight of this food
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * The food variant.
     *
     * @return The food variant
     */
    @Override
    public Food.Variant<?, ?> getFoodVariant() {
        return variant;
    }

    /**
     * The extras that this food was configured with.
     *
     * @return The extras that this food was configured with
     */
    @Override
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }

    /**
     * @return the flavor of the specific ice cream, depends on the specific implementation
     */
    @Override
    public String getFlavor() {
        return flavor;
    }
}
