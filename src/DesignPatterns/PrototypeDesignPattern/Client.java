package DesignPatterns.PrototypeDesignPattern;
import java.util.ArrayList;
import java.util.List;
public class Client {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.setName("koyal");
        b1.setColor("Blue");
        b1.setWeight(20);

        Crow c1 = new Crow();
        c1.setColor("Black");
        c1.setSound("Kaw");

        Sparrow s1 = new Sparrow();
        s1.setSound("Koo");
        s1.setWeight(23);

        List<Bird> birds = List.of(
                b1, c1, s1
        );

        List<Bird> children = new ArrayList<>();

        for(Bird parent: birds) {
            children.add(parent.clone());
        }
        System.out.println("Done");

        Crow goodSoundCrow = new Crow();
        goodSoundCrow.setSound("kookoo");
        Sparrow badSoundSparrow = new Sparrow();
        badSoundSparrow.setSound("kaukau");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("goodSoundCrow", goodSoundCrow);
        birdRegistry.registerBird("badSoundSparrow", badSoundSparrow);

        List<String> queries = List.of(
                "goodSoundCrow",
                "badSoundSparrow"
        );

        List<Bird> copyBirds = new ArrayList<>();
        for(String type: queries) {
            copyBirds.add(birdRegistry.getBird(type));
        }
        System.out.println("Done");
    }
}
