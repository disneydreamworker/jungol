package LC_Java.반복제어문3;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int num = 1;
        int p = 0;

        for (int i = 1; i<=n * (n+1)/2; i++) {
            System.out.print(num + " ");
            num++;
            p++;

            if (p == cnt) {
                System.out.println();
                cnt++;
                p = 0;
            }
        }
    }
}
