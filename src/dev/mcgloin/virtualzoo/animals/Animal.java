package dev.mcgloin.virtualzoo.animals;

public abstract class Animal {

    private final String name;

    Animal(String name) {
        this.name = name;
    }

    public void eat(String foodString) {
        System.out.printf("%s is eating %s %n", name, foodString);
    }

    public String getName() {
        return name;
    }

    public abstract void move();
}
