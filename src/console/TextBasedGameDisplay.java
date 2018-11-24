package console;

import gamemvp.GameModel;
import gamemvp.GameView;
import java.io.PrintStream;

/**
 *
 * @author brita
 */
public class TextBasedGameDisplay extends GameView {

    private final PrintStream out;
    
    public TextBasedGameDisplay(GameModel game, PrintStream out) {
        super(game);
        this.out = out;
    }
    
    @Override
    public void showTable() {
        showPlayerOne();
        showPlayerTwo();
    }

    @Override
    public void showHand() {
//        out.println(this.game.getPlayer1().toString());
    }

    @Override
    public void showPlayerOne() {
        out.println(this.game.getPlayer1().toString());
    }
    
    @Override
    public void showPlayerTwo() {
        out.println(this.game.getPlayer2().toString());        
    }

    @Override
    public void showResourcePool() {
        out.println(this.game.getPlayer1().getResourcePool().toString());
    }
}
