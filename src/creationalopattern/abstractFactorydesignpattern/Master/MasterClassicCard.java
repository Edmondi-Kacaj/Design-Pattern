package creationalopattern.abstractFactorydesignpattern.Master;

import creationalopattern.abstractFactorydesignpattern.CreditCard;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class MasterClassicCard extends CreditCard {

    public MasterClassicCard() {
        setCardNumber(123456);
        setCardHolderFullName("John Johny");
        setCreditCardLimit(1000);
    }
}
