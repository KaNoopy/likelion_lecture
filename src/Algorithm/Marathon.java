package Algorithm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Marathon {

/*    마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    completion의 길이는 participant의 길이보다 1 작습니다.
    참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    참가자 중에는 동명이인이 있을 수 있습니다.*/

    //동명이인 문제해결이 안됨
    public String solution(String[] participant, String[] completion) {

        //particpant map에 넣기 (value 1로 초기화)
        Map<String,Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key =participant[i];
            memo.put(key,1);
        }
        //completion에 들어있는 이름을 key로 검색 , 있으면 0으로 check
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, 0);
        }
        //memo 한바퀴 돌면서 value가 1인 값을 찿습니다.
        //participant에 1명이 남으면 return
        for (String key: memo.keySet()) {
            if (memo.get(key) == 1) {
                return key;
            }
        }
        return "";  // 리턴...?
    }



}
