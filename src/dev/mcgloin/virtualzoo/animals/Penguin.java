package dev.mcgloin.virtualzoo.animals;

public class Penguin extends Animal {

    public Penguin(String name) {
        super(name);
    }

    @Override
   public void move() {
        if (isOnLand()) {
            System.out.printf("A penguin named %s is walking %n", getName());
        } else {
            System.out.printf("A penguin named %s is swimming %n", getName());
        }
    }


    /*
        This method is here for the purpose of this exercise to demonstrate how the move implementation might differ between animals.
     */
    private boolean isOnLand() {
        return false;
    }
}
