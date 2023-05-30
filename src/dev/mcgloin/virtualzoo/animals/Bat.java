package dev.mcgloin.virtualzoo.animals;

public class Bat extends Animal {

    public Bat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.printf("A bat named %s is flying %n", getName());
    }
}
