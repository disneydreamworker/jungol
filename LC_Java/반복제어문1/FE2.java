package LC_Java.반복제어문1;

import java.io.IOException;
import java.util.Scanner;

public class FE2 {
    //0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
    //0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
    //홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) throws IOException {
        int odd = 0;
        int even = 0;

        Scanner sc = new Scanner(System.in);

        int n = 1;
        boolean w = true;
        while (w) {
            n = (sc.nextInt());
            if (n == 0) w = false;
            if (n % 2 == 0) even++; else odd++;
        }
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
