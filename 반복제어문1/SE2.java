package 반복제어문1;

import java.util.Scanner;

public class SE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int i = 1;
        while (i <= num) {
            result += i;
            i++;
        }
        System.out.println(result);
    }
}