package LC_Java.반복제어문2;

import java.util.Scanner;

class FE8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.printf("%d ", i * j);
            }
            System.out.println();
        }
    }
}

//행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.