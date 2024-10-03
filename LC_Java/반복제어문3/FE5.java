package LC_Java.반복제어문3;

//자연수 n을 입력받아 "출력 예"와 같이 n줄에 걸처 오른쪽으로 정렬된 삼각형이 출력되는 프로그램을 작성하시오.
//주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
import java.util.Scanner;
class FE5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int blank = 2*n - 2;
        int star = 1;

        for (int i = 1; i <= n ; i++) {
            for (int j=1; j<=blank; j++) {
                System.out.print(" ");
            }
            for (int s=1;s<=star;s++) {
                System.out.print("*");
            }
            blank-=2;
            star+=2;
            System.out.println();
        }
    }
}