package LC_Java.반복제어문3;

//1부터 100까지의 정수 중 한 개를 입력받아 100 보다 작은 배수들을 차례로 출력하다가 10 의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
import java.util.Scanner;
public class FE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            if (a*i>100) break;
            System.out.printf("%d ", a*i);
            if((a*i)%10==0) break;
        }
    }
}