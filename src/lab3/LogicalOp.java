package lab3;

public class LogicalOp {

    public int getHigherNumber(int first, int second, int third) {
        //        Given two numbers, see which one
//        is the greatest and print it


        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }

    public String checkNumberAndText(String text, int number){
        //Given a text input and a number input,
        // if the text is equal to “FastTrack”
        // AND the number is equal to or lower than 3,
        // print the text and the number.
        // If the text is not “FastTrack” AND the number is
        // equal to or higher than 4, print the number
        // and the text, in this order.

        if (text.equals("FastTrack") && number <= 3){
           return (text + number);
        }else if (!text.equals("FastTrack") && number >= 4){
           return (number + text);
        }


        return "";
    }

}
