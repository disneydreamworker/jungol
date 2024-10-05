package LC_Java.반복제어문3;

import java.util.Scanner;

public class SE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n;
        int p = 0;
        char a = 'A';

        for (int i = 1; i <= n * (n + 1) / 2; i++) {
            System.out.print(a);
            a++;
            p++;

            if (p == cnt) {
                System.out.println();
                cnt--;
                p = 0;
            }
        }
    }
}
//ABC
//DE
//F

//a 1 2 3 4
//b c 5 6 7
//d e f 8 9
//g h i j 10


