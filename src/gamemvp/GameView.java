/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemvp;

import components.Deck;
import player.Player;

/**
 *
 * @author brooks42
 */
public interface GameView {

    void describePlayer(Player player);

    void describePlayerHand(Player player);

    void describePlayerPlots(Player player);

    void describePlayerTechs(Player player);

    void describePlayerResourcePool(Player player);

    void describeTable(GameModel game);

    void describeActiveTechCards(Deck techCards);

    void describeActivePlotCards(Deck plotCards);

    void describeDiscardPile(Deck discardPile);
}
