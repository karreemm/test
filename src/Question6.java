import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        System.out.println("inout a degree in fahrenheit");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (5.0/9.0)*(f-32);
        System.out.println(f + "degree fahrenheit is equal to" + c + "in celsius");
    }
}
