import java.util.Scanner;
import java.lang.Math;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = x / y;
        System.out.println("the number og garages needed is" + Math.ceil(z));
    }
}
