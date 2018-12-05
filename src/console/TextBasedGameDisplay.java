package console;

import components.Deck;
import gamemvp.GameModel;
import gamemvp.BaseGameDisplay;
import java.io.PrintStream;
import player.Player;

/**
 *
 * @author brooks42
 */
public class TextBasedGameDisplay extends BaseGameDisplay {

    private final PrintStream out;
    
    public TextBasedGameDisplay(PrintStream out) {
        this.out = out;
    }
    
    public void showGameSetUp() {
        this.out.println("Game ready");
    }
    
    @Override
    public void describePlayer(Player player) {
        this.out.println(player.toString());
    }

    @Override
    public void describePlayerHand(Player player) {
        this.out.println(player.getHand().toString());
    }

    @Override
    public void describePlayerPlots(Player player) {
        this.out.println(player.getPlots().toString());
    }

    @Override
    public void describePlayerTechs(Player player) {
        this.out.println(player.getTechs().toString());
    }

    @Override
    public void describePlayerResourcePool(Player player) {
        this.out.println(player.getResourcePool().toString());
    }

    @Override
    public void describeTable(GameModel game) {
        StringBuilder builder = new StringBuilder();
        builder.append("Table:").append(System.lineSeparator());
        builder.append(game.getPlayer2().getName()).append(System.lineSeparator());
        builder.append(game.getPlayer2().getTableString()).append(System.lineSeparator());
        builder.append(game.getAvailablePlotsDeck()).append(System.lineSeparator());
        builder.append(game.getAvailableTechsDeck()).append(System.lineSeparator());
        builder.append(game.getPlayer1().getName()).append(System.lineSeparator());
        builder.append(game.getPlayer1().getTableString()).append(System.lineSeparator());
        this.out.println(builder.toString());
    }

    @Override
    public void describeActiveTechCards(Deck techCards) {
        this.out.println(techCards.toString());
    }

    @Override
    public void describeActivePlotCards(Deck plotCards) {
        this.out.println(plotCards.toString());
    }

    @Override
    public void describeDiscardPile(Deck discardPile) {
        this.out.println(discardPile.toString());
    }
}
