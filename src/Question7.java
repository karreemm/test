import java.util.Scanner;
import java.lang.Math;

public class Question7 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       double x2 = sc.nextDouble();
       double y2 = sc.nextDouble();
       double d = Math.sqrt(Math.pow((y2-y1), 2) + Math.pow((x2 - x1) , 2));
        System.out.println(d);


    }
}
