package LC_Java.반복제어문3;

import java.util.Scanner;

public class FE9 {
    public static void main(String[] args) {
//#
//# #
//# # #
//  # #
//    #
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //3
        int num = 1; //0,1,2...
        String blank = " "; // 0,2,4,6...
        for(int i = 0; i < n; i++) { //총 3줄 출력
            for (int b = 0;  b < i*2; b++) {
                System.out.print(" ");
            }
            for(int j =0; j<n-i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
