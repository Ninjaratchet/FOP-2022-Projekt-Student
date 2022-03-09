package projekt.food;

import java.util.function.Consumer;

public class ExtraImpl<C extends Food.Config> implements Extra<C>{
    private final String name;
    private final int priority;
    //TODO check later for correctness
    //generic unsicher : Maximale Möglichkeiten an Inputs sollen mit dem Consumer ermöglicht werden.
    private final Consumer<C> configMutator;


    /**
     * Public normal constructor to create an Extra.
     * @param name name of the extra
     * @param priority priority of the extra
     * @param configMutator mutator, i.e. function that is done upon applying the extra
     */
    public ExtraImpl(String name, int priority, Consumer<C> configMutator) {
        this.name = name;
        this.priority = priority;
        this.configMutator = configMutator;
    }

    /**
     * Getter for final field name.
     * @return name of the extra
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Getter for final field priority
     * @return the priority of the extra
     */
    @Override
    public int getPriority() {
        return priority;
    }

    /** //TODO check this javadoc once better understanding has been gained
     * Method that applies the extra, by using the predefined consumer.
     * @param config the food configuration which is going to be applied.
     */
    @Override
    public void apply(C config) {
        configMutator.accept(config);
    }
}
