package Algorithm;

import java.util.Arrays;

public class Prime {
    public int[] solution(int n) {
        int[] answer = {};
        for (int i = 2; i < n-1; i++) {
            if (n%i!=0) {
                answer= new int[]{n};
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        System.out.println(Arrays.toString(prime.solution(13)));
    }
}
