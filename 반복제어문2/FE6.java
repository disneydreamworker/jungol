package 반복제어문2;

import java.util.Scanner;

public class FE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), count = 0;
        double sum = 0.0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("sum : " + (int) sum);
        System.out.printf("avg : %.1f", sum / count);
    }
}
//두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.
//
//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
