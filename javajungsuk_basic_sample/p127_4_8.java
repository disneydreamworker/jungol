package javajungsuk_basic_sample;

//Math.random( )을 이용해서 1부터 6 사이의 임의의 정수를 변수 value에 저장하는 코드를
//완성하라. (1)에 알맞은 코드를 넣으시오.
public class p127_4_8 {

  public static void main(String[] args) {
    int value = (int) (Math.random() * 6) + 1;
    System.out.println("value:" + value);

    //객체 메소드 실행
    solution();
  }

  public static void solution() {
    int value = (int) (Math.random() * 6) + 1;
    System.out.println("value:" + value);
  }
}

//0.1 0.6 1.2
//0.2 1.2 2.2
//0.9 5.4 6.4