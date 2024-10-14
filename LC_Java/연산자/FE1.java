package LC_Java.연산자;

import java.util.Scanner;

public class FE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.printf("sum %d%n" , a+b+c+d);
        System.out.printf("avg %d%n", (a+b+c+d)/4);
    }
}
