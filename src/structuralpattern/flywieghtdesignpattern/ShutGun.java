package structuralpattern.flywieghtdesignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/17/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ShutGun extends Gun {
    public ShutGun(int capacity, BulletType bulletType) {
        super(capacity, bulletType);
    }

    @Override public void shoot() {
        for (int i = 0; i < this.capacity; i++) {
            System.out.println(this.bullets[i].toString());
        }
    }
}
