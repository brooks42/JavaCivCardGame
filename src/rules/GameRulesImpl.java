package rules;

import components.Deck;
import components.DeckFactory;
import gamemvp.GameModel;
import player.Player;

/**
 *
 * @author brooks42
 */
public class GameRulesImpl implements GameRules {
    
    @Override
    public void setupGame(GameModel game) {
        
        DeckFactory deckFactory = new DeckFactory();
        
        // to start the game, we need to:
        // load all of the decks
        game.setFacedownPlotsDeck(deckFactory.getInitialPlotCardDeck());
        game.setPlayableCardsDeck(deckFactory.getInitialCardDeck());
        game.setFacedownTechsDeck(deckFactory.getInitialTechCardDeck());

        // shuffle all of the decks
        game.getFacedownPlotsDeck().shuffle();
        game.getPlayableCardsDeck().shuffle();
        game.getFacedownTechsDeck().shuffle();
        
        // then we draw 4 plot cards and distribute them to the users at random
        // (this is just iteration 1, in the real game there's a choice aspect)
        game.getPlayer1().getPlots().addCards(game.getFacedownPlotsDeck().draw(2));
        game.getPlayer2().getPlots().addCards(game.getFacedownPlotsDeck().draw(2));
        
        // then we reveal 4 plot cards and tech cards to the available slots
        game.getAvailablePlotsDeck().addCards(game.getFacedownPlotsDeck().draw(4));
        game.getAvailableTechsDeck().addCards(game.getFacedownTechsDeck().draw(4));

        // then each player draws 5 cards
        game.getPlayer1().getHand().addCards(game.getPlayableCardsDeck().draw(5));
        game.getPlayer2().getHand().addCards(game.getPlayableCardsDeck().draw(5));
        
        // then the game starts :)
    }
    
    public void drawCard(Player player, Deck deck) {
        player.getHand().addCards(deck.draw(1));
    }
    
    public void drawCards(int cardNum, Player player, Deck deck) {
        player.getHand().addCards(deck.draw(cardNum));
    }
    
    public void nextTurnPhase(GameModel game) {
        switch (game.getCurrentTurnPhase()) {
            case GetResources:
                break;
            case Play:
                break;
            case Attack:
                break;
            case Defend:
                break;
            case ResolveCombat:
                break;
            case Draw:
                break;
            case Discard:
                break;
            case End:
                break;
        }
    }
    
    public void winGame() {
        
    }
    
    public void loseGame() {
        
    }
}
