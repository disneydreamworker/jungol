package 배열1;

public class SE1 {
  public static void main(String[] args) {
    java.util.Scanner s = new java.util.Scanner(System.in);

    char[] arry = new char[10];

    for (int i = 0; i < 10; i++) {
      arry[i] = s.next().charAt(0);
      System.out.print(arry[i]);
    }
  }
}
