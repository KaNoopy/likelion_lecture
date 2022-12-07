package Algorithm.java1207;

//스코빌 k 이상 유지
//스코빌 지수가 가장 낮은 두개의 음식섞기
//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
//모든 음식이  스코빌 지수 k이상이 될때까지 반복

//scoville 배열 = leo가 가진 음식의 스코빌 지수
//k = 원하는  스코빌 지수
//return 섞어야하는 최소 횟수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MixScoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        //앞의 2개 섞기
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        while (pq.peek() < K) {
            if (pq.size() == 1)  return -1;

            int mix = pq.poll() + (pq.poll()) * 2;
            pq.offer(mix);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        MixScoville ms = new MixScoville();
        System.out.println(ms.solution(scoville, 7));
    }

}
