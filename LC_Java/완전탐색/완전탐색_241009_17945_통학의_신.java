package LC_Java.완전탐색;


//문제
//x2  + 2Ax + B = 0 의 두 계수 A, B가 주어진다. A, B는 정수이며, 이 방정식의 근은 항상 정수이다. (-1000 ≤ A, B ≤ 1000)
//첫 번째 줄에 방정식의 근들을 모두 공백으로 분리해 오름차순으로 출력한다. 중근일 경우 하나만 출력한다.

import java.util.Scanner;

public class 완전탐색_241009_17945_통학의_신 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = -3000 ; i < 3001 ; i++) {
            if (((i * i) + (2 * a * i) + b) == 0) {
                System.out.println(i);
            }
        }
    }
}
