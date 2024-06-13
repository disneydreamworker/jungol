package 연산자;

import java.util.Scanner;

public class SE7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean c = (a != 0);
        boolean d = (b != 0);

        System.out.printf("%b %b", c&&d, c||d);
    }
}
