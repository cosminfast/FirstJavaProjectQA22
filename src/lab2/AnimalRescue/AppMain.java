package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        System.out.println(rex.breed);
        System.out.println(rex.weight);
        rex.eat(1);
        rex.name = "Rock";
        System.out.println(rex.weight);

        Dog rex2 = new Dog();
        rex2.name = "asd";
        System.out.println(rex2.name);
        Girl girl1 = new Girl();
    }
}
