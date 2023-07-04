package DesignPatterns.PrototypeDesignPattern;

public class Crow extends Bird {
    public void setSound(String sound) {
        this.sound = sound;
    }

    private String sound = "Kaw";

    public Crow() {}
    public Crow(Crow old) {
        super(old);
        this.sound = old.sound;
    }
    public Crow clone() {
        return new Crow(this);
    }
}
