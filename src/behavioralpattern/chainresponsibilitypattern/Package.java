package behavioralpattern.chainresponsibilitypattern;

/**
 * @author Edmond Kacaj
 * @date 10/18/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * here is the package object
 * <p>
 * i will use only the address
 */
public class Package {

    private int packageId;
    private String packageName;
    private String addressPackage;
    private String sender;

    public Package(String packageName, String addressPackage) {
        this.packageName = packageName;
        this.addressPackage = addressPackage;
    }

    public String getAddressPackage() {
        return this.addressPackage;
    }

    public String getPackageName() {
        return this.packageName;
    }
}
