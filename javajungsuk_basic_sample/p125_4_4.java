package javajungsuk_basic_sample;

public class p125_4_4 {

  public static void main(String[] args) {
    int cnt = 0;
    int result = 0;
    int hund = 100;
    int i = 1;
    int j = -2;

    while (result < hund) {
      cnt++;
      if(cnt %2==1) {
      result += i;
      i+=2;
      } else {
      result += j;
      j-=2;
      }
//      System.out.println(i + "  " + j + " result : " + result);
    }
    System.out.println(cnt);


    solution();
  }


  public static void solution (){
    int cnt = 1;
    int result = 0;
    while (result < 100) {
      if(cnt%2==0) {
        result += -(cnt);
//        System.out.println(result);
//        System.out.println(cnt);
      } else {
        result += cnt;
//        System.out.println(result);
//        System.out.println(cnt);
      }
      cnt++;
    }
    System.out.println(cnt);
  }
}
