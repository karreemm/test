import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number of minutes");
        int m = sc.nextInt();
        int y = m / (60*24*365);
        int d = (m - y* (60*24*365)) / (60*24);
        System.out.println(m + "minutes is approximately " + y + " years + " + d + " days ");



    }
}
