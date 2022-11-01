package Algorithm;

import java.util.Arrays;

//소수 : 1, 자기 자신으로만 나눠지는 수
//방법 1. n의 수를 2~n-1수로 나눠서 remainder가 0이 아니면 소수
//방법 2. n의 수를 n/2미만의 수로 나누어 보는 방법
//방법 3. n의 수를 루트 n까지로 나누어 보는 방법
public class Prime { //문제에서 int로 받으라고해서 수정
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n-1; i++) {
            if (n%i!=0) {
                answer= n;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        System.out.println(prime.solution(13));
    }
}
