package Algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class HateSameNumber {
    public List<Integer> solution(List<Integer> arr) {

        List<Integer> newlist=arr.stream().distinct().collect(Collectors.toList());

        return newlist;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,1,3,3,0,1,1);
        HateSameNumber hs = new HateSameNumber();
        System.out.println(hs.solution(nums));
    }

}
