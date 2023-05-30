package dev.mcgloin.virtualzoo.animals;

public class Dolphin extends Animal {

    public Dolphin(String name) {
        super(name);
    }

    @Override
   public void move() {
        System.out.printf("A dolphin named %s is swimming %n", getName());
    }
}
