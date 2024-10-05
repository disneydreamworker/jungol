package LC_Java.연산자;

import java.util.Scanner;

public class SelfExamination1 {
    public static void main(String[] args) {
    // 세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
    Scanner scanner = new Scanner(System.in);

    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

    System.out.println("sum : " + (num1 + num2 + num3));
    System.out.println("avg : " + (int)(num1 + num2 + num3)/3);
    }
}
