package projekt.food;

public interface IceCream extends Food{

    /**
     * @return the flavor of the specific ice cream, depends on the specific implementation
     */
    String getFlavor();


    /**
     * Nested interface that represents the specific variant of icecream.
     */
    interface Variant extends Food.Variant<IceCream, Food.Config>{
        String getBaseFlavor();
    }
}
