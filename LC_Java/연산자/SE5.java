package LC_Java.연산자;

import java.util.Scanner;

public class SE5 {
    public static void main(String[] args) {
//        두 개의 정수를 입력받아서, 
//
//        첫 번째 줄에는 두 정수의 값이 같으면 1 아니면 0을 출력하고, 
//
//        두 번째 줄에는 같지 않으면 1 같으면 0을 출력하는 프로그램을 작성하시오.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // System.out.println(a==b?true:false);
        // System.out.println(a!=b?false:true);
        System.out.println(a == b);
        System.out.println(a != b);


    }
}
