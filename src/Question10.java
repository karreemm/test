import java.util.Scanner;

public class Question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("inout distance in meters");
        double d  = sc.nextDouble();
        System.out.println("input hours");
        double h = sc.nextDouble();
        System.out.println("input minutes");
        double m = sc.nextDouble();
        System.out.println("input seconds");
        double s = sc.nextDouble();
        double z1 = d / (s + m*60.0 + h*3600.0);
        double z2 = z1 * (18.0/5.0);
        System.out.println("your speed in meters / second is" + z1 );
        System.out.println("your speed in kilometers / hour is " + z2);
    }
}
