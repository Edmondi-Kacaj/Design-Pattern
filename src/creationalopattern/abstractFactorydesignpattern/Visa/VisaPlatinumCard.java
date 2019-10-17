package creationalopattern.abstractFactorydesignpattern.Visa;

import creationalopattern.abstractFactorydesignpattern.CreditCard;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class VisaPlatinumCard extends CreditCard {

    public VisaPlatinumCard() {
        setCardNumber(123789);
        setCardHolderFullName("jani Kacaj");
        setCreditCardLimit(6000);
    }
}
