package animalRescue;

public class Dog extends Animal {

    private String fur;

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public void sleep() {
        System.out.println("zzz");
    }
}
