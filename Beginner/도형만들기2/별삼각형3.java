package Beginner.도형만들기2;

import java.util.Scanner;

//        *
//         ***
//          *****
//           ******* //공백 3
//          ***** //공백 2
//         ***  //공백 1
//        *   //공백 0
public class 별삼각형3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 1 || n > 100) {
            System.out.println("INPUT ERROR!");
        } else if (n % 2 != 1) {
            System.out.println("INPUT ERROR!");
        } else {
            int b = 0;
            int a = (n / 2) + 1;
            int star = 1; //1,3,5,7,5,3,1

            for (int i = 0; i < n / 2; i++) { //0~3
                System.out.print(" ".repeat(b)); //0,1,2
                System.out.println("*".repeat(star));
                b++;
                star += 2;
            }
            for (int i = 0; i < a; i++) {
                System.out.print(" ".repeat(b)); //3,2,1
                System.out.println("*".repeat(star)); //7,5,3,1
                b--;
                star -= 2;
            }
        }
    }
}
