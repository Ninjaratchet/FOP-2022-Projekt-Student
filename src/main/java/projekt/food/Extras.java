package projekt.food;

import java.math.BigDecimal;
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
}
