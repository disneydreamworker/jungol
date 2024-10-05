package LC_Java.반복제어문3;

import java.util.Scanner;
class SE5 {
    public static void main(String[] args) {
        String s = "*";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(n-i));
            System.out.print(s.repeat((i*2)-1));
            System.out.println(" ".repeat(n-i));
        }
    }
}