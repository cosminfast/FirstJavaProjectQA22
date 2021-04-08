package animalRescue.animals;

import animalRescue.Animal;

public class Cat extends Animal {

    private boolean fur;

    public boolean hasFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public void purr(){
        System.out.println("Purring");
    }
}
