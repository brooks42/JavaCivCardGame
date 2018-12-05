package components;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import components.plot.PlotCard;
import components.plot.PlotCardInfo;
import components.tech.TechCard;
import components.tech.TechCardInfo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 *
 * @author brooks42
 */
public class DeckFactory {
    
    public Deck<Card> getInitialCardDeck() {
        
        return new Deck<Card>();
    }
    
    public Deck<PlotCard> getInitialPlotCardDeck() {
        
        // load all of the card types from plots.json
        InputStream inp = getClass().getResourceAsStream("/Data/plots.json");
        BufferedReader in = new BufferedReader(new InputStreamReader(inp));
        
        Gson gson = new Gson();
        PlotDeckInfo plotDeckInfo = gson.fromJson(in, PlotDeckInfo.class);
        
        Deck<PlotCard> plotDeck = new Deck<>();
        
        // populate the deck here
        for (PlotCardInfo info: plotDeckInfo.plotCardInfoMap.values()) {
            if (plotDeckInfo.counts.containsKey(info.getCardName())) {
                
                int cardNum = plotDeckInfo.counts.get(info.getCardName());
            
                for (int i = 0; i < cardNum; i++) {
                    plotDeck.addCard(new PlotCard(info));
                }
            }
        }
        
        return plotDeck;
    }
    
    static class PlotDeckInfo {
        
        @SerializedName("cards")
        Map<String, PlotCardInfo> plotCardInfoMap;
        
        @SerializedName("counts")
        Map<String, Integer> counts;
    }
    
    public Deck<TechCard> getInitialTechCardDeck() {
        
        // load all of the card types from plots.json
        InputStream inp = getClass().getResourceAsStream("/Data/techs.json");
        BufferedReader in = new BufferedReader(new InputStreamReader(inp));
        
        Gson gson = new Gson();
        TechDeckInfo techDeckInfo = gson.fromJson(in, TechDeckInfo.class);
        
        Deck<TechCard> techDeck = new Deck<>();
        
        // populate the deck here
        for (TechCardInfo info: techDeckInfo.techCardInfoMap.values()) {
            techDeck.addCard(new TechCard(info));
        }
        
        return techDeck;
    }
    
    static class TechDeckInfo {
        
        @SerializedName("cards")
        Map<String, TechCardInfo> techCardInfoMap;
    }
}
