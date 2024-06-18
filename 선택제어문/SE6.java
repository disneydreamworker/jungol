package 선택제어문;

import java.util.Scanner;

public class SE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        int age = sc.nextInt();
        if (age < 18) {
            if (s == 'M') System.out.println("BOY");
            else System.out.println("GIRL");
        } else {
            if (s == 'M') System.out.println("MAN");
            else System.out.println("WOMAN");
        }
    }
}