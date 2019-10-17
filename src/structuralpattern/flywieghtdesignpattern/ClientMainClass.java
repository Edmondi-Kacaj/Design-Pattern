package structuralpattern.flywieghtdesignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 *
 * Flyweight design pattern is used when we need to create a lot of Objects of a class.
 * Since every object consumes memory space that can be crucial for low memory devices,
 * such as mobile devices or embedded systems, flyweight design pattern can be applied
 * to reduce the load on memory by sharing objects.
 *
 * Example we are creating a game , which is a war game, and our responsibility is to create a way
 * to create bullets,guns ,
 * and we need to create all kind of guns , Like shotGun, Sniper,Ak-47 etc
 * ( bullet can be a class we need to use Fly Weight pattern because we are create a lot of object with this class
 *   every guns have a number of bullets ShotGun have 8 or 10 bullets
 *   ak-47=30
 *
 *   and we dont need to create for each bullets new object but we want to use this object also for other bullets
 *
 * )
 *
 * we do like in exmaple
 */
public class ClientMainClass {
    public static void main(String[] args) {

        System.out.println("-------- Load bullets with normal way -----------------");
        Gun shutGun1 = new ShutGun(8, BulletType.SHOTGUN_BULLET);
        shutGun1.loadBulletsNormal();
        shutGun1.shoot();

        System.out.println("-------- Load bullets with normal way -----------------");
        Gun shutGun2 = new ShutGun(8, BulletType.SHOTGUN_BULLET);
        shutGun2.loadBullets();
        shutGun2.shoot();


    }
}
