package lab2;

public class Main {

    static int memberVariable1 = 2;
    static int memberVariable2 = 3;

    public static void main(String[] args) {
//        printName("Cosmin");
//        int i = sum(memberVariable1, memberVariable2);
//        int ii = sum(3, 5);
//        System.out.println(i);
//        System.out.println(substract(memberVariable1, memberVariable2, 5));

//        C = 5/9 * (F -32)
        System.out.println("Celsius value is: " + getCelsius(100));
    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }


    public static float substract(float first, float second, float third) {
        return first - second - third;
    }

    public static void printName(String name) {
        System.out.println("Hello " + name + "!");
    }


    public static void printJava() {
        String j = "     J       A    A  V   V     A\n" +
                "     J        A  A    VV      A\n" +
                "";
        System.out.println(j);
    }

    public static float getCelsius(float farenheit) {
        return 5 / 9f * (farenheit - 32);
    }

}
