package LC_Java.연산자;
import java.util.Scanner;
public class FE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println(++a + " " + b--);
        System.out.println(a + " " + b);
    }
}
