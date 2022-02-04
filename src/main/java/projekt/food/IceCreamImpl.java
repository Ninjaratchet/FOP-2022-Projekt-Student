package projekt.food;

import java.math.BigDecimal;
import java.util.List;

public class IceCreamImpl implements IceCream{

    private final BigDecimal price;
    private final double weight;
    private final Food.Variant<?,?> variant;
    private final List<? extends Extra<?>> extras;
    private final String flavor;

    public IceCreamImpl(BigDecimal price, double weight, Food.Variant<?, ?> variant, List<? extends Extra<?>> extras, String flavor) {
        this.price = price;
        this.weight = weight;
        this.variant = variant;
        this.extras = extras;
        this.flavor = flavor;
    }

    /**
     * The price of this food.
     * @return The price of this food
     */
    @Override
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * The weight of this food.
     * @return The weight of this food
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * The food variant.
     *
     * @return The food variant
     */
    @Override
    public Food.Variant<?, ?> getFoodVariant() {
        return variant;
    }

    /**
     * The extras that this food was configured with.
     *
     * @return The extras that this food was configured with
     */
    @Override
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }

    /**
     * @return the flavor of the specific ice cream, depends on the specific implementation
     */
    @Override
    public String getFlavor() {
        return flavor;
    }
}
