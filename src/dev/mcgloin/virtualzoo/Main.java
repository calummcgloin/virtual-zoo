package dev.mcgloin.virtualzoo;

import dev.mcgloin.virtualzoo.animals.*;

public class Main {

    public static void main(String[] args) {
        Zoo myFirstZoo = new Zoo();

        Animal curiousGeorge = new Monkey("George");
        curiousGeorge.eat("banana");
        curiousGeorge.move();
        myFirstZoo.addAnimal(curiousGeorge);
        System.out.println();

        Animal flipper = new Dolphin("Flipper");
        flipper.eat("fish");
        flipper.move();
        myFirstZoo.addAnimal(flipper);
        System.out.println();

        Animal bruceWayne = new Bat("Bruce");
        bruceWayne.eat("Caviar");
        bruceWayne.move();
        myFirstZoo.addAnimal(bruceWayne);
        System.out.println();

        Animal pingu = new Penguin("Pingu");
        pingu.eat("fish");
        pingu.move();
        myFirstZoo.addAnimal(pingu);
        System.out.println();

        Animal donald = new Duck("Donald");
        donald.eat("bread");
        donald.move();
        myFirstZoo.addAnimal(donald);
        System.out.println();

        myFirstZoo.displayAnimals();
    }

}
