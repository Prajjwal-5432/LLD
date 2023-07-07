package DesignPatterns.StructuralDesignPattern.Flyweight.After;

public class FlyingBullet {
    private Double xcoord;
    private Double ycoord;
    private Double zcoord;
    private BulletStatus bulletStatus;
    private Double speed;
    private Long userId;
    private Double x_dir;
    private Double y_dir;
    private Double z_dir;
    private Bullet bullet;

    public Double getXcoord() {
        return xcoord;
    }

    public void setXcoord(Double xcoord) {
        this.xcoord = xcoord;
    }

    public Double getYcoord() {
        return ycoord;
    }

    public void setYcoord(Double ycoord) {
        this.ycoord = ycoord;
    }

    public Double getZcoord() {
        return zcoord;
    }

    public void setZcoord(Double zcoord) {
        this.zcoord = zcoord;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getX_dir() {
        return x_dir;
    }

    public void setX_dir(Double x_dir) {
        this.x_dir = x_dir;
    }

    public Double getY_dir() {
        return y_dir;
    }

    public void setY_dir(Double y_dir) {
        this.y_dir = y_dir;
    }

    public Double getZ_dir() {
        return z_dir;
    }

    public void setZ_dir(Double z_dir) {
        this.z_dir = z_dir;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
