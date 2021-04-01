public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world!");
        byte myByte = 127;
        int myInt = 2123432123;
        long myLong = 12312312312311L;
        float myFloat = 12312312.123F;
        double myDouble = 12312312312.1231231;
        String myString = "akjsd sdkaskd 123123 $#";
        System.out.println(myByte+myInt);

        double result = 5+6;
        double result2 = 5+6;
        System.out.println(result);

        int x = 3;
        x++;
        System.out.println(++x);
        System.out.println(x);
        x += 2;
        System.out.println(x);
        x -= 2;
        System.out.println(x);

        System.out.println(x % 2 == 0);
        System.out.print("Rezultatul compararii este: ");
        System.out.println(x % 2 == 0 && x <= 10 && x > -10);
        System.out.print("Rezultatul compararii cu SAU este: ");
        System.out.println(x % 2 == 0 || x <= 4 || x > -10);

        x = 2;
        x+=x+=x++ + ++x;

        System.out.println("x este egal cu: " + x);

        String text = "rezultatul este: ";
        System.out.println(text + (2 + 3));

    }
}
