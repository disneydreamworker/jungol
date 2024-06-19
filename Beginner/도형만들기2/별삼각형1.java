package Beginner.도형만들기2;

//삼각형의 높이 n과 종류 m을 입력 받은 후 다음과 같은 삼각형 형태로 출력하는 프로그램을 작성하시오.
//        삼각형의 크기 n(n의 범위는 100 이하의 자연수)과 종류 m(m은 1부터 3사이의 자연수)을 입력받는다.
//        출력
//        위에서 언급한 3가지 종류를 입력에서 들어온 높이 n과 종류 m에 맞춰서 출력한다.
//        입력된 데이터가 주어진 범위를 벗어나면 "INPUT ERROR!"을 출력한다.

import java.util.Scanner;

public class 별삼각형1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        if (n<1||n>100) { System.out.println("INPUT ERROR!");}
        else if(m !=1 &&m!=2&&m!=3){
            System.out.println("INPUT ERROR!");
        }
        else {
            if (m==1) {
                for (int i = 1; i <= n; i++) System.out.println("*".repeat(i));
            }
            if (m==2) {
                for (int i = n; i >= 1; i--) System.out.println("*".repeat(i));
            }
            if(m==3) {
                int star = 1;
                for (int i = 1; i <= n; i++) {
                    System.out.print(" ".repeat(n - i));
                    System.out.println("*".repeat(star));
                    star += 2;
                }
            }
        }
    }
}

