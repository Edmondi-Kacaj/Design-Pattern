package creationalopattern.abstractFactorydesignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public enum CreditCardModel {
    VISA("VISA"), MASTER("MASTER");

    private String value;

    CreditCardModel(String id) {
        this.value = id;
    }

    public String getValue() {
        return value;
    }
}
