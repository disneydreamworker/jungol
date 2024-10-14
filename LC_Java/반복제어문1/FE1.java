package LC_Java.반복제어문1;
import java.util.Scanner;
public class FE1 {
    //정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) System.out.print(i + " ");
    }
}
