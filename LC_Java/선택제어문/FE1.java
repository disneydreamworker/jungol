package LC_Java.선택제어문;

import java.util.Scanner;

public class FE1 {
    public static void main(String[] args) {
        //두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(a,b)-Math.min(a,b));
    }
}
