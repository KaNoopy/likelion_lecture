package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDivision {
    public int[] solution(int[] arr, int divisor) {
        // list조건에 맞게 넣기
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            } else if (list.size() == 0) {
                list.add(-1);
            }
        }
        //list array로 바꾸기
        int[] answer = new int[list.size()];
        int size =0;
        for (Integer nums : list) {
            answer[size++] = nums;
        }
        //오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        ArrayDivision a = new ArrayDivision();
        System.out.println(Arrays.toString(a.solution(arr, 5)));
    }

}
