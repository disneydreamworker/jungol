package 반복제어문3;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        String s = "*";
        for (int i = 1; i <= 9 ; i+=2) {
            System.out.print(" ".repeat((9-i)/2));
            System.out.println(s.repeat(i));
        }
    }
}

class Main {
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
//공백은
//0
//1
//2
// -3 -i
