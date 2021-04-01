package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        System.out.println(rex.breed);
        System.out.println(rex.weight);
        rex.eat(1);
        System.out.println(rex.weight);

        Girl anna = new Girl();
    }
}
