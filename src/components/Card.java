package components;

/**
 * Model for a single card in a deck or on the field, etc
 *
 * @author brita
 */
public class Card {
    
    static enum CardType {
        Plot, Population, Building, Wonder, Unit
    }
    
    private final CardInfo cardInfo;
    
    public Card(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }
}
