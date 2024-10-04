package LC_Java.반복제어문3;

import java.util.Scanner;

public class FE6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //3
        int blank = n*2-2; //4 => 3은 4칸 필요, 4는 6칸 필요, 5는 8칸
        int p = 1;  // print되는 숫자 1부터 시작, 마지막 줄은 n까지 출력
        //j = blank는 4부터 시작해서 2씩 감소함. 마지막 줄은 0

        for(int i = 0; i < n; i++) { // n번 반복:3번 반복함 i
            System.out.print(" ".repeat(blank));
            blank -=2; //blank 2감소
            if (blank < 0) {
                blank = 0;
            }
            for(int j =1; j <= p; j++) {
                System.out.print(j + " ");
            }
            p++;
            System.out.println(); //줄바꿈
        }
    }
}