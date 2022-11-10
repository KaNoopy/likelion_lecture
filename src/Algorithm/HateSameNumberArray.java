package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HateSameNumberArray {
    public int[] solution(int[] arr) {

        List<Integer> answerList = new ArrayList<>();

        answerList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            // list의 마지막 번째와 arr의 현재 값 비교
            if(answerList.get(answerList.size() - 1) != arr[i]) answerList.add(arr[i]);
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {4,4,4,3,3};
        HateSameNumberArray hs = new HateSameNumberArray();
        System.out.println(Arrays.toString(hs.solution(nums)));
    }

}
