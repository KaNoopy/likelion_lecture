package Algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneList {
    public boolean solution(String[] phoneBook) {
        // 1. HashMap 사용
        Map<String, Integer> map = new HashMap<>();

        // 2. 모든 전화번호를 HashMap에 넣기
        for (int i = 0; i < phoneBook.length; i++)
            map.put(phoneBook[i], i);

        // 3. 모든 전화번호의 substring이 HashMap에 존재여부 확인
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;

        return true;
    }
    public static void main(String[] args) {
        String[] numbers = {"12","123","1235","567","88"};
        PhoneList phoneList = new PhoneList();
        phoneList.solution(numbers);
        System.out.println(phoneList.solution(numbers)); // 확인
    }
}
