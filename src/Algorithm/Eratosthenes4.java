package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratosthenes4 {
    public static void main(String[] args) {
        //1. 2~50이 들어있는 배열 생성
        int N = 50;
        int[] nums = new int[N - 1];
        for (int i = 2; i <= N; i++) {
            nums[i] = i;
        }

        //2. 2를 제외한 2의  배수 -> 0으로 바꾸기
        for (int i = 0; i <= i+2; i++) {
                nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
