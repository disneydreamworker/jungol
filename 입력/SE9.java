package 입력;

import java.io.*;
import java.util.StringTokenizer;

public class SE9 {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            double[] array = new double[3];

            array[0] = Double.parseDouble(st.nextToken());
            array[1] = Double.parseDouble(st.nextToken());
            array[2] = Double.parseDouble(st.nextToken());

            bw.write(String.format("%.3f\n", (array[0])));
            bw.write(String.format("%.3f\n", (array[1])));
            bw.write(String.format("%.3f\n", (array[2])));

            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

