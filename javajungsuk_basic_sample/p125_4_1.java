package javajungsuk_basic_sample;

//① int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//② char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//③ char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
//④ char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
//⑤ char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//⑥ int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않
//을 때 true인 조건식
//⑦ boolean형 변수 powerOn가 false일 때 true인 조건식
//⑧ 문자열 참조변수 str이 "yes"일 때 true인 조건식
public class p125_4_1 {

  public static void main(String[] args) {
    //객체 생성
    p125_4_1 p = new p125_4_1();

    boolean answer = true;
    char ch = 'a';
    int year = 4000;
    boolean powerOn = false;
    String str = "no";

    //1.
    int x = 1;
    if (x > 10 && x < 20) {
      answer = true;
    }
    System.out.print("1번 : ");
    p.printAnswer(answer);
    //2.
    String temp = p.makeString(ch);
    answer = !temp.equals(" ") && !temp.equals("\t");
    System.out.print("2번 : ");
    p.printAnswer(answer);
    //3.
    temp = p.makeString(ch);
    answer = temp.equals("x") || temp.equals("X");
    System.out.print("3번 : ");
    p.printAnswer(answer);
    //4.
    answer = ch >= 0 && ch <= 9;
    System.out.print("4번 : ");
    p.printAnswer(answer);
    //5.
    answer = ((int) ch >= 'A' && (int) ch <= 'z');
    System.out.print("5번 : ");
    p.printAnswer(answer);
    //6.
    answer = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    System.out.print("6번 : ");
    p.printAnswer(answer);
    //7.
    answer = !powerOn;
    System.out.print("7번 : ");
    p.printAnswer(answer);
    //8.
    answer = str.equals("yes");
    System.out.print("8번 : ");
    p.printAnswer(answer);
  }

  //String.valueOf method
  String makeString(char ch) {
    return String.valueOf(ch);
  }
  //print method
  void printAnswer(boolean answer) {
    System.out.println(answer);
  }
}
