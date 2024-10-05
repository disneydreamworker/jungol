package LC_Java.선택제어문;

import java.io.*;

public class SE1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(input));
        bw.newLine();
        bw.write((input < 0 ? "minus" : ""));

        bw.flush();
        bw.close();
        br.close();

    }
}
