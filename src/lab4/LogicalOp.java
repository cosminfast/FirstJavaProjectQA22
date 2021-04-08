package lab4;

public class LogicalOp {

    public void printToHundred(int number){
        for (int i = number; i <= 100; i++){
            System.out.println("The number is: "+i);
        }
    }

    public float getAverageFromInterval(int start, int finish){
        lab3.LogicalOp op = new lab3.LogicalOp();
        int small = op.getLowerNumber(start,finish);
        int bigger = op.getHigherNumber(start,finish);

        float sum = 0;
        int count=0;
        for (int i = small; i <= bigger; i++){
            sum += i;
            count++;
        }
        return sum / count;
    }
}
