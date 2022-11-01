package Algorithm;

//소수 : 1, 자기 자신으로만 나눠지는 수
//방법 1. n의 수를 2~n-1수로 나눠서 remainder가 0이 아니면 소수
//방법 2. n의 수를 n/2미만의 수로 나누어 보는 방법
//방법 3. n의 수를 루트 n까지로 나누어 보는 방법


interface StatementStrategy {
    boolean compare(int a, int b);
}

//class primeStrategy implements StatementStrategy {
//
//    @Override
//    public boolean compare(int a, int b) {
//        return a<b;
//    }
//}
public class PrimeTemplateCallback { //templateCallback 적용 3단계
    public boolean solution(int n, StatementStrategy st) {
        for (int i = 2; st.compare(i, n); i++) {
            if (n % i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeTemplateCallback prime = new PrimeTemplateCallback();
        System.out.println(prime.solution(13, ((a, b) -> a < b))); // 방법 1
        System.out.println(prime.solution(17, ((a, b) -> a < b / 2))); //방법 2
        System.out.println(prime.solution(19, ((a, b) -> a * a < b))); // 방법 3
    }

}
