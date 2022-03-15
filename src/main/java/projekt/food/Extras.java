package projekt.food;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public final class Extras {
    public static Extra<Pizza.Config> EXTRA_HAM = new ExtraImpl<Pizza.Config>("Extra Ham", 5, new Consumer<Pizza.Config>() {

        @Override
        public void accept(Pizza.Config config) {
            //TODO (Max) check if correct
        config.price(p -> BigDecimal.valueOf(p.doubleValue()+0.1));
        config.weight(w -> w+0.1);
        }
    });
    //(Thomas) Meine Erweiterung
    public static Extra<Pizza.Config> EXTRA_OLIVES= new ExtraImpl<Pizza.Config>("Extra Olives", 5, new Consumer<Pizza.Config>() {

        @Override
        public void accept(Pizza.Config config) {
            //TODO (Max) check if correct
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+0.8));
            config.weight(w -> w+0.05);
        }
    });

    public static Extra<Pasta.Config> EXTRA_THICK = new ExtraImpl<Pasta.Config>("Extra Thick", 4, new Consumer<Pasta.Config>() {

        @Override
        public void accept(Pasta.Config config) {
            //TODO (Max) check if correct
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+4.0));
            config.weight(w -> w*2);
            config.thickness(t->t*2);
        }
    });

    public static Extra<Saucable.Config> SPICY_SAUCE= new ExtraImpl<Saucable.Config>("Spicy Sauce", 3, new Consumer<Saucable.Config>() {

        @Override
        public void accept(Saucable.Config config) {
            //TODO (Max) check if correct
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+0.5));
            config.sauce(s->"spicy "+s);
        }
    });

    public static Extra<Saucable.Config> EXTRA_SAUCE= new ExtraImpl<Saucable.Config>("Extra Sauce", 4, new Consumer<Saucable.Config>() {

        @Override
        public void accept(Saucable.Config config) {
            //TODO (Max) check if correct
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+1.25));
            config.weight(w -> w+0.12);
            config.sauce(s->"Extra "+s);
        }
    });
    public static Extra<Saucable.Config> NO_SAUCE= new ExtraImpl<Saucable.Config>("No Sauce", 5, new Consumer<Saucable.Config>() {

        @Override
        public void accept(Saucable.Config config) {
            //TODO (Max) check if correct
            config.price(p -> p.doubleValue()-1<0? BigDecimal.valueOf(0.0): BigDecimal.valueOf(p.doubleValue()-1));
            config.weight(w -> w-0.1<0?0.0:w-0.1);
            config.sauce(s->null);
        }
    });
    public static Extra<IceCream.Config> RAINBOW_SPRINKLES= new ExtraImpl<IceCream.Config>("Rainbow Sprinkles", 5, new Consumer<IceCream.Config>() {

        @Override
        public void accept(IceCream.Config config) {
            //TODO (Max) check if correct
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+0.5));
            config.weight(w -> w+0.03);
        }
    });
    public static Extra<IceCream.Config> EXTRA_SCOOP= new ExtraImpl<IceCream.Config>("Extra Scoop", 2, new Consumer<IceCream.Config>() {

        @Override
        public void accept(IceCream.Config config) {
            //TODO (Max) check if correct
            config.price(p -> BigDecimal.valueOf(p.doubleValue()+3.0));
            config.weight(w -> w+0.1);
        }
    });

    public static final Map<String, Extra<?>> ALL=new HashMap<>();

    public Extras(Map<String, Extra<?>> map) {

        ALL.put("Extra Olives",EXTRA_OLIVES);
        ALL.put("Extra Thick",EXTRA_THICK);
        ALL.put("Spicy Sauce",SPICY_SAUCE);
        ALL.put("Extra Sauce",EXTRA_SAUCE);
        ALL.put("No Sauce",NO_SAUCE);
        ALL.put("Rainbow Sprinkles",RAINBOW_SPRINKLES);
        ALL.put("Extra Scoop",EXTRA_SCOOP);
    }
}
