package Algorithm;

public class Eratosthenes4 {
    public boolean solution(int n) {
        //2부터 50까지 숫자가 들어있는 49칸짜리 배열(리스트) 만들기
        int[] nums = new int[0];
        for (int i = 2; i <= n; i++) {
            nums = new int[i];
        }

        //만든 Array크기의 checks배열을 만듭니다.
        int[] checks = new int[nums.length];

        //만든 Array대신 checks배열에 2를 제외한 모든 2의 배수에 false로 바꾸는 로직
        for (int i = 2; i < checks.length; i++) {
            if (i % 2 == 0) {
                return checks[i] = false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //소수만 출력 해보기: checks에 true인 nums[i]만 출력
        Eratosthenes4 eratosthenes3 = new Eratosthenes4();
        eratosthenes3.solution(100);
    }
}
