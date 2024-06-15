package 선택제어문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SE8 {
//4.0 이상 : "scholarship"
//
//3.0 이상 : "next semester"
//
//2.0 이상 : "seasonal semester"
//
//2.0 미만 : "retake"
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double gpa = Double.parseDouble(st.nextToken());
        int result = (int)gpa;

        //switch case
        switch (result) {
            case 4 :
                System.out.println("scholarship");
                break;
            case 3:
                System.out.println("next semester");
                break;
            case 2:
                System.out.println("seasonal semester");
                break;
            case 1:
                System.out.println("retake");
                break;
        }
        br.close();
    }
}

