package structuralpattern.flywieghtdesignpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class BulletFactory {
    private static Map<BulletType, Bullet> bulletCache = new HashMap<>();



    // create instance normal
    public static Bullet getBullByType(BulletType bulletType) {
        switch (bulletType) {
            case PISTOL_BULLET:
                return new Bullet("S", "50mg");
            case SHOTGUN_BULLET:
                return new Bullet("M", "80mg");
            case SNIPER_BULLET:
                return new Bullet("L", "1000mg");
            default:
                throw new IllegalArgumentException("Invalid Bullet Type");
        }
    }

    public static Bullet getBulletFromCashe(BulletType bulletType) {
        if (bulletCache.containsKey(bulletType)) {
            return bulletCache.get(bulletType);
        }
        Bullet bullet = getBullByType(bulletType);
        bulletCache.put(bulletType, bullet);
        return bulletCache.get(bulletType);
    }

}
