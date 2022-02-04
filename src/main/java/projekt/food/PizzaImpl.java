package projekt.food;

import java.math.BigDecimal;
import java.util.List;

public class PizzaImpl extends AbstractSaucable implements Pizza{
    private double diameter;
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