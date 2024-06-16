package 반복제어문3;

public class P5 {
    public static void main(String[] args) {
        String s = "*";
        for (int i = 1; i <= 9 ; i+=2) {
            System.out.print(" ".repeat((9-i)/2));
            System.out.println(s.repeat(i));
        }
    }
}