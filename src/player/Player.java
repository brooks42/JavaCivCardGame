package player;

import components.Card;
import components.Deck;
import components.ResourcePool;
import components.plot.PlotCard;

/**
 *
 * @author brita
 */
public class Player {
    
    private final String name;

    private final Deck<Card> hand;
    private final Deck<PlotCard> plots;
    
    private final ResourcePool resourcePool;
    
    public Player(String name) {
        this.name = name;
        hand = new Deck<>();
        plots = new Deck<>();
        resourcePool = new ResourcePool();
    }
    
    public ResourcePool getResourcePool() {
        return resourcePool;
    }
    
    @Override
    public String toString() {
        return name + " " + resourcePool.toString();
    }
}
