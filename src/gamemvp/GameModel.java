package gamemvp;

import components.Card;
import components.Deck;
import components.DeckFactory;
import components.plot.PlotCard;
import components.tech.TechCard;
import player.Player;

/**
 *
 * @author brooks42
 */
public class GameModel {
    
    static enum TurnPhase {
        GetResources, // get resources from all sources
        Play, // play cards from your hand, buy population, etc
        Attack, // decide on your attackers
        Defend, // defender bounces if they have a wall, choose defenders
        ResolveCombat, // defender resolves combat
        Draw, // turn player draws 4 cards
        Discard, // turn player discards 2 cards
        End // the end of the turn
    }

    // TODO: need Agency type to define how the player is controlled?
    private Player player1;
    private Player player2;
    
    private TurnPhase currentTurnPhase;
    
    // the current turn number. Starts at 1
    private int turnNumber = 1;
    
    // available plots is the face-up plots that are available for purchase
    private Deck<PlotCard> facedownPlotsDeck;
    private Deck<PlotCard> availablePlotsDeck;
    
    // available techs is the face-up techs that are available for purchase
    private Deck<TechCard> facedownTechsDeck;
    private Deck<TechCard> availableTechsDeck;
    
    // all of the cards that are available for players to draw
    private Deck<Card> playableCardsDeck;
    
    // all of the cards that have been used, when playableCardsDeck is empty
    // we should shuffle this and swap it with the playableCardsDeck
    private Deck<Card> discardPile;
    
    public GameModel() {
        player1 = new Player("Player1");
        player2 = new Player("Player2");
    }
    
    public Player getPlayer1() {
        return player1;
    }
    
    public Player getPlayer2() {
        return player2;
    }
    
    public TurnPhase getCurrentTurnPhase() {
        return currentTurnPhase;
    }

    public void setCurrentTurnPhase(TurnPhase currentTurnPhase) {
        this.currentTurnPhase = currentTurnPhase;
    }

    /**
     * @return the turnNumber
     */
    public int getTurnNumber() {
        return turnNumber;
    }

    /**
     * @return the facedownPlotsDeck
     */
    public Deck<PlotCard> getFacedownPlotsDeck() {
        return facedownPlotsDeck;
    }

    /**
     * @param facedownPlotsDeck the facedownPlotsDeck to set
     */
    public void setFacedownPlotsDeck(Deck<PlotCard> facedownPlotsDeck) {
        this.facedownPlotsDeck = facedownPlotsDeck;
    }

    /**
     * @return the availablePlotsDeck
     */
    public Deck<PlotCard> getAvailablePlotsDeck() {
        return availablePlotsDeck;
    }

    /**
     * @param availablePlotsDeck the availablePlotsDeck to set
     */
    public void setAvailablePlotsDeck(Deck<PlotCard> availablePlotsDeck) {
        this.availablePlotsDeck = availablePlotsDeck;
    }

    /**
     * @return the facedownTechsDeck
     */
    public Deck<TechCard> getFacedownTechsDeck() {
        return facedownTechsDeck;
    }

    /**
     * @param facedownTechsDeck the facedownTechsDeck to set
     */
    public void setFacedownTechsDeck(Deck<TechCard> facedownTechsDeck) {
        this.facedownTechsDeck = facedownTechsDeck;
    }

    /**
     * @return the availablTechssDeck
     */
    public Deck<TechCard> getAvailableTechsDeck() {
        return availableTechsDeck;
    }

    /**
     * @param availablTechssDeck the availablTechssDeck to set
     */
    public void setAvailableTechsDeck(Deck<TechCard> availableTechsDeck) {
        this.availableTechsDeck = availableTechsDeck;
    }

    /**
     * @return the playableCardsDeck
     */
    public Deck<Card> getPlayableCardsDeck() {
        return playableCardsDeck;
    }

    /**
     * @param playableCardsDeck the playableCardsDeck to set
     */
    public void setPlayableCardsDeck(Deck<Card> playableCardsDeck) {
        this.playableCardsDeck = playableCardsDeck;
    }

    /**
     * @return the discardPile
     */
    public Deck<Card> getDiscardPile() {
        return discardPile;
    }

    /**
     * @param discardPile the discardPile to set
     */
    public void setDiscardPile(Deck<Card> discardPile) {
        this.discardPile = discardPile;
    }
}
