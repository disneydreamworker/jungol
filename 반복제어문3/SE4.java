package 반복제어문3;

import java.util.Scanner;

public class SE4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = "*";
        for (int i = num; i >= 1; i--) {
            System.out.print(" ".repeat(num - i));
            System.out.println(s.repeat(i));

        }
    }
}

