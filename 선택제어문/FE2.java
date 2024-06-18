package 선택제어문;
import java.util.Scanner;
public class FE2 {
    //정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0) System.out.println("plus");
        else if( a == 0) System.out.println("zero");
        else System.out.println("minus");
    }
}
