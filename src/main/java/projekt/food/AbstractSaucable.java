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

    /**
     * Constructor will be called from PizzaImpl/PastaImpl and sets their attributes.
     * @param sauce of pizza/pasta
     * @param price of pizza/pasta
     * @param weight of pizza/pasta
     * @param variant of pizza/pasta
     * @param extras served with pizza/pasta
     */
    protected AbstractSaucable(String sauce, BigDecimal price, double weight, Variant variant, List<Extra<?>> extras) {
        this.sauce = sauce;
        this.price = price;
        this.weight = weight;
        this.variant = variant;
        this.extras = extras;
    }
}
