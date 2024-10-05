package LC_Java.선택제어문;

import java.util.Scanner;

public class SE9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a, b);
        min = Math.min(min, c);
        System.out.println(min);
    }
}
