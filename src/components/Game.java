package components;

import player.Player;

/**
 *
 * @author brita
 */
public class Game {
    
    static enum TurnPhase {
        GetResources, // get resources from all sources
        Play, // play cards from your hand, buy population, etc
        Attack, // decide on your attackers
        Defend, // defender bounces if they have a wall, choose defenders
        ResolveCombat, // defender resolves combat
        Draw, // draw 4 cards
        Discard, // discard 2 cards
        End // the end of the turn
    }

    // TODO: need Agency type to define how the player is controlled?
    private Player player1;
    private Player player2;
    
    private TurnPhase currentTurnPhase;
    
    // the current turn number. Starts at 1
    private int turnNumber;
    
    public Game() {
        player1 = new Player();
        player2 = new Player();
        turnNumber = 1;
    }
    
    
}
