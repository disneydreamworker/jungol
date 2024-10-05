package LC_Java.선택제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SE7 {
//    영문 대문자를 입력받아 'A'이면 “Excellent”, 
//            'B'이면 “Good”, 
//            'C'이면 “Usually”, 
//            'D'이면 “Effort”, 
//            'F'이면 “Failure”, 
//    그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char c = (st.nextToken().charAt(0));

        if (c == 'A') System.out.println("Excellent");
        else if (c == 'B') System.out.println("Good");
        else if (c == 'C') System.out.println("Usually");
        else if (c == 'D') System.out.println("Effort");
        else if (c == 'F') System.out.println("Failure");
        else System.out.println("error");

        br.close();

    }
}
