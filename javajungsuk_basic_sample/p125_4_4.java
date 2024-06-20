package javajungsuk_basic_sample;

public class p125_4_4 {

  public static void main(String[] args) {
    int cnt = 0;
    int result = 0;
    int hund = 100;
    int i = 1;
    int j = -2;

    while (result <= hund) {
      result += i;
      i++;
      result -= j;
      j-=2;
      System.out.println(i + "  " + j + " result : " + result);
      cnt++;
    }

    System.out.println(cnt);
  }
}
