package LC_Java.완전탐색;

import java.util.Scanner;

public class 완전탐색_241014_2875_대회or인턴 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //여학생 수
        int m = scanner.nextInt(); //남학생 수
        int k = scanner.nextInt(); //팀에서 빠질 수

        //2명 여 + 1명 남 : 1팀
        int cnt = 0;

        while (n >= 2 && m >= 1 && (n + m) >= k + 3) {
            n -= 2;
            m--;
            cnt++;
        }
//        for (int i = 0; i <= n+m-k; i+=2) {
//            if (m < 1) {
//                break;
//            }
//            m--;
//            cnt++;
//        }

        System.out.println(cnt);
    }
}
