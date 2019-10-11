package CreationalPattern.BuilderPatter;

/**
 * @author Edmond Kacaj
 * @date 10/11/2019
 * @YEAR 2019
 * @Project Name DessignPattern
 * <p>
 * <p>
 * Here we call the Builder pattern with some examples
 */
public class BuilderPattern {

    public static void main(String[] args) {

        // Just
        PhoneSpecification iphone = new PhoneSpecification.BuilderPhone("Iphone", "11 X").build();
        System.out.println(iphone);

        // let's add some optional params
        PhoneSpecification samsung =
            new PhoneSpecification.BuilderPhone("Samsung", "Galaxy Note 8").color("Red")
                .price("800 $").build();


        System.out.println(samsung);
    }
}
