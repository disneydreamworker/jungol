package LC_Java.반복제어문2;

import java.util.Scanner;

//정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.
public class FE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), sum = 0;

        for (int i = 1; i <= a; i++) if (i % 5 == 0) sum += i;
        System.out.println(sum);
    }

}