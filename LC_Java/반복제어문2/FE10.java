package LC_Java.반복제어문2;

import java.util.Scanner;

public class FE10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();


        if (a > b) {

            for (int i = 1; i < 10; i++) {
                for (int j = a; j >= b; j--) {
                    System.out.printf("%d * %d =%3d   ", i, j, i * j);
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i < 10; i++) {
                for (int j = a; j <= a; j++) {
                    System.out.printf("%d * %d =%3d   ", i, j, i * j);
                }
                System.out.println();
            }
        }

    }
}
//2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
//단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.
//구구단 사이의 공백은 3칸이다.

//        5 * 1 =  5   4 * 1 =  4   3 * 1 =  3
//        5 * 2 = 10   4 * 2 =  8   3 * 2 =  6
//        5 * 3 = 15   4 * 3 = 12   3 * 3 =  9
//        5 * 4 = 20   4 * 4 = 16   3 * 4 = 12
//        5 * 5 = 25   4 * 5 = 20   3 * 5 = 15
//        5 * 6 = 30   4 * 6 = 24   3 * 6 = 18
//        5 * 7 = 35   4 * 7 = 28   3 * 7 = 21
//        5 * 8 = 40   4 * 8 = 32   3 * 8 = 24
//        5 * 9 = 45   4 * 9 = 36   3 * 9 = 27