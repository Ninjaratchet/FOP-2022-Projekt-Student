package projekt.food;

import java.math.BigDecimal;
import java.util.List;

public class PastaImpl extends AbstractSaucable implements Pasta{
    private double thickness;
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
