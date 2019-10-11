package CreationalPattern.AbstractFactoryDesignPattern.Master;

import CreationalPattern.AbstractFactoryDesignPattern.CreditCard;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class MasterGoldCard extends CreditCard {

    public MasterGoldCard() {
        setCardNumber(123654);
        setCardHolderFullName("Edmond Kacaj");
        setCreditCardLimit(3000);
    }
}
