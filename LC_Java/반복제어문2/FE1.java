package LC_Java.반복제어문2;

import java.util.Scanner;

//10 이하의 자연수 n을 입력받아 "JUNGOL​"을 n번 출력하는 프로그램을 작성하시오.
public class FE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) System.out.println("JUNGOL");
    }
}