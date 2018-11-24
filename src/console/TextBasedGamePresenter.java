package console;

import gamemvp.GameModel;
import gamemvp.GamePresenter;
import gamemvp.GameView;

/**
 *
 * @author brita
 */
public class TextBasedGamePresenter extends GamePresenter {
    
    private static final String[] allCommands = new String[] { };

    public TextBasedGamePresenter(GameModel game, GameView view) {
        super(game, view);
    }
    
    
}
