package LC_Java.반복제어문3;

import java.util.Scanner;
public class SE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String star = "*";
        for(int i = 1; i <= a; i++){
            System.out.println(star.repeat(i));
        }
    }
}
//자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.