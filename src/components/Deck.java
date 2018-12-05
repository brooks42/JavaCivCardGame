package components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    
    protected Deck(ArrayList<Type> cards) {
        this.cards = cards;
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    /**
     * Adds the passed `card` to the bottom of the deck. 
     * @param card 
     */
    public void addCard(Type card) {
        this.cards.add(card);
    }
    
    /**
     * Adds the passed `cards` to the bottom of the deck. 
     * @param card 
     */
    public void addCards(List<Type> cards) {
        this.cards.addAll(cards);
    }
    
    public void addCardToTop(Type card) {
        this.cards.add(0, card);
    }
    
    public void addCardsToTop(List<Type> cards) {
        this.cards.addAll(0, cards);
    }
    
    /**
     * @return and remove the top card of the Deck, if any. If not returns `null`
     */
    public Type draw() {
        if (cards.isEmpty()) {
            return null;
        }
        
        Type card = cards.remove(0);
        return card;
    }
    
    /**
     * @return and remove the top `numCards` cards of the deck. If the deck is smaller than the number of cards asked for, returns 
     * as many as it can draw.
     */
    public List<Type> draw(int numCards) {
        ArrayList<Type> drawnCards = new ArrayList<>();
        
        for (int i = 0; i < numCards; i++) {
            Type card = this.draw();
            
            if (card == null) {
                break;
            }
            
            drawnCards.add(card);
        }
        return drawnCards;
    }
    
    public int size() {
        return cards.size();
    }
    
    public List<Type> peek(int start, int end) {
        if (start > end || start < 0) {
            throw new IllegalArgumentException("start cannot be greater than end");
        }
        return cards.subList(start, Math.min(end, cards.size()));
    }
}
