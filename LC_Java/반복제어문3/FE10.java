package LC_Java.반복제어문3;

import java.util.Scanner;
public class FE10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (p > 9) p = 1;
                System.out.print(p + " ");
                p += 2;
            }
            System.out.println();
        }
    }
}
//자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오. 10 미만의 홀수만 출력하시오.
//주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
