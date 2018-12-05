package console;

import gamemvp.BaseGameDisplay;
import gamemvp.GameModel;
import gamemvp.GamePresenter;
import player.Player;
import rules.GameRulesImpl;

/**
 *
 * @author brooks42
 */
public class TextBasedGamePresenter extends GamePresenter {
    
    private GameRulesImpl gameRules;
    
    private TextBasedGameDisplay castView;

    public TextBasedGamePresenter(GameModel game) {
        super(game);
        gameRules = new GameRulesImpl();
    }
    
    @Override
    public void bindView(BaseGameDisplay view) {
        super.bindView(view);
        castView = (TextBasedGameDisplay)view;
    }
    
    public void startGame() {
        gameRules.setupGame(game);
        castView.showGameSetUp();
    }
    
    public void drawCard(Player player) {
        gameRules.drawCard(player, game.getPlayableCardsDeck());
    }
    
    public void describePlayer1() {
        if (view != null) {
            view.describePlayer(game.getPlayer1());
        }
    }
    
    public void describePlayer2() {
        if (view != null) {
            view.describePlayer(game.getPlayer2());
        }
    }
    
    public void describeActiveTechCards() {
        if (view != null) {
            view.describeActiveTechCards(game.getAvailableTechsDeck());
        }
    }
    
    public void describeActivePlotCards() {
        if (view != null) {
            view.describeActivePlotCards(game.getAvailablePlotsDeck());
        }
    }
    
    public void describeDiscardPile() {
        if (view != null) {
            view.describeDiscardPile(game.getDiscardPile());
        }
    }
    
    public void describePlayerHand() {
        if (view != null) {
            view.describePlayerHand(game.getPlayer1());
        }
    }

    public void describePlayerPlots() {
        if (view != null) {
            view.describePlayerPlots(game.getPlayer1());
        }
    }

    public void describePlayerTechs() {
        if (view != null) {
            view.describePlayerHand(game.getPlayer1());
        }
    }
    
    public void describeTable() {
        if (view != null) {
            view.describeTable(game);
        }
    }
}
