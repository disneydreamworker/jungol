package LC_Java.반복제어문1;

import java.util.Scanner;

public class SE3 {
    //한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지 출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.
    //
    //* 입출력예의 진한글씨는 출력값입니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("number? ");
            a = sc.nextInt();
            if (a == 0) break;

            if (a > 0) System.out.println("positive integer");
            else System.out.println("negative number");
        }
    }

}
