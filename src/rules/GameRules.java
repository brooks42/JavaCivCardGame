package rules;

import gamemvp.GameModel;

/**
 *
 * @author brooks42
 */
public interface GameRules {
    
    void setupGame(GameModel game);
    
    void winGame();
    
    void loseGame();
}
