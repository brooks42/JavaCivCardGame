package gamemvp;

import player.Player;

/**
 *
 * @author brita
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
    private int turnNumber;
    
    public GameModel() {
        player1 = new Player("Player1");
        player2 = new Player("Player2");
        turnNumber = 1;
    }
    
    public Player getPlayer1() {
        return player1;
    }
    
    public Player getPlayer2() {
        return player2;
    }
    
}
