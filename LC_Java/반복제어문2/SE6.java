package LC_Java.반복제어문2;

import java.util.Scanner;
public class SE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) sum += sc.nextInt();
        System.out.printf("avg : %.1f\n", sum/n);
        if(sum/n >= 80) System.out.println("pass");
        else System.out.println("fail");
    }
}