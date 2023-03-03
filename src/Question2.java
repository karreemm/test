import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double h = sc.nextDouble();
        double v = d*d*h*h*(5.5/7.0);
        System.out.println(v);

    }
}
