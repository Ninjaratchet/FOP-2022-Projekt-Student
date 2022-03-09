package projekt.food;

import java.math.BigDecimal;
import java.util.List;

/**
 * This abstract class contains the attributes being the same in PizzaImpl and PastaImpl.
 */
public abstract class AbstractSaucable implements Saucable{


    protected String sauce;
    protected BigDecimal price;
    protected double weight;
    protected Variant variant;
    protected List<Extra<?>> extras;
}
