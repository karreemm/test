import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x / 60;
        double z = x % 60.0;
        System.out.println(x + "minute =" + y + "hour + " + z + "minute ");

    }
}
