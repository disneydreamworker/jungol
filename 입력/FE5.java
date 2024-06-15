package 입력;

import java.io.*;
import java.util.StringTokenizer;

class FE5 {
    public static void main(String[] args) {
        //실수의 yard(야드)를 입력받아 cm(센티미터)로 환산하여 입력값과 환산한 값을 출력 예와 같이 소수 둘째자리에서 반올림하여 첫째자리까지 출력하는 프로그램을 작성하시오. (단 1야드 = 91.44cm로 한다.) 

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            System.out.print("yard? ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            double yard = Double.parseDouble(st.nextToken());

            double cm = yard * 91.44;
            bw.write(String.format("%.1fyard = %.1fcm", yard, cm));

            br.close();
            bw.close();
        } catch (IOException e) {

        }
    }
}