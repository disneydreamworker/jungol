package LC_Java.반복제어문1;

import java.util.Scanner;

public class FE4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cnt=0;
            while (true) {
                int num = sc.nextInt();
                if (num == 0) break;
                if ((num%3!=0 && num%5!=0)) cnt++;
            }
            System.out.println(cnt);
        }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col + 1; j++) {
                System.out.printf("%d ", i + j);
            }
            System.out.println();
        }
    }
}

