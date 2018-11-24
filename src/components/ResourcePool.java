package components;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brita
 */
public class ResourcePool {
        
    private final Map<Mechanics.Resource, Integer> resourcePool;

    public ResourcePool() {
        resourcePool = new HashMap<>();
    }

    public void add(Mechanics.Resource resourceType, int amount) {
        Integer currentAmount = this.resourcePool.get(resourceType);
        if (currentAmount == null) {
            currentAmount = 0;
        }
        this.resourcePool.put(resourceType, currentAmount + amount);
    }

    public void spend(Mechanics.Resource resourceType, int amount) {
        this.add(resourceType, -amount);
    }

    public int getAmount(Mechanics.Resource resourceType) {
        Integer amount = this.resourcePool.get(resourceType);
        if (amount == null) {
            amount = 0;
        }
        return amount;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(this.getAmount(Mechanics.Resource.Food));
        builder.append("/");
        builder.append(this.getAmount(Mechanics.Resource.Production));
        builder.append("/");
        builder.append(this.getAmount(Mechanics.Resource.Commerce));
        builder.append("}");
        return builder.toString();
    }
}