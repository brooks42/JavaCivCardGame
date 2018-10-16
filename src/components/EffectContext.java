package components;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brita
 */
public class EffectContext {

    // information like choices the player has made, etc
    private final Map<String, Object> information;
    
    public EffectContext() {
        this.information = new HashMap<>();
    }
    
    public Object getField(String field) {
        return information.get(field); 
    }
}
