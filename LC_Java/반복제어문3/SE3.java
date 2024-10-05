package LC_Java.반복제어문3;

import java.util.Scanner;
public class SE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "*";
        for(int i = a; i >= 1; i--){
            System.out.println(s.repeat(i));
        }
        for(int i = 1; i <=a; i++){
            System.out.println(s.repeat(i));
        }
    }
}

//        ***
//        **
//        *
//        *
//        **
//        ***