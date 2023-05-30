package dev.mcgloin.virtualzoo.animals;

public class Monkey extends Animal {

    public Monkey(String name) {
        super(name);
    }

    @Override
   public void move() {
        System.out.printf("A monkey named %s is walking %n", getName());
    }

}
