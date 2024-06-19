package 반복제어문2;

import java.util.Scanner;

public class FE9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.printf("(%d, %d) ", i, j);
            }
            System.out.println();
        }
    }
}
//        (1, 1) (1, 2) (1, 3) (1, 4)
//        (2, 1) (2, 2) (2, 3) (2, 4)
//        (3, 1) (3, 2) (3, 3) (3, 4)
//        (4, 1) (4, 2) (4, 3) (4, 4)
//정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.