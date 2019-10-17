package structuralpattern.flywieghtdesignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public enum BulletType {

    PISTOL_BULLET(" MG 45 Bullet"), SHOTGUN_BULLET(" Cooey 84 Bullet"), SNIPER_BULLET(
        " M 14 Bullet");

    private String bulletName;

    BulletType(String bulletName) {
        this.bulletName = bulletName;
    }
}
