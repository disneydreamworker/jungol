package 입력;

import java.util.Scanner;

public class SE8 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        // Double형으로 저장하면 엔터를 삭제하지 않기 때문에
        // nextLine() 함수로 개행한 후 char를 저장한다
        // char로 바로 받을 수 없기 때문에 String을 받는 nextLine()에서 0번째 캐릭터를 저장한다
        scan.nextLine();
        char c = scan.nextLine().charAt(0);

        System.out.printf("%.2d", a);
        System.out.printf("%.2d", b);
        System.out.printf("%c", c);
    }
}
