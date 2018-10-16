package components;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author brita
 * @param <Type> the type of deck
 */
public class Deck<Type extends Card> {
    
    private ArrayList<Type> cards;

    public Deck() {
        cards = new ArrayList<>();
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Type draw() {
        if (cards.isEmpty()) {
            return null;
        }
        
        Type card = cards.remove(0);
        return card;
    }
}
