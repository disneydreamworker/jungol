package 반복제어문3;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        String a = "*";
        for (int i = 1; i < 4; i++) {
            System.out.println(a.repeat(i));
        }
    }
}

class P3 {
    public static void main(String[] args) {
        String a = "*";
        for (int i = 1; i < 4; i++) {
            System.out.println(a.repeat(i));
        }
        for (int i = 3; i > 0; i--) {
            System.out.println(a.repeat(i));
        }
    }
}

class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = "*";
        for (int i = 1; i <= num; i++) {
            System.out.print(" ".repeat(num - i));
            System.out.println(s.repeat(i));

        }
    }
}
