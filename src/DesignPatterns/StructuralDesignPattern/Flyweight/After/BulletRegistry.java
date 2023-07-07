package DesignPatterns.StructuralDesignPattern.Flyweight.After;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    Map<BulletType, Bullet> map = new HashMap<>();

    public void registerBullet(BulletType bulletType, Bullet bullet) {
        map.put(bulletType, bullet);
    }

    public Bullet getBullet(BulletType bulletType) {
        return map.get(bulletType);
    }
}
