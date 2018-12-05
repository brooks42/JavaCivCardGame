package gamemvp;

/**
 *
 * @author brooks42
 */
public class GamePresenter {

    protected final GameModel game;
    
    protected BaseGameDisplay view;
    
    public GamePresenter(GameModel game) {
        this.game = game;
    }
    
    public void bindView(BaseGameDisplay view) {
        this.view = view;
    }
}
