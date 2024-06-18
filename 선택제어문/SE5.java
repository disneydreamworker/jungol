package 선택제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SE5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double input1 = Double.parseDouble(st.nextToken());
        double input2 = Double.parseDouble(st.nextToken());
        if (input1 >= 4.0 && input2 >= 4.0) System.out.println("A");
        else if (input1 >= 3.0 && input2 >= 3.0) System.out.println("B");
        else System.out.println("C");

    }
}
