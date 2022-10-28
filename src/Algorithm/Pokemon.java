package Algorithm;
/*
최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다.
N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때,
N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아,
그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.HashMap;

//1.hashmap으로 중복된것 체크
//2.haspmap으로 키의 개수 추출
public class Pokemon {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> mon = new HashMap<>();
        for (int m:nums) {
            mon.put(m, mon.getOrDefault(m, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
