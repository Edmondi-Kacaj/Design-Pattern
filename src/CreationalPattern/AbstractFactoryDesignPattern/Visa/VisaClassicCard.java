package CreationalPattern.AbstractFactoryDesignPattern.Visa;

import CreationalPattern.AbstractFactoryDesignPattern.CreditCard;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class VisaClassicCard extends CreditCard {

    public VisaClassicCard() {
        setCardNumber(789456);
        setCardHolderFullName("Johny MC");
        setCreditCardLimit(2000);
    }
}
