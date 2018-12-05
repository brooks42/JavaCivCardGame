package components.plot;

import components.Card;
import components.CardInfo;
import components.Mechanics;
import java.util.ArrayList;

/**
 *
 * @author brita
 */
public class PlotCard extends Card implements Plot {
        
    public PlotCard(PlotCardInfo cardInfo) {
        super(cardInfo);
    }
    
    public ArrayList<Mechanics.Resource> getYield() {
        return ((PlotCardInfo)cardInfo).getYield();
    }
    
    public String getCardName() {
        return ((PlotCardInfo)cardInfo).getCardName();
    }
    
    public String getPlotYieldString() {
        StringBuilder builder = new StringBuilder();
        
        ((PlotCardInfo)cardInfo).getYield().forEach(((resource) -> {
            builder.append(resource.toString()).append(" ");
        }));
        
        return builder.toString();
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getCardName()).append(" ").append(getPlotYieldString());
        return builder.toString();
    }
}
