package projekt.food;

import java.math.BigDecimal;
import java.util.List;

public class PizzaImpl extends AbstractSaucable implements Pizza{
    private final double diameter;

    /**
     * constructs an object of type PastaImpl with the given attributes
     * @param sauce sauce of the pasta
     * @param price base price of the pasta
     * @param weight base weight of the pasta
     * @param variant variant of the dish
     * @param extras extra ingredients in the pasta
     * @param thickness thickness of the pasta
     */
    public PizzaImpl(String sauce, BigDecimal price, double weight, Saucable.Variant variant, List<Extra<?>> extras, double thickness, double diameter) {
        // (Thomas) ich bezweifle, dass saucable.variant als typ für variant richtig ist
        super(sauce, price, weight, variant, extras);
        this.diameter=diameter;
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
