package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes2 {
    public int solution(int n){
        //2부터 50까지 숫자가 들어있는 49칸짜리 배열(리스트) 만들기
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            nums.add(i);
        }
        //만든 배열에서 모든 배수 지우기
        for (int j = 2; j * j <= n; j++ ) {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) % j == 0 && nums.get(i) > j) {
                    nums.remove(i);
                }
            }
        }
        return nums.size();
    }
//        nums.removeIf(nums -> nums % 2 == 0 && nums != 2); 써보고싶다!!!
}
