package Day7;
import java.util.Scanner;

public class LineCompareUC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x1 = ");
        int x1=sc.nextInt();

        System.out.print("Enter value of x2 = ");
        int x2=sc.nextInt();

        System.out.print("Enter value of y1 = ");
        int y1=sc.nextInt();

        System.out.print("Enter value of y2 = ");
        int y2=sc.nextInt();

        double x,y;
        x=(x2-x1)*(x2-x1);
        y=(y2-y1)*(y2-y1);

        double sum= Math.sqrt(x+y);
        System.out.println("Length = " + sum);
    }
}
