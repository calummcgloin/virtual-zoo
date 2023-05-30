package dev.mcgloin.virtualzoo;

import dev.mcgloin.virtualzoo.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> residentAnimals;

    public Zoo() {
        this.residentAnimals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        residentAnimals.add(animal);
    }

    public void displayAnimals() {
        System.out.println("***** Animals in zoo ******");
        for (Animal animal : residentAnimals) {
            System.out.println(animal.getName());
        }
    }

}
