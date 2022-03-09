package projekt.food;

import java.math.BigDecimal;
import java.util.List;

public class PastaImpl extends AbstractSaucable implements Pasta{
    private final double thickness;

    /**
     * constructs an object of type PastaImpl with the given attributes
     * @param sauce sauce of the pasta
     * @param price base price of the pasta
     * @param weight base weight of the pasta
     * @param variant variant of the dish
     * @param extras extra ingredients in the pasta
     * @param thickness thickness of the pasta
     */
    public PastaImpl(String sauce, BigDecimal price, double weight, Saucable.Variant variant, List<Extra<?>> extras, double thickness) {
        // (Thomas) ich bezweifle, dass saucable.variant als typ für variant richtig ist
        super(sauce, price, weight, variant, extras);
        this.thickness=thickness;
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
