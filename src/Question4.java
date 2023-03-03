import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = n / 365;
        int m = (n -y*365)/30;
        int d = (n- y*365 -m*30);
        System.out.println(n +"days =" + y + " years +" + m + "months + " + d +"days" );

    }
}
