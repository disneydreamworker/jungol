package Beginner.도형만들기2;

import java.util.Scanner;

//삼각형의 높이 n을 입력 받은 후 출력 예제과 같은 삼각형 형태로 출력하는 프로그램을 작성하시오.
//입력된 데이터가 주어진 범위를 벗어나면 "INPUT ERROR!"을 출력한다.
//'*'과 '*' 사이에는 공백이 없다.
//****
//        ***
//        **
//        *
//        **
//        ***
//        ****
public class 별삼각형2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 1 || n > 100) {
            System.out.println("INPUT ERROR!");
        } else if (n % 2 != 1) {
            System.out.println("INPUT ERROR!");
        } else {
            int star = (n / 2) + 1; // 7->4
            int blank = star;

            for (int j = star; j >= 1; j--) {
                System.out.print(" ".repeat(star - blank)); //0,1,2,3
                System.out.println("*".repeat(j)); //4,3,2,1
                blank--;
            }
            blank=star-1;
            for(int i = 2; i <=star; i++) {
                System.out.print(" ".repeat(blank)); //3유지
                System.out.println("*".repeat(i)); //2,3,4
            }

        }
    }
}
