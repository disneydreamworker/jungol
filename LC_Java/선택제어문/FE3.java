package LC_Java.선택제어문;

import java.time.Year;
import java.io.*;


public class FE3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Year.of(year).isLeap() ? "leap year" : "common year");

        bw.flush();
        bw.close();
        br.close();
    }

}
