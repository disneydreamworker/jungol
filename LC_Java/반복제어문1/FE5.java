package LC_Java.반복제어문1;

import java.io.IOException;
import java.util.Scanner;

public class FE5 {
    //삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
    //(넓이는 반올림하여 소수 첫째자리까지 출력한다.)
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean b = true;

        while (b) {
            System.out.print("Base = ");
            int base = sc.nextInt();
            System.out.print("Height = ");
            int height = sc.nextInt();
            System.out.printf("Triangle width = %.1f%n", (double) base * height / 2);
            System.out.println("Continue?");
            char y = sc.next().charAt(0);
            if (y == 'y') continue; else if (y=='Y') continue; else b = false;
        }
    }
}
//Base = 11
//Height = 5
//Triangle width = 27.5
//Continue? Y
//        Base = 10
//Height = 10
//Triangle width = 50.0
//Continue? N