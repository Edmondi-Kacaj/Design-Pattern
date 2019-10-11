package CreationalPattern.AbstractFactoryDesignPattern.Master;

import CreationalPattern.AbstractFactoryDesignPattern.CardType;
import CreationalPattern.AbstractFactoryDesignPattern.CreditCard;
import CreationalPattern.AbstractFactoryDesignPattern.CreditCardFactory;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class MasterCreditCardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case CLASSIC:return new MasterClassicCard();
            case GOLD: return new MasterGoldCard();
            case PLATINUM:return new MasterPlatinumCard();
            default:throw  new IllegalArgumentException("We support only Classic , Gold and Platinum ");
        }
    }
}
