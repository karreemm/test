import java.util.Scanner;
import java.lang.Math;
public class Question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1st integer");
        int x1 = sc.nextInt();
        System.out.println("input 2nd integer");
        int x2 = sc.nextInt();
        int sum = x1 + x2;
        int diff = x1-x2;
        int pro = x1 * x2;
        double ava = (x1 + x2) / 2.0;
        int MAX = Math.max(x1, x2);
        int MIN = Math.min(x1, x2);
        System.out.println("sum of two integers is " + sum);
        System.out.println("difference of two integers is " + diff);
        System.out.println("product of two integers is " + pro);
        System.out.println("avarage of two integers is " + ava);
        System.out.println("max integer is" + MAX);
        System.out.println("min integer is " + MIN);



    }
}
