package animalRescue;

public class Animal {
    private String name;
    private int age;
    private String color;
    private int heightInCm ;
    private float weight ;
    private boolean male;


    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void speak(){
        System.out.println("speaking.");
    }

    public void eat(){
        System.out.println("eating");
    }

    public void run(){
        System.out.println("running");
    }

    public void sleep(){
        System.out.println("zzzz");
    }
}
