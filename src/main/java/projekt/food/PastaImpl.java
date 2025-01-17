package projekt.food;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class PastaImpl extends AbstractSaucable implements Pasta{
    private final double thickness;

    /**
     * Constructor sets attributes to values given in parameters.
     * @param thickness of noodles
     * @param sauce with the pasta
     * @param price of pasta
     * @param weight of pasta
     * @param variant of pasta or plain pasta
     * @param extras served with the pasta
     */
    public PastaImpl(double thickness, String sauce, BigDecimal price, double weight, Pasta.Variant variant, List<Extra<?>> extras) {
        super(sauce, price, weight, variant, extras);
        this.thickness = thickness;

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
     * @return the price of the pasta
     */
    @Override
    public BigDecimal getPrice() {
        return price;
    }
    /**
     * {@inheritDoc}
     * @return the weight of the pasta
     */
    @Override
    public double getWeight() {
        return weight;
    }
    /**
     * {@inheritDoc}
     * @return the variant of the pasta
     */
    @Override
    public Food.Variant<?, ?> getFoodVariant() {
        return variant;
    }
    /**
     * {@inheritDoc}
     * @return the extras of the pasta
     */
    @Override
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }
    /**
     * {@inheritDoc}
     * @return the thickness of the pasta
     */
    @Override
    public double getThickness() {
        return thickness;
    }
    /**
     * {@inheritDoc}
     * @return the sauce of the pasta
     */
    @Override
    public String getSauce() {
        return sauce;
    }
}
