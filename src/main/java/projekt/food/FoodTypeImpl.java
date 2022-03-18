package projekt.food;

import java.util.List;

//H2.9
public class FoodTypeImpl<F extends Food,C extends Food.Config> implements FoodType<F,C>{
    private final String name;
    private List<Food.Variant<F, C>> foodVariants;
    private final List<? extends Extra<C>> compatibleExtras;


    /**
     * Assigns name and compatibleExtras directly using each parameter.
     * @param name name of the food type
     * @param compatibleExtras all compatible extras for the food type
     */
    public FoodTypeImpl(String name, List<? extends Extra<C>> compatibleExtras) {
        this.name = name;
        this.compatibleExtras = compatibleExtras;
    }

    /**
     * Gets the name of the food type.
     * @return name of the food type
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * Gets all compatible extras for the food type.
     * @return compatible extras for the food type
     */
    @Override
    public List<? extends Extra<C>> getCompatibleExtras() {
        return compatibleExtras;
    }

    /**
     * Adds a food variant (parameter) directly to the food variant
     * list.
     * @param variant The {@link Food.Variant} to add to this food type
     */
    @Override
    public void addFoodVariant(Food.Variant<F,C> variant) {
        foodVariants.add(variant);
    }
    /**
     * Gets all variants of the food type.
     * @return variants of the food type
     */
    @Override
    public List<? extends Food.Variant<F,C>> getFoodVariants() {
        return foodVariants;
    }
}
