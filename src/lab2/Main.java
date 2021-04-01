package lab2;

public class Main {

    static int memberVariable1 = 2;
    static int memberVariable2 = 3;

    public static void main(String[] args) {
        printName("Cosmin");
        int i = sum(memberVariable1, memberVariable2);
        int ii = sum(3, 5);
        System.out.println(i);
        System.out.println(substract(memberVariable1, memberVariable2, 5));
    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }


    public static float substract(float first, float second, float third) {
        float result = first - second - third;
        return result;
    }

    public static void printName(String name) {
        System.out.println("Hello " + name + "!");
    }

}
