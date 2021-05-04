package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {

        PrintArray pa = new PrintArray();
        ReadInput read = new ReadInput();
        int[] array = new int[]{1, 2, 3, 4};

//        pa.printIndexValueFromArray(array);


//        System.out.println("Have a good day!");

        String expected = "ceva";
        String actual = read.getString();
        if (actual.equals(expected)){
            System.out.println("success");
        }else
            System.out.println("not success");
    }
}
