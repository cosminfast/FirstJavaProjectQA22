package lab3;

public class Lab3 {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
       int x = op.getHigherNumber(6,5,1);
//        System.out.println(x + " este cel mai mare! ");

        String a =op.checkNumberAndText("FastTrec", 3);
        System.out.println(a);
    }

}
