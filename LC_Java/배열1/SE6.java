package LC_Java.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
public class SE6 {

  public static void main(String[] args) throws IOException {
    int k = 0;
    int min = Integer.MAX_VALUE;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    while (st.hasMoreTokens()){
      k = Integer.parseInt(st.nextToken());
      min = Math.min(min, k);
    }
    System.out.println(min);
  }
}