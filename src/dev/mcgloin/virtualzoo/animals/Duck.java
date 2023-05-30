package dev.mcgloin.virtualzoo.animals;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
   public void move() {
        if (isOnLand()) {
            System.out.printf("A duck named %s is walking %n", getName());
        } else if (isAirborne()) {
            System.out.printf("A duck named %s is flying %n", getName());
        } else {
            System.out.printf("A duck named %s is swimming %n", getName());
        }
    }

    /*
        This method is here for the purpose of this exercise to demonstrate how the move implementation might differ between animals.
     */
    private boolean isAirborne() {
        return true;
    }

    /*
        This method is here for the purpose of this exercise to demonstrate how the move implementation might differ between animals.
     */
    private boolean isOnLand() {
        return false;
    }

}
