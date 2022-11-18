package Algorithm;

//시저암호란
//- 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
//- 문자열 s와 거리n을 입력받아 s를 n만큼 민 암호문을 만드는 함수만들기

//대소문자 판별
//n만큼 밀기

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c==' ') { //공백
                answer += c;
                continue;
            if (c >= 'a' && c <= 'z') {
                if (c+n>'z') {
                    answer += (char)c-26+n;
                } else {
                    answer += (char)c+n;
                }
            }
            if (c >= 'A' && c <= 'B') {
                answer += (char)-26+n;
            }else {
                    answer += (char)c+n;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        System.out.println(cc.solution("z",4));
    }
}
