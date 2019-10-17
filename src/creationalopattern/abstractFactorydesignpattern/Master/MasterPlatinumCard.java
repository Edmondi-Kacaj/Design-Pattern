package creationalopattern.abstractFactorydesignpattern.Master;

import creationalopattern.abstractFactorydesignpattern.CreditCard;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class MasterPlatinumCard extends CreditCard {

    public MasterPlatinumCard() {
        setCardNumber(123789);
        setCardHolderFullName("Arjan Kacaj");
        setCreditCardLimit(4000);
    }
}
