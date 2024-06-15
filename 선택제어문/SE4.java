package 선택제어문;

import java.io.*;
import java.util.StringTokenizer;

public class SE4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String print = "";

        double weight = Double.parseDouble(st.nextToken());

        if (weight<=50.80) print = "Flyweight";
        else if (weight > 50.80 && weight <= 61.23) print = "Lightweight";
        else if (weight > 61.23 && weight <= 72.57) print = "Middleweight";
        else if (weight > 72.57 && weight <= 88.45) print = "Cruiserweight";
        else if (weight > 88.45) print = "Heavyweight";
        bw.write(print);

        bw.flush();
        bw.close();
        br.close();
    }
}
