package components.plot;

import components.CardInfo;
import components.Mechanics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brooks42
 */
public class PlotCardInfo extends CardInfo {
    
    protected ArrayList<String> yield;
    
    public ArrayList<Mechanics.Resource> getYield() {
        ArrayList<Mechanics.Resource> resourceYield = new ArrayList<>();
        
        this.yield.forEach((string) -> {
            resourceYield.add(Mechanics.Resource.valueOf(string));
        });
        
        return resourceYield;
    }
}
