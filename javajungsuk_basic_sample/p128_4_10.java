package javajungsuk_basic_sample;
//다음은 숫자맞히기 게임을 작성한 것이다. 1과 100 사이의 값을 반복적으로 입력해서 컴퓨터
//가 생각한 값을 맞히면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해
//서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞히면 게임이 끝나고 몇 번 만에 숫자를 맞혔
//는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오

import java.util.regex.Pattern;

public class p128_4_10 {

  public static boolean isNumber(String input) {
    //input에 대해 이 사이값인지를 확인하는 정규 표현식
    //문자열만 가능
    return Pattern.matches("^(100|[1-9]?[0-9])$", input);
  }

  public static void main(String[] args) {
    int answer = (int) (Math.random() * 100) + 1;
    String input = "";
    int count = 0;
    int i = 0;
    java.util.Scanner s = new java.util.Scanner(System.in);

    do {
      count++;
      System.out.println("1과 100 사이의 값을 입력하세요");
      input = s.next();

      if (isNumber(input)) {
        i = Integer.parseInt(input);

        if (i > answer) {
          System.out.println("더 작은 수를 입력하세요.");
        } else if (i < answer) {
          System.out.println("더 큰 수를 입력하세요.");
        } else {
          System.out.println("맞췄습니다.");
          System.out.println("시도횟수는 " + count + "번입니다.");
          break;
        }
      } else {
        System.out.println("숫자를 입력해주세요.");
      }
    } while (answer != i);
  }
}

//
//  public static void main(String[] args) {
//    // 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
//    int answer = (int) (Math.random() * 100)+1;
//    System.out.println(answer);
//    int input = 0; // 사용자입력을 저장할 공간
//    int count = 0; // 시도횟수를 세기위한 변수
//
//    // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//    java.util.Scanner s = new java.util.Scanner(System.in);
//    do {
//      count++;
//      System.out.print("1과 100사이의 값을 입력하세요 :");
//      input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
//    } while (input != answer); // 무한반복문
//    System.out.println("맞혔습니다.");
//    System.out.println("시도횟수는 " + count + "번입니다.");
//  }