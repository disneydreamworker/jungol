package 선택제어문;

import java.time.YearMonth;
import java.util.Scanner;

public class FE5 {
    public static void main(String[] args) {
        //1~12사이의 정수를 입력받아 평년의 경우 입력받은 월의 날수를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int days = 0;

        YearMonth yearMonth = YearMonth.of(2021, month);
        days = yearMonth.lengthOfMonth();
        System.out.println(days);
    }
}