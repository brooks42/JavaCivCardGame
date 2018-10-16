package player;

import com.sun.prism.impl.ResourcePool;
import components.Card;
import components.Deck;
import components.plot.PlotCard;

/**
 *
 * @author brita
 */
public class Player {

    private Deck<Card> hand;
    private Deck<PlotCard> plots;
    
    private ResourcePool resourcePool;
    
    public Player() {
        
    }
}
