package Day7;
import java.util.Scanner;

public class LineCompareUC {

            public static void compare(double L1, double L2){
                if (L1==L2){
                    System.out.println("Line1 = " + L1 );
                    System.out.println("Line2 = " + L2);
                    System.out.println("Line 1 and Line 2 line are equal");

                } else if (L1>L2) {
                    System.out.println("Line1: " + L1);
                    System.out.println("Line2: " + L2);
                    System.out.println("Line 1 is greater tha Line 2");
                }
                else{
                    System.out.println("Line1: " + L1);
                    System.out.println("Line2: " + L2);
                    System.out.println("Line 2 is greater than Line 1");
                }
            }
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

                compare(sum1,sum2);
            }
}
