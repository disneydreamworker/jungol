package 반복제어문3;
//자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
//        주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
import java.util.Scanner;

public class FE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int re = 2 * n - 1; //5,3,1
        int blank = 0; //1,2
        boolean b = false;

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= blank; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= re; j++) {
                System.out.print("*");
            }

            if (i < n) {
                blank++;
                re -= 2;
            } else {
                blank--;
                re += 2;
            }
            System.out.println();
        }
    }
}