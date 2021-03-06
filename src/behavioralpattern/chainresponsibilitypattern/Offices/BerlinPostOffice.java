package behavioralpattern.chainresponsibilitypattern.Offices;

import behavioralpattern.chainresponsibilitypattern.Package;
import behavioralpattern.chainresponsibilitypattern.PostI;

/**
 * @author Edmond Kacaj
 * @date 10/18/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class BerlinPostOffice implements PostI {

    private PostI nextInChain;

    public void setNext(PostI c) {
        nextInChain = c;
    }

    public void process(Package address) {
        if (address.getAddressPackage().toUpperCase().contains("BERLIN")) {
            System.out
                .println(" Berlin Office :  package=" + address.getPackageName() + "    was send ");

        } else {
            nextInChain.process(address);
        }
    }

}
