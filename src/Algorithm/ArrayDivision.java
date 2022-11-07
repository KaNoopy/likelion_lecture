package Algorithm;

import java.util.ArrayList;

public class ArrayDivision {
    public ArrayList<Integer> solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            } else if (list.size() == 0) {
                list.add(-1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        ArrayDivision a = new ArrayDivision();
        System.out.println(a.solution(arr, 5));
    }

}
