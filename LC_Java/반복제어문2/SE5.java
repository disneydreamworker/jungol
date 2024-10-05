package LC_Java.반복제어문2;
//10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class SE5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int m3 = 0, m5 = 0;
        for (int i = 0; i < 10; i++) {
            a = sc.nextInt();
            if (a % 3 == 0) {
                m3++;
            } else if (a % 5 == 0) {
                m5++;
            } else if (a % 3 == 0 && a % 5 == 0) {
                m3++;
                m5++;
            } else continue;
        }
        System.out.println("Multiples of 3 : " + m3);
        System.out.println("Multiples of 5 : " + m5);
    }
}