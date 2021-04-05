package AnimalRescue;

public class Dog {

    private String breed ;
    private int age ;
    private String color;
    private float weight ;
    private int heightInCm ;
    private  String name ;

    public String getName(){
        return name;
    }

    public void setName(String name){
      this.name = name;
    }

    public void setHeightInCm(int heightInCm){
        this.heightInCm = heightInCm;
    }

    public int getHeightInCm(){
        return heightInCm;
    }

    public void bark(){
        System.out.println("Ham!");
    }

    public void eat(int value){
        weight +=value;
    }

    public void sleep(){
        System.out.println("ZzzZZzz snores");
    }

}
