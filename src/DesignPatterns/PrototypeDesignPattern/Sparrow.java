package DesignPatterns.PrototypeDesignPattern;

public class Sparrow extends Bird {
    public void setSound(String sound) {
        this.sound = sound;
    }

    private String sound = "Chu";

    public Sparrow() {}
    public Sparrow(Sparrow old) {
        super(old);
        this.sound = old.sound;
    }
    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
