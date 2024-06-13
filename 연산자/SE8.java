package 연산자;

import java.util.Scanner;

public class SE8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); int b = scan.nextInt(); int c = scan.nextInt();

        System.out.printf("%b %b", (a>b)&&(a>c), (a==b)&&(a==c));
    }
}
