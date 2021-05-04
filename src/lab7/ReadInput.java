package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInput {

    public int getInt(){
        int numberFromUser = 0;
        boolean repeat = false;
        do {
            System.out.print("Enter a number: ");
            try {
                Scanner scan = new Scanner(System.in);
                 numberFromUser = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException easdadasd){
                repeat = true;
                System.out.println("Invalid provided value. NAN! Please try again.");
            }
        } while (repeat == true);
        return numberFromUser;
    }

    public String getString(){
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter a string value: ");
        return scan.nextLine();
    }
}
