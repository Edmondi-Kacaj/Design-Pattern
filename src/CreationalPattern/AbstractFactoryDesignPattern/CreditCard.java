package CreationalPattern.AbstractFactoryDesignPattern;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Create the card with information
 * i add only 2 properties but can be more
 */
public abstract class CreditCard {

    private int cardNumber;
    private String cardHolderFullName;
    private int creditCardLimit;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderFullName() {
        return cardHolderFullName;
    }

    public void setCardHolderFullName(String cardHolderFullName) {
        this.cardHolderFullName = cardHolderFullName;
    }

    public int getCreditCardLimit() {
        return creditCardLimit;
    }

    public void setCreditCardLimit(int creditCardLimit) {
        this.creditCardLimit = creditCardLimit;
    }

    @Override public String toString() {
        return "CreditCard{" + "cardNumber=" + cardNumber + ", cardHolderFullName='"
            + cardHolderFullName + '\'' + ", creditCardLimit=" + creditCardLimit + '}';
    }
}
