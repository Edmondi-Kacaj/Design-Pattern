package structuralpattern.flywieghtdesignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public final class Bullet {

    //    private int id=hashCode();
    private final String bulletSize;
    private final String bulletWeight;

    public Bullet(String bulletSize, String bulletWeight) {
        this.bulletSize = bulletSize;
        this.bulletWeight = bulletWeight;
    }

    //    public int getId() {
    //        return id;
    //    }

    public String getBulletSize() {
        return bulletSize;
    }

    public String getBulletWeight() {
        return bulletWeight;
    }
}
