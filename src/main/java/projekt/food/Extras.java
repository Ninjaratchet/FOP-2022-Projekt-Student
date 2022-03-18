package projekt.food;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Extras to add to a configuration of a specific food type.
 */
public final class Extras {
    /**
     * Adds additional ham to the pizza.
     */
    public static Extra<Pizza.Config> EXTRA_HAM = new ExtraImpl<Pizza.Config>("Extra Ham", 5, new Consumer<Pizza.Config>() {
        /**
         * Modifies the price and weight of a pizza,
         * to resemble the cost and weight change of adding ham.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(Pizza.Config config) {
        config.price(p -> BigDecimal.valueOf(p.doubleValue()+0.1));
        config.weight(w -> w+0.1);
        }

    });
    /**
     *  Adds additional olives to the pizza.
     */
    public static Extra<Pizza.Config> EXTRA_OLIVES= new ExtraImpl<Pizza.Config>("Extra Olives", 5, new Consumer<Pizza.Config>() {

        /**
         * Modifies the price and weight of a pizza,
         * to resemble the cost and weight change of adding olives.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(Pizza.Config config) {
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+0.8));
            config.weight(w -> w+0.05);
        }
    });

    /**
     * For extra thick pizzas.
     */
    public static Extra<Pasta.Config> EXTRA_THICK = new ExtraImpl<Pasta.Config>("Extra Thick", 4, new Consumer<Pasta.Config>() {
        /**
         * Modifies the price and weight of a pizza,
         * to resemble the change of making the
         * pizza extra thick.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(Pasta.Config config) {
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+4.0));
            config.weight(w -> w*2);
            config.thickness(t->t*2);
        }
    });

    /**
     * Adds spicy sauce to the food.
     */
    public static Extra<Saucable.Config> SPICY_SAUCE= new ExtraImpl<Saucable.Config>("Spicy Sauce", 3, new Consumer<Saucable.Config>() {
        /**
         * Modifies the price and weight of saucable food,
         * to resemble the change of adding spicy sauce.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(Saucable.Config config) {
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+0.5));
            config.sauce(s->"spicy "+s);
        }
    });

    /**
     * Adds extra sauce to the food.
     */
    public static Extra<Saucable.Config> EXTRA_SAUCE= new ExtraImpl<Saucable.Config>("Extra Sauce", 4, new Consumer<Saucable.Config>() {
        /**
         *  Modifies the price and weight of saucable food,
         *  to resemble the change of adding extra sauce.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(Saucable.Config config) {
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+1.25));
            config.weight(w -> w+0.12);
            config.sauce(s->"Extra "+s);
        }
    });
    /**
     * Removes sauce of the food.
     */
    public static Extra<Saucable.Config> NO_SAUCE= new ExtraImpl<Saucable.Config>("No Sauce", 5, new Consumer<Saucable.Config>() {

        /**
         *  Modifies the price and weight of saucable food,
         *  to resemble removing sauce.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(Saucable.Config config) {
            config.price(p -> p.doubleValue()-1<0? BigDecimal.valueOf(0.0): BigDecimal.valueOf(p.doubleValue()-1));
            config.weight(w -> w-0.1<0?0.0:w-0.1);
            config.sauce(s->null);
        }
    });
    /**
     * Adds rainbow sprinkles to the IceCream.
     */
    public static Extra<IceCream.Config> RAINBOW_SPRINKLES= new ExtraImpl<IceCream.Config>("Rainbow Sprinkles", 5, new Consumer<IceCream.Config>() {

        /**
         *  Modifies the price and weight of the IceCream,
         *  to resemble the change of adding rainbow sprinkles.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(IceCream.Config config) {
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+0.5));
            config.weight(w -> w+0.03);
        }
    });
    /**
     * Adds a scoop of IceCream.
     */
    public static Extra<IceCream.Config> EXTRA_SCOOP= new ExtraImpl<IceCream.Config>("Extra Scoop", 2, new Consumer<IceCream.Config>() {
        /**
         * Modifies the price and weight of the IceCream,
         * to resemble the change of adding a scoop.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(IceCream.Config config) {
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+3.0));
            config.weight(w -> w+0.1);
        }
    });
    /**
     * Adds chocolate sprinkles to the IceCream.
     */
    public static Extra<IceCream.Config> CHOCOLATE_SPRINKLES = new ExtraImpl<IceCream.Config>("Extra Scoop", 2, new Consumer<IceCream.Config>() {
        /**
         *  Modifies the price and weight of the IceCream,
         *  to resemble the change of adding chocolate sprinkles.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(IceCream.Config config) {
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+0.5));
            config.weight(w -> w+0.07);
        }
    });
    /**
     * Adds caramel sauce to the IceCream.
     */
    public static Extra<IceCream.Config> CARAMEL_SAUCE = new ExtraImpl<IceCream.Config>("Extra Scoop", 2, new Consumer<IceCream.Config>() {
        /**
         * Modifies the price and weight of the IceCream,
         * to resemble the change of adding caramel sauce.
         * @param config config upon which the change is performed
         */
        @Override
        public void accept(IceCream.Config config) {
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+1));
            config.weight(w -> w+0.1);
        }
    });



    public static final Map<String, Extra<?>> ALL=new HashMap<>();


    /**
     * Constructor that adds all extras to the static final map ALL, which
     * safes all the extras.
     */
    public Extras() {

        ALL.put("Extra Olives",EXTRA_OLIVES);
        ALL.put("Extra Thick",EXTRA_THICK);
        ALL.put("Spicy Sauce",SPICY_SAUCE);
        ALL.put("Extra Sauce",EXTRA_SAUCE);
        ALL.put("No Sauce",NO_SAUCE);
        ALL.put("Rainbow Sprinkles",RAINBOW_SPRINKLES);
        ALL.put("Extra Scoop",EXTRA_SCOOP);
        ALL.put("Chocolate Sprinkles", CHOCOLATE_SPRINKLES);
        ALL.put("Caramel Sauce", CARAMEL_SAUCE);
    }


}
