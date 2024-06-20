package javajungsuk_basic_sample;

//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작
//성하시오.
public class p126_4_6 {

  public static void main(String[] args) {
    int cnt = 0;

    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if (j + i == 6) {
          cnt++;
          System.out.println(i + "  " + j);
        }
      }
    }
    System.out.println("눈의 합이 6이되는 경우의 수 : " + cnt);
  }
}
