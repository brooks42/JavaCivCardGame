package components;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @author Chris
 * @param <Type>
 */
public class CardFactory<Type extends Card> {
    
    private final Class<Type> cardType;
    private CardInfo info;

    public CardFactory(final Class<Type> cardType) {
        this.cardType = cardType;
    }
    
    public void setCardInfo(CardInfo info) {
        this.info = info;
    }

    public Type create() throws InstantiationException, IllegalAccessException, 
            NoSuchMethodException, InvocationTargetException {
        Constructor<Type> constr = cardType.getConstructor(CardInfo.class);
        Type card = constr.newInstance(this.info);
        return card;
    }
}
