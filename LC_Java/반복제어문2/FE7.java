package LC_Java.반복제어문2;

import java.util.Scanner;

public class FE7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) System.out.print((i * a) + " ");
    }
}
//한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.