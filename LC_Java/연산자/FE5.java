package LC_Java.연산자;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FE5 {
    public static void main(String[] args) {
        //민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
        //
        //(JAVA는 1 이면 true, 0 이면 false를 출력한다.)

        Scanner scanner = new Scanner(System.in);
        int minsuHeight = scanner.nextInt();
        int minsuWeight = scanner.nextInt();
        int kiHeight = scanner.nextInt();
        int kiWeight = scanner.nextInt();

        boolean result = (minsuHeight > kiHeight) && (minsuWeight > kiWeight);

        System.out.println(result);
    }
}