package components;

/**
 * Model for a single card in a deck or on the field, etc
 *
 * @author brita
 */
public class Card {
    
    protected final CardInfo cardInfo;
    
    public Card(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }
}
