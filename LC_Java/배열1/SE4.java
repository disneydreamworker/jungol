package LC_Java.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가
//0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를
// 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
public class SE4 {

  public static void main(String[] args) throws IOException {
    int[] arr = new int[100];

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int cnt = 0;
    while (true) {
      int num = Integer.parseInt(st.nextToken());
      if (num == 0) {
        break;
      }
      arr[cnt] = num;
      cnt++;
      if (cnt >= 100) {
        break;
      }
    }
    for (int i = cnt-1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}
