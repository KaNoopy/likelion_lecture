package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class HateSameNumberStack {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i : arr) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else if (stack.peek()!=i) {
                stack.push(i);
            }
        }
        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >=0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 4, 3, 3};
        HateSameNumberStack hs = new HateSameNumberStack();
        System.out.println(Arrays.toString(hs.solution(nums)));
    }

}
