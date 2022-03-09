package projekt.food;

import java.math.BigDecimal;
import java.util.List;

/**
 * This abstract class contains the attributes being the same in PizzaImpl and PastaImpl.
 */
public abstract class AbstractSaucable implements Saucable{
    protected final String sauce;
    protected final BigDecimal price;
    protected final double weight;
    protected final Variant variant;
    protected final List<Extra<?>> extras;

    protected AbstractSaucable(String sauce, BigDecimal price, double weight, Variant variant, List<Extra<?>> extras) {
        this.sauce = sauce;
        this.price = price;
        this.weight = weight;
        this.variant = variant;
        this.extras = extras;
    }
}
