package LC_Java.반복제어문1;
import java.util.Scanner;
public class SE6 {
    //아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가 해당하는 번호 이외의 숫자가 입력되면 "none"라고 출력한 후 종료하는 프로그램을 작성하시오.
    //* 각 나라의 수도 :
    //대한민국 = 서울(Seoul)
    //미국 = 워싱턴(Washington)
    //일본 = 동경(Tokyo)
    //중국 = 북경(Beijing)
    //* 입출력시 모양은 "예제"와 같이 하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        boolean b = true;
        while(b){
            System.out.print(
                    "1. Korea\n" +
                    "2. USA\n" +
                    "3. Japan\n" +
                    "4. China\n" +
                    "number? ");
            i = sc.nextInt();
            System.out.println();
            switch(i){
                case  1:
                    System.out.println("Seoul");
                    break;
                case 2:
                    System.out.println("Washington");
                    break;
                case 3:
                    System.out.println("Tokyo");
                    break;
                case 4:
                    System.out.println("Beijing");
                    break;
                default:
                    System.out.println("none");
                    b = false;
            }//end switch
        }
    }
}
