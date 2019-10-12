package CreationalPattern.AbstractFactoryDesignPattern;

import CreationalPattern.AbstractFactoryDesignPattern.Master.MasterCreditCardFactory;
import CreationalPattern.AbstractFactoryDesignPattern.Visa.VisaCreditCardFactory;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardModel(CreditCardModel creditcardModel) {
        if (creditcardModel.getValue().equals("MASTER")) {
            return new MasterCreditCardFactory();
        } else {
            return new VisaCreditCardFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

}
