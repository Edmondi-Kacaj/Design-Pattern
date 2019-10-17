package creationalopattern.abstractFactorydesignpattern.Visa;

import creationalopattern.abstractFactorydesignpattern.CardType;
import creationalopattern.abstractFactorydesignpattern.CreditCard;
import creationalopattern.abstractFactorydesignpattern.CreditCardFactory;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class VisaCreditCardFactory extends CreditCardFactory {

    @Override public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case CLASSIC:
                return new VisaClassicCard();
            case GOLD:
                return new VisaGoldCard();
            case PLATINUM:
                return new VisaPlatinumCard();
            default:
                throw new IllegalArgumentException("We support only Classic , Gold and Platinum ");
        }
    }
}
