package 반복제어문3;

import java.util.Scanner;

public class FE7 {
    public static void main(String[] args) {
//        A B C
//        D E 0
//        F 1 2

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //3
        int num = 0; //0,1,2...
        char a = 'A'; //ABC...

        for(int i = 0; i < n; i++) {
            for (int c = n-i; c > 0; c--) {
                System.out.print(a + " ");
                a++;
            }

            for(int j =1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
