package DesignPatterns.StructuralDesignPattern.Flyweight.Before;

import java.util.ArrayList;
import java.util.List;
public class Client {
    public static void main(String[] args) {
        List<Bullet> bullets = new ArrayList<>();
        //end up taking too much memory

        for(int i = 0; i < 200000; i++) {
            bullets.add(new Bullet());
        }
    }
}
