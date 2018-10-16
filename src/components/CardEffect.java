package components;

/**
 *
 * @author brita
 */
public interface CardEffect {
    
    /**
     * Executes the card effect.
     * 
     * @param context a context describing player choices, board state etc
     */
    void execute(EffectContext context);
}
