package projekt.food;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractSaucable implements Saucable{
    protected String sauce;
    protected BigDecimal price;
    protected double weight;
    protected Variant variant;
    protected List<Extra<?>> extras;
}
