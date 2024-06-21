package javajungsuk_basic_sample;

//int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만
//일 변수 num의 값이 12345라면, ‘1 + 2 + 3 + 4 + 5’의 결과인 15를 출력하라. (1)에 알맞은 코드를 넣으
//시오.
//문자열로 변환하지 말고 숫자로만 처리해야 한다.

import java.util.regex.Pattern;

public class p127_4_9 {

  public static void solution() {
    int num = 12345;
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      System.out.println(sum);
      num /= 10;
    }
    System.out.println("sum=" + sum);
  }

  public static void main(String[] args) {
    solution();
  }
}

//    int num = 12345;
//    int temp = num;
//    int sum = 0;
//    int digit = 0;
//    int tens = 1;
//
//    digit = String.valueOf(num).length();
//
//    for (int i = 1; i < digit; i++) {
//      tens = tens * 10;
//    }
//    for (int i = 0; i < digit; i++) {
//      int d = num / tens;
//      sum = sum + d;
//      num = num - d * tens;
//      System.out.println(num);
//
//      tens = tens / 10;
//    }
//    System.out.println(sum);


