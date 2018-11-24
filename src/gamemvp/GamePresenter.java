package gamemvp;

/**
 *
 * @author brita
 */
public class GamePresenter {

    private final GameModel game;
    
    private final GameView view;
    
    public GamePresenter(GameModel game, GameView view) {
        this.game = game;
        this.view = view;
    }
}
