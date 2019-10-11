package CreationalPattern.AbstractFactoryDesignPattern.Visa;

import CreationalPattern.AbstractFactoryDesignPattern.CardType;
import CreationalPattern.AbstractFactoryDesignPattern.CreditCard;
import CreationalPattern.AbstractFactoryDesignPattern.CreditCardFactory;
import CreationalPattern.AbstractFactoryDesignPattern.Master.MasterClassicCard;
import CreationalPattern.AbstractFactoryDesignPattern.Master.MasterGoldCard;
import CreationalPattern.AbstractFactoryDesignPattern.Master.MasterPlatinumCard;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class VisaCreditCardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case CLASSIC:return new VisaClassicCard();
            case GOLD: return new VisaGoldCard();
            case PLATINUM:return new VisaPlatinumCard();
            default:throw  new IllegalArgumentException("We support only Classic , Gold and Platinum ");
        }
    }
}
