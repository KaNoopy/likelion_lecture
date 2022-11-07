package Algorithm;

// 1단계 자릿수의 합 구하기
// 나누어 떨어지는 지 check

public class HarshadNumber {
    public boolean solution(int x) {
        boolean answer=true;

        int orginX = x;
        // 자리수의 합 구하기
        int result = 0;
        while (x > 0) {
            result += x % 10;
            x = x / 10;
        }

        //하샤드 수면 true
        if (orginX / result == 0) return answer;
        return answer=false;
    }

    public static void main(String[] args) {
        HarshadNumber harshadNumber = new HarshadNumber();
        System.out.println(harshadNumber.solution(11));
    }
}
