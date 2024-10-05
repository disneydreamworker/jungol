package LC_Java.선택제어문;

import java.io.*;
import java.util.StringTokenizer;

public class SE3 {
    public static void main(String[] args) throws IOException {
//        나이를 입력받아 20살 이상이면 "adult"라고 출력하고 그렇지 않으면 몇 년후에 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int age = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(age >= 20 ? "adult" : String.format("%d years later", 20 - age));

        bw.flush();
        bw.close();
        br.close();
    }
}
