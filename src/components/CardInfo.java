package components;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 * Describes a card, its name and effect etc
 *
 * @author brita
 */
public class CardInfo {

    @SerializedName("name")
    protected String cardName;
    
    public String getCardName() {
        return cardName;
    }
}
