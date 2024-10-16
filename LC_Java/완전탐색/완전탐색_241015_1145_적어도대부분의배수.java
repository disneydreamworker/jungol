package LC_Java.완전탐색;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 완전탐색_241015_1145_적어도대부분의배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = Arrays.stream(nums).reduce(1, (p, n) -> p * n);
        int result = 0;

        for (int i = 1; ; i++) {
            int cnt = 0;
            for (int num : nums) {
                if (i % num == 0) {
                    cnt++;
                }

            }

            if (cnt >= 3) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
