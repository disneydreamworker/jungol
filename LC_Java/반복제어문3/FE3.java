package LC_Java.반복제어문3;
//자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
//주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.

import java.util.Scanner;
public class FE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "*";
        for(int i = 1; i <a + 1; i++) {
            System.out.println(s.repeat(i));
        }
        for(int i = a-1; i > 0; i--) {
            System.out.println(s.repeat(i));
        }
    }
}