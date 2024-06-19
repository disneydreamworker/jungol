package 반복제어문3;

import java.util.Scanner;

public class SE1 {
    //자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        int cnt = 0;

        for (int i = 1; i < a; i += 2) {
            result += i;
            cnt++;

            if (result >= a) {
                break;
            }
        }

        System.out.println(cnt + " " + result);
    }
}
