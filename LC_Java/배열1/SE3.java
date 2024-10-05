package LC_Java.배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
public class SE3 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());

    char[] arr = new char [10];

    for(int i=0;i<10;i++) {
      arr[i] = st.nextToken().charAt(0);

      if(i==0||i==3||i==6){
        System.out.print(arr[i]+" ");
      }
    }
  }
}
