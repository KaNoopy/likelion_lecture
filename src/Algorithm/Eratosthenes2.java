package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes2 {

    public static void main(String[] args) {

        //2부터 50까지 숫자가 들어있는 49칸짜리 배열(리스트) 만들기
        int n = 50;
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            nums.add(i);
        }
        //만든 배열에서 2를 제외한 모든 2의 배수 지우기
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && nums.get(i) != 2) {
                nums.remove(i);
            }
        }

//        nums.removeIf(nums -> nums % 2 == 0 && nums != 2); 써보고싶다!!!
        //배열에 있는 원소의 개수, 원소 출력해보기
        System.out.println(nums);
        System.out.println(nums.size());
    }
}
