package CreationalPattern.AbstractFactoryDesignPattern.Visa;

import CreationalPattern.AbstractFactoryDesignPattern.CreditCard;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class VisaGoldCard extends CreditCard {

    public VisaGoldCard() {
        setCardNumber(123654);
        setCardHolderFullName("Edmond Kacaj");
        setCreditCardLimit(4000);
    }
}
