package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("Rex");
        rex.setHeightInCm(145);

        Animal animal = new Animal();


        System.out.println("Pe catelul meu il cheama "+ rex.getName() + " si are "+ rex
        .getHeightInCm() + " cm inaltime.");

        Dog tom = new Dog();
        tom.setName("Tom");
        tom.setHeightInCm(20);
        System.out.println("Pe catelul meu il cheama "+ tom.getName() + " si are "+ tom
                .getHeightInCm() + " cm inaltime.");
    }
}
