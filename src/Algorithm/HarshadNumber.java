package Algorithm;

// 1단계 자릿수의 합 구하기
// 나누어 떨어지는 지 check

public class HarshadNumber {

    public static void main(String[] args) {
        // 자리수의 합 구하기
        int n =687;
        int result=0;
        while (n > 0) {
            result += n%10;
            n = n/10;
        }

        System.out.println(result);
        System.out.println(n);
    }
}
