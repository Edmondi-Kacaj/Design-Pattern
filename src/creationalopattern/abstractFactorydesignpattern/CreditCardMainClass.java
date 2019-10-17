package creationalopattern.abstractFactorydesignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class CreditCardMainClass {

    public static void main(String[] args) {
        CreditCard getMasterGold = CreditCardFactory.getCreditCardModel(CreditCardModel.MASTER)
            .getCreditCard(CardType.GOLD);
        System.out.println("---- Master Gold ---------");
        System.out.println(getMasterGold);
        System.out.println("--------------------------");

        CreditCard getVisaPlatinum = CreditCardFactory.getCreditCardModel(CreditCardModel.VISA)
            .getCreditCard(CardType.PLATINUM);
        System.out.println("---- Visa platinum ---------");
        System.out.println(getVisaPlatinum);
        System.out.println("--------------------------");
    }

}
