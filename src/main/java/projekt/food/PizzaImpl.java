package projekt.food;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class PizzaImpl extends AbstractSaucable implements Pizza{
    private final double diameter;

    /**
     * Constructor sets attributes to values from parameters.
     * @param diameter of pizza circle
     * @param sauce served on top the pizza
     * @param price of the pizza
     * @param weight of the pizza
     * @param variant of the pizza
     * @param extras served with the specific pizza
     */
    public PizzaImpl(double diameter, String sauce, BigDecimal price, double weight, Pizza.Variant variant, List<Extra<?>> extras) {
        super(sauce, price, weight, variant, extras);
        this.diameter = diameter;

    }

    private static class Config implements Saucable.Config {

        @Override
        public void price(UnaryOperator<BigDecimal> priceMutator) {

        }

        @Override
        public UnaryOperator<BigDecimal> getPriceMutator() {
            return null;
        }

        @Override
        public void weight(DoubleUnaryOperator weightMutator) {

        }

        @Override
        public DoubleUnaryOperator getWeightMutator() {
            return null;
        }

        @Override
        public void sauce(UnaryOperator<String> unaryOperator) {

        }

        @Override
        public UnaryOperator<String> getSauceMutator() {
            return null;
        }
    }


    /**
     * {@inheritDoc}
     * @return the price of the pizza
     */
    @Override
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * {@inheritDoc}
     * @return the weight of the pizza
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * {@inheritDoc}
     * @return the variant of the pizza
     */
    @Override
    public Food.Variant<?, ?> getFoodVariant() {
        return variant;
    }
    /**
     * {@inheritDoc}
     * @return the extras of the pizza
     */
    @Override
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }
    /**
     * {@inheritDoc}
     * @return the diameter of the pizza
     */
    @Override
    public double getDiameter() {
        return diameter;
    }
    /**
     * {@inheritDoc}
     * @return the sauce of the pizza
     */
    @Override
    public String getSauce() {
        return sauce;
    }
}
