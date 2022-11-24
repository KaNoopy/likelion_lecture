package Algorithm.RecursiveFunction;

public class Fibonacci {
    public static int fib(int n) {
        //1, 2번째는 1이기 때문에 탈출하는 조건으로 설정
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int r = fib(6); //n번째 수
        System.out.println(r);
    }
}
