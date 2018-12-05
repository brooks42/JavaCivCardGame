package player;

import components.Card;
import components.Deck;
import components.ResourcePool;
import components.plot.PlotCard;
import components.tech.TechCard;

/**
 *
 * @author brooks42
 */
public class Player {
    
    private final String name;

    private final Deck<Card> hand;
    private final Deck<PlotCard> plots;
    private final Deck<TechCard> techs;
    
    private final ResourcePool resourcePool;
    
    public Player(String name) {
        this.name = name;
        
        hand = new Deck<>();
        plots = new Deck<>();
        techs = new Deck<>();
        
        resourcePool = new ResourcePool();
    }
    
    public String getName() {
        return name;
    }
    
    public ResourcePool getResourcePool() {
        return resourcePool;
    }
    
    public Deck<Card> getHand() {
        return hand;
    }
    
    public void addPlotCard(PlotCard card) {
        plots.addCard(card);
    }
    
    public Deck<PlotCard> getPlots() {
        return plots;
    }
    
    public void addTechCard(TechCard card) {
        techs.addCard(card);
    }
    
    public Deck<TechCard> getTechs() {
        return techs;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append(this.name).append(System.lineSeparator());
        builder.append(this.resourcePool.toString()).append(System.lineSeparator());
        
        return builder.toString();
    }
    
    public String getTableString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append(getPlots()).append(System.lineSeparator());
        builder.append(getTechs()).append(System.lineSeparator());
        
        // TODO: need to add extra print for player with the most happiness/culture
        
        return builder.toString();
    }
}
