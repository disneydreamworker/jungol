package LC_Java.입력;

import java.util.Scanner;

public class SE6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("height = ");
        int height = scanner.nextInt();
        System.out.printf("Your height is %dcm.%n", height);
    }
}