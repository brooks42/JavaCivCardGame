package components;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brita
 */
public class Mechanics {

    public enum Resource {
        Commerce, 
        Production,
        Food
    }
    
    static class ResourcePool {
        
        private final Map<Resource, Integer> resourcePool;
        
        public ResourcePool() {
            resourcePool = new HashMap<>();
        }
        
        public void add(Resource resourceType, int amount) {
            Integer currentAmount = this.resourcePool.get(resourceType);
            if (currentAmount == null) {
                currentAmount = 0;
            }
            this.resourcePool.put(resourceType, currentAmount + amount);
        }
        
        public void spend(Resource resourceType, int amount) {
            this.add(resourceType, -amount);
        }
        
        public int getAmount(Resource resourceType) {
            Integer amount = this.resourcePool.get(resourceType);
            if (amount == null) {
                amount = 0;
            }
            return amount;
        }
    }
}
