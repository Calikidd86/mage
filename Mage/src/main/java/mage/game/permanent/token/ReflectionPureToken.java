
package mage.game.permanent.token;

import mage.constants.CardType;
import mage.constants.SubType;
import mage.MageInt;

/**
 *
 * @author SpikesCafe-google
 */
public final class ReflectionPureToken extends TokenImpl {
    
    public ReflectionPureToken() {
       this(1);
    }

    public ReflectionPureToken(int xValue) {
        super("Reflection", "X/X white Reflection creature token, where X is the converted mana cost of that spell");
        this.setOriginalExpansionSetCode("INV");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.REFLECTION);
        power = new MageInt(xValue);
        toughness = new MageInt(xValue);
    }

    public ReflectionPureToken(final ReflectionPureToken token) {
        super(token);
    }

    public ReflectionPureToken copy() {
        return new ReflectionPureToken(this);
    }
}
