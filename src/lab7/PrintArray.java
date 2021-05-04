package lab7;

public class PrintArray {

    public void printIndexValueFromArray(int[] array){
        ReadInput read = new ReadInput();
        boolean repeat = false;
        do {
            try {
                System.out.println("The value from array is: " + array[read.getInt()]);
                repeat = false;
            } catch (ArrayIndexOutOfBoundsException easdasd) {
                repeat = true;
                System.out.println("The given number is not a valid array position.");
            }
        } while (repeat == true);

    }
}
