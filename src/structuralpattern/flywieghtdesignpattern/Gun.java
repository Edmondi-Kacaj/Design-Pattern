package structuralpattern.flywieghtdesignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/17/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public abstract class Gun {
    private final BulletType bulletType;
    protected Bullet[] bullets;
    protected int capacity;

    public Gun(int capacity, BulletType bulletType) {
        this.capacity = capacity;
        this.bulletType = bulletType;
        this.bullets = new Bullet[this.capacity];
    }

    // every gun shoot have a shot method
    public abstract void shoot();


    // load Bullets in normal way
    public void loadBulletsNormal() {
        for (int i = 0; i < this.capacity; i++) {
            this.bullets[i] = new Bullet("S", "50 mg");
        }
    }

    // load bullets with Pattern
    public void loadBullets() {
        for (int i = 0; i < this.capacity; i++) {
            this.bullets[i] = BulletFactory.getBulletFromCashe(bulletType);
        }
    }


}
