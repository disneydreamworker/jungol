package LC_Java.완전탐색;


import java.util.Scanner;

public class 완전탐색_241014_14697_방배정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = sc.nextInt();
        int temp = 0;

        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 300; j++) {
                for (int k = 0; k < 300; k++) {
                    temp = (i * a) + (j * b) + (k * c);
                    if (temp == total) {
                        System.out.println(1);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }
}
