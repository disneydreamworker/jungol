package 반복제어문3;
import java.util.Scanner;
//정수 20 개를 입력받아서 그 합과 평균을 출력하되 0 이 입력되면 20개 입력이 끝나지 않았더라도 그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오.
//평균은 소수부분은 버리고 정수만 출력한다.(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)
public class FE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int a = 0;
        int sum = 0;
        for(n = 0; n < 20; n++){
            a = sc.nextInt();
            if(a == 0) break;
            sum += a;
        }
        System.out.printf("%d %d", sum, sum/n);
    }
}