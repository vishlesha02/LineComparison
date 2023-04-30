package Day7;
import java.util.Scanner;

public class LineCompareUC {

        public static void main(String[] args) {
            double sum1=0 , sum2=0;
            Scanner sc = new Scanner(System.in);
            for (int i = 1; i <= 2 ; i++) {
                System.out.println("Enter the value for Line "+ i);
                System.out.print("Enter value of x1 = ");
                int x1 = sc.nextInt();

                System.out.print("Enter value of x2 = ");
                int x2 = sc.nextInt();

                System.out.print("Enter value of y1 = ");
                int y1 = sc.nextInt();

                System.out.print("Enter value of y2 = ");
                int y2 = sc.nextInt();

                double x, y;
                x = (x2 - x1) * (x2 - x1);
                y = (y2 - y1) * (y2 - y1);

                if (i==1)
                {
                    sum1 = Math.sqrt(x + y);
                }
                else{
                    sum2 = Math.sqrt(x + y);
                }
            }
            String sumofLine1= String.valueOf(sum1);
            String sumofLine2= String.valueOf(sum2);
            if (sumofLine1.equals(sumofLine2)) {
                System.out.println("Both lines are equal");
            }
            else
            {
                System.out.println("Both lines are not equal");
            }
        }
}
