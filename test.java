public class test {

    public static void main(String[] args) {
        
        int travis = 9;
        int taylor = 2;
        int carti = 10;
        int drake = 8;

        computeAverageOfHighest(carti, travis, taylor, drake);
    }

    public static void computeAverageOfHighest(int a, int b, int c, int d) {
        double average;

        //Statement 1
        if (a <= b && a <= c && a <= d) {
            average = (b + c + d) / 3.0;
            System.out.println("Your music score is " + average);
        }
        //Statement 2
        else if (b <= a && b <= c && b <= d) 
        {
            average = (a + c + d) / 3.0;
            System.out.println("Your music score is " + average);
        } 
        //Statement 3
        else if (c <= a && c <= b && c <= d) 
        {
            average = (a + b + d) / 3.0;
            System.out.println("Your music score is " + average);
        }
        //Statement 4
        else 
        {
            average = (a + b + c) / 3.0;
            System.out.println("Your music score is " + average);
        }

        
    }
}
