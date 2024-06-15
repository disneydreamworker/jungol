package 선택제어문;
import java.io.*;
public class FE4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.print("Number? ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        switch (num) {
            case 1: bw.write("dog");
            break;
            case 2: bw.write("cat");
            break;
            case 3: bw.write("chick");
            break;
            default: bw.write("I don't know.");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
