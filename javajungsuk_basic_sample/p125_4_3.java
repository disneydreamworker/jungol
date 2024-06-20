package javajungsuk_basic_sample;

public class p125_4_3 {

  public static void main(String[] args) {
    //1,3,6,10,
    // 2, 3, 4, 5 씩 더해줌
    int result = 0;
    //누적한 값을 새로 더해주기
    for (int i = 1; i < 11; i++ ) {
      result = result + i;
      System.out.println(result);
    }

  }
}
