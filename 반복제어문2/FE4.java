package 반복제어문2;


//100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)

import java.util.Scanner;

public class FE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) sum += sc.nextInt();
        double avg = (double) sum / a;
        System.out.printf("%.2f", avg);
    }
}