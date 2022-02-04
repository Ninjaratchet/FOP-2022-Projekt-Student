package projekt.food;

public interface Saucable extends Food{

    /**
     * @return the kind of sauce served with a dish
     */
    String getSauce();

    /**
     * Nested interface that represents the specific variant of sauce.
     */
    interface Variant extends Food.Variant<Saucable, Food.Config>{
        String getBaseSauce();
    }
}
