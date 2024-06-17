package 반복제어문3;

import java.util.Scanner;

public class SE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n;
        int p = 0;
        char a = 'A';

        for (int i = 1; i <= n * (n + 1) / 2; i++) {
            System.out.print(a);
            a++;
            p++;

            if (p == cnt) {
                System.out.println();
                cnt--;
                p = 0;
            }
        }
    }
}

//a 1 2 3 4
//b c 5 6 7
//d e f 8 9
//g h i j 10

class Main {
    public static void main(String[] args) {
        char c = 'a'; // 소문자 시작
        int num = 1; // 숫자 시작
        int cp = 0; //소문자 출력 카운트
        int nump = 0; //숫자 출력 카운트
        int cnt = 1;
        int numcnt = 1;

        for (int i = 1; i <=10; i++) {
            System.out.print(c + " "); //a
            c++; //b
            cp++; //1
            if (cp == cnt) {
                cp=0;
                cnt++;

                for (int j=5-numcnt; j>=1;j--) {
                    System.out.print(num + " ");
                    num++;
                }
                numcnt++;
                System.out.println();
            }
        }
    }
}


